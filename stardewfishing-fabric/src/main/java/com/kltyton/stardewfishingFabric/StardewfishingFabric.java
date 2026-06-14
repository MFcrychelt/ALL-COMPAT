package com.kltyton.stardewfishingFabric;

import com.kltyton.stardewfishingFabric.common.CommonEvents;
import com.kltyton.stardewfishingFabric.common.networking.SFNetworking;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class StardewfishingFabric implements ModInitializer {
    public static final String MODID = "stardew_fishing";
    public static final TagKey<Item> STARTS_MINIGAME = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(MODID, "starts_minigame"));

    public static final SoundEvent CAST = registerSound("cast");
    public static final SoundEvent COMPLETE = registerSound("complete");
    public static final SoundEvent DWOP = registerSound("dwop");
    public static final SoundEvent FISH_ESCAPE = registerSound("fish_escape");
    public static final SoundEvent FISH_BITE = registerSound("fish_bite");
    public static final SoundEvent FISH_HIT = registerSound("fish_hit");
    public static final SoundEvent PULL_ITEM = registerSound("pull_item");
    public static final SoundEvent REEL_CREAK = registerSound("reel_creak");
    public static final SoundEvent REEL_FAST = registerSound("reel_fast");
    public static final SoundEvent REEL_SLOW = registerSound("reel_slow");

    @Override
    public void onInitialize() {
        SFNetworking.register();
        CommonEvents.initialize();
    }

    private static SoundEvent registerSound(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MODID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }
}
