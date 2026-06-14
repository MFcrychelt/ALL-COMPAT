package com.kltyton.stardewfishingFabric.common.networking;

import com.kltyton.stardewfishingFabric.StardewfishingFabric;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public record C2SCompleteMinigamePacket(boolean success, double accuracy) implements CustomPacketPayload {
    public static final CustomPacketPayload.Type<C2SCompleteMinigamePacket> TYPE = new CustomPacketPayload.Type<>(Identifier.fromNamespaceAndPath(StardewfishingFabric.MODID, "complete_minigame"));
    public static final StreamCodec<RegistryFriendlyByteBuf, C2SCompleteMinigamePacket> CODEC = CustomPacketPayload.codec(
            C2SCompleteMinigamePacket::write,
            C2SCompleteMinigamePacket::new
    );

    public C2SCompleteMinigamePacket(RegistryFriendlyByteBuf buf) {
        this(buf.readBoolean(), buf);
    }

    private C2SCompleteMinigamePacket(boolean succ, RegistryFriendlyByteBuf buf) {
        this(succ, succ ? buf.readDouble() : -1);
    }

    public void write(RegistryFriendlyByteBuf buf) {
        buf.writeBoolean(success);
        if (success) buf.writeDouble(accuracy);
    }

    @Override
    public CustomPacketPayload.Type<C2SCompleteMinigamePacket> type() {
        return TYPE;
    }
}
