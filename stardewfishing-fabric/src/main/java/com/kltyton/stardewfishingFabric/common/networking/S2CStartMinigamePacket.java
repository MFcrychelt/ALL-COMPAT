package com.kltyton.stardewfishingFabric.common.networking;

import com.kltyton.stardewfishingFabric.StardewfishingFabric;
import com.kltyton.stardewfishingFabric.common.FishBehavior;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public record S2CStartMinigamePacket(FishBehavior behavior) implements CustomPacketPayload {
    public static final CustomPacketPayload.Type<S2CStartMinigamePacket> TYPE = new CustomPacketPayload.Type<>(Identifier.fromNamespaceAndPath(StardewfishingFabric.MODID, "start_minigame"));
    public static final StreamCodec<RegistryFriendlyByteBuf, S2CStartMinigamePacket> CODEC = CustomPacketPayload.codec(
            S2CStartMinigamePacket::write,
            S2CStartMinigamePacket::new
    );

    public S2CStartMinigamePacket(RegistryFriendlyByteBuf buf) {
        this(new FishBehavior(buf));
    }

    public void write(RegistryFriendlyByteBuf buf) {
        behavior.writeToBuffer(buf);
    }

    @Override
    public CustomPacketPayload.Type<S2CStartMinigamePacket> type() {
        return TYPE;
    }
}
