package com.wdiscute.starcatcher;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class SCTags {
    public static final Identifier IS_COLD_LAKE = Starcatcher.rl("is_cold_lake");
    public static final Identifier IS_COLD_RIVER = Starcatcher.rl("is_cold_river");
    public static final Identifier IS_COLD_OCEAN = Starcatcher.rl("is_cold_ocean");

    public static final Identifier IS_WARM_LAKE = Starcatcher.rl("is_warm_lake");
    public static final Identifier IS_WARM_RIVER = Starcatcher.rl("is_warm_river");
    public static final Identifier IS_WARM_OCEAN = Starcatcher.rl("is_warm_ocean");

    public static final Identifier IS_OCEAN = Starcatcher.rl("is_ocean");
    public static final Identifier IS_NORMAL_OCEAN = Starcatcher.rl("is_normal_ocean");
    public static final Identifier IS_LUKEWARM_OCEAN = Starcatcher.rl("is_lukewarm_ocean");
    public static final Identifier IS_DEEP_OCEAN = Starcatcher.rl("is_deep_ocean");
    public static final Identifier IS_RIVER = Starcatcher.rl("is_river");

    public static final Identifier IS_BEACH = Starcatcher.rl("is_beach");
    public static final Identifier IS_SWAMP = Starcatcher.rl("is_swamp");
    public static final Identifier IS_CHERRY_GROVE = Starcatcher.rl("is_cherry_grove");
    public static final Identifier IS_MUSHROOM_FIELDS = Starcatcher.rl("is_mushroom_fields");
    public static final Identifier IS_DARK_FOREST = Starcatcher.rl("is_dark_forest");
    public static final Identifier IS_BIRCH_FOREST = Starcatcher.rl("is_birch_forest");

    public static final Identifier IS_CRIMSON_FOREST = Starcatcher.rl("is_crimson_forest");
    public static final Identifier IS_WARPED_FOREST = Starcatcher.rl("is_warped_forest");
    public static final Identifier IS_SOUL_SAND_VALLEY = Starcatcher.rl("is_soul_sand_valley");
    public static final Identifier IS_BASALT_DELTAS = Starcatcher.rl("is_basalt_deltas");

    public static final TagKey<Item> TACKLE_BOXES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("tackle_boxes"));
    public static final TagKey<Item> HOOKS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("hooks"));
    public static final TagKey<Item> BOBBERS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("bobbers"));
    public static final TagKey<Item> BAITS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("baits"));
    public static final TagKey<Item> TACKLE_SKINS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("tackle_skins"));
    public static final TagKey<Item> TEMPLATES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("templates"));
    public static final TagKey<Item> EQUIPMENTS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("equipments"));
    public static final TagKey<Item> GADGETS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("gadgets"));
    public static final TagKey<Item> HATS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("hats"));

    public static final TagKey<Item> AQUARIUM_INTERACTIONS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("aquarium_guide_display"));

    public static final TagKey<Item> PLACEABLE_IN_DISPLAY = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("placeable_in_display"));
    public static final TagKey<Item> PLACEABLE_IN_TACKLE_BOX = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("placeable_in_tackle_box"));
    public static final TagKey<Item> PLACEABLE_IN_TACKLE_BOX_FISH_SLOT = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("placeable_in_tackle_box_fish_slot"));
    public static final TagKey<Item> WORMS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("worms"));

    public static final TagKey<Item> RODS = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("rods"));

    public static final TagKey<Item> BUCKETABLE_FISHES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("bucketable_fishes"));
    public static final TagKey<Item> STARCAUGHT_FISHES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("starcaught_fishes"));

    public static final TagKey<Item> TRASH = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("trash"));

    public static final TagKey<Item> COMMON_FISHES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("common_fishes"));
    public static final TagKey<Item> UNCOMMON_FISHES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("uncommon_fishes"));
    public static final TagKey<Item> RARE_FISHES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("rare_fishes"));
    public static final TagKey<Item> EPIC_FISHES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("epic_fishes"));
    public static final TagKey<Item> LEGENDARY_FISHES = TagKey.create(BuiltInRegistries.ITEM.key(), Starcatcher.rl("legendary_fishes"));
}
