package com.kltyton.stardewfishingFabric.common;

import com.kltyton.stardewfishingFabric.common.networking.S2CStartMinigamePacket;
import com.kltyton.stardewfishingFabric.common.networking.SFNetworking;
import com.kltyton.stardewfishingFabric.server.FishBehaviorReloadListener;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

import java.lang.reflect.Method;

public class FishingHookLogic {
    public static void startMinigame(ServerPlayer player, ItemStack item) {
        if (player.fishing == null) {
            return;
        }
        FishBehavior behavior = FishBehaviorReloadListener.getBehavior(item);
        if (behavior != null) {
            S2CStartMinigamePacket packet = new S2CStartMinigamePacket(behavior);
            SFNetworking.sendToPlayer(player, packet);
        }
    }

    public static boolean endMinigame(ServerPlayer player, boolean success, double accuracy, FishingHook hook, ItemStack items) {
        if (success && !player.level().isClientSide()) {
            boolean handledByFishingReal = false;
            if (FabricLoader.getInstance().isModLoaded("fishingreal")) {
                try {
                    Class<?> fishingReal = Class.forName("koala.fishingreal.FishingReal");
                    Method convertMethod = fishingReal.getMethod("convertItemStack", ItemStack.class, Player.class, Vec3.class);
                    Entity convertedEntity = (Entity) convertMethod.invoke(null, items, player, hook.position());
                    if (convertedEntity != null) {
                        Method fishUpMethod = fishingReal.getMethod("fishUpEntity", Entity.class, FishingHook.class, ItemStack.class, Player.class);
                        fishUpMethod.invoke(null, convertedEntity, hook, items, player);
                        handledByFishingReal = true;
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (!handledByFishingReal) {
                ItemEntity itemEntity = new ItemEntity(hook.level(), hook.getX(), hook.getY(), hook.getZ(), items);
                double d = player.getX() - hook.getX();
                double e = player.getY() - hook.getY();
                double f = player.getZ() - hook.getZ();
                itemEntity.setDeltaMovement(d * 0.1, e * 0.1 + Math.sqrt(Math.sqrt(d * d + e * e + f * f)) * 0.08, f * 0.1);
                hook.level().addFreshEntity(itemEntity);

                if (items.is(ItemTags.FISHES)) {
                    player.awardStat(Stats.FISH_CAUGHT, 1);
                }
            }

            if (FabricLoader.getInstance().isModLoaded("jobsaddon")) {
                try {
                    Class<?> jobHelper = Class.forName("net.jobsaddon.jobs.JobHelper");
                    Method addXpMethod = jobHelper.getMethod("addFisherXp", ServerPlayer.class, ItemStack.class);
                    addXpMethod.invoke(null, player, items);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            player.level().addFreshEntity(new ExperienceOrb(player.level(), player.getX(), player.getY() + 0.5, player.getZ() + 0.5, hook.random.nextInt(6) + 1));
            FishingDataStorage.clearDataForPlayer(player);
        }

        if (player.fishing != null) {
            player.fishing.discard();
        }
        return success;
    }
}
