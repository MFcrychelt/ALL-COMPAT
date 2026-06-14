package com.kltyton.stardewfishingFabric.mixin;

import com.kltyton.stardewfishingFabric.StardewfishingFabric;
import com.kltyton.stardewfishingFabric.common.FishingDataStorage;
import com.kltyton.stardewfishingFabric.common.FishingHookLogic;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FishingHook.class)
public abstract class FishingHookMixin {
    @Unique
    private boolean stardewMinigameActive = false;

    @WrapOperation(method = "retrieve", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/storage/loot/LootTable;getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;"))
    private ObjectArrayList<ItemStack> wrapGetRandomItems(LootTable instance, LootParams params, Operation<ObjectArrayList<ItemStack>> original) {
        ObjectArrayList<ItemStack> list = original.call(instance, params);
        FishingHook hook = (FishingHook) (Object) this;
        ServerPlayer serverPlayer = (ServerPlayer) hook.getPlayerOwner();
        if (serverPlayer == null || list.isEmpty()) {
            return list;
        }

        ItemStack items = list.get(0);
        String name = items.getItem().toString().toLowerCase();

        boolean startsMinigame = items.is(StardewfishingFabric.STARTS_MINIGAME) ||
                items.is(net.minecraft.tags.ItemTags.FISHES) ||
                name.contains("fish") ||
                name.contains("salmon") ||
                name.contains("cod") ||
                name.contains("boreal") ||
                name.contains("tuna") ||
                name.contains("perch") ||
                name.contains("pike") ||
                name.contains("snapper") ||
                name.contains("carp") ||
                name.contains("chub") ||
                name.contains("trout") ||
                name.contains("bream") ||
                name.contains("sturgeon") ||
                name.contains("herring") ||
                name.contains("koi") ||
                name.contains("bass") ||
                name.contains("obidontiee") ||
                name.contains("elderscale") ||
                name.contains("driftfin") ||
                name.contains("rockgill") ||
                name.contains("peakdweller") ||
                name.contains("morganite") ||
                name.contains("vesani") ||
                name.contains("carpenjoe") ||
                name.contains("darter") ||
                name.contains("bluegigi") ||
                name.contains("joel") ||
                name.contains("gold_fan") ||
                name.contains("whiteveil") ||
                name.contains("amethystback") ||
                name.contains("dripfin") ||
                name.contains("vivid_moss") ||
                name.contains("quarrish") ||
                name.contains("mackerel") ||
                name.contains("ward") ||
                name.contains("glowing_dark") ||
                name.contains("suneater") ||
                name.contains("seeker") ||
                name.contains("willish") ||
                name.contains("cerberay") ||
                name.contains("end_glow") ||
                name.contains("voidbiter");

        if (startsMinigame) {
            this.stardewMinigameActive = true;
            FishingDataStorage.storeData(serverPlayer, hook, items);
            FishingHookLogic.startMinigame(serverPlayer, items);
            return new ObjectArrayList<>();
        }

        return list;
    }

    @Inject(method = "retrieve", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;level()Lnet/minecraft/world/level/Level;"), cancellable = true)
    private void cancelXpAndStats(ItemStack stack, CallbackInfoReturnable<Integer> cir) {
        if (this.stardewMinigameActive) {
            this.stardewMinigameActive = false;
            cir.setReturnValue(1);
        }
    }
}
