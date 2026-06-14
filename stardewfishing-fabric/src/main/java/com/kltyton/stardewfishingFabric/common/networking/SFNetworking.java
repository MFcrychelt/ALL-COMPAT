package com.kltyton.stardewfishingFabric.common.networking;

import com.kltyton.stardewfishingFabric.client.ClientEvents;
import com.kltyton.stardewfishingFabric.common.FishBehavior;
import com.kltyton.stardewfishingFabric.common.FishingDataStorage;
import com.kltyton.stardewfishingFabric.common.FishingHookLogic;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;

public class SFNetworking {
    public static void register() {
        PayloadTypeRegistry.serverboundPlay().register(C2SCompleteMinigamePacket.TYPE, C2SCompleteMinigamePacket.CODEC);
        PayloadTypeRegistry.clientboundPlay().register(S2CStartMinigamePacket.TYPE, S2CStartMinigamePacket.CODEC);

        ServerPlayNetworking.registerGlobalReceiver(C2SCompleteMinigamePacket.TYPE, (payload, context) -> {
            boolean success = payload.success();
            double accuracy = payload.accuracy();
            ServerPlayer player = context.player();

            FishingHook hook = FishingDataStorage.getHookForPlayer(player);
            ItemStack items = FishingDataStorage.getItemsForPlayer(player);

            context.server().execute(() -> FishingHookLogic.endMinigame(player, success, accuracy, hook, items));
        });
    }

    public static void registerClient() {
        ClientPlayNetworking.registerGlobalReceiver(S2CStartMinigamePacket.TYPE, (payload, context) -> {
            FishBehavior behavior = payload.behavior();
            context.client().execute(() -> ClientEvents.openFishingScreen(behavior));
        });
    }

    public static void sendToPlayer(ServerPlayer player, S2CStartMinigamePacket packet) {
        ServerPlayNetworking.send(player, packet);
    }

    public static void sendToServer(C2SCompleteMinigamePacket packet) {
        ClientPlayNetworking.send(packet);
    }
}
