package com.wdiscute.starcatcher.registry;

import com.wdiscute.starcatcher.DeferredItem;
import com.wdiscute.starcatcher.DeferredRegister;
import com.wdiscute.starcatcher.Starcatcher;
import com.wdiscute.starcatcher.guide.FishingGuideItem;
import com.wdiscute.starcatcher.registry.items.*;
import com.wdiscute.starcatcher.registry.items.helper.BasicItem;
import com.wdiscute.starcatcher.registry.items.helper.FireResistantBasicItem;
import com.wdiscute.starcatcher.registry.items.helper.SingleStackBasicItem;
import com.wdiscute.starcatcher.registry.items.rod.StarcatcherFishingRodItem;
import com.wdiscute.starcatcher.secretnotes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;

public interface SCItems {
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(Starcatcher.MOD_ID);
    DeferredRegister.Items BUCKETABLE_FISHES_REGISTRY = DeferredRegister.createItems(Starcatcher.MOD_ID);
    DeferredRegister.Items TEMPLATES_REGISTRY = DeferredRegister.createItems(Starcatcher.MOD_ID);
    DeferredRegister.Items RODS_REGISTRY = DeferredRegister.createItems(Starcatcher.MOD_ID);
    DeferredRegister.Items HOOKS_REGISTRY = DeferredRegister.createItems(Starcatcher.MOD_ID);
    DeferredRegister.Items BOBBERS_REGISTRY = DeferredRegister.createItems(Starcatcher.MOD_ID);

    DeferredItem<Item> MISSINGNO = (DeferredItem) ITEMS.register("missingno", BasicItem::new);
    DeferredItem<Item> UNKNOWN_FISH = (DeferredItem) ITEMS.register("unknown_fish", BasicItem::new);

    DeferredItem<Item> GUIDE = (DeferredItem) ITEMS.register("starcatcher_guide", FishingGuideItem::new);

    DeferredItem<Item> FISH_RADAR = (DeferredItem) ITEMS.register("fish_radar", SingleStackBasicItem::new);
    DeferredItem<Item> STARCATCHER_TWINE = (DeferredItem) ITEMS.register("starcatcher_twine", SingleStackBasicItem::new);

    DeferredItem<Item> SETTINGS = (DeferredItem) ITEMS.register("settings", BasicItem::new);

    DeferredItem<Item> HOOK = (DeferredItem) HOOKS_REGISTRY.register("hook", SingleStackBasicItem::new);
    DeferredItem<Item> AMETHYST_HOOK = (DeferredItem) HOOKS_REGISTRY.register("amethyst_hook", SingleStackBasicItem::new);
    DeferredItem<Item> SHINY_HOOK = (DeferredItem) HOOKS_REGISTRY.register("shiny_hook", SingleStackBasicItem::new);
    DeferredItem<Item> GOLD_HOOK = (DeferredItem) HOOKS_REGISTRY.register("gold_hook", SingleStackBasicItem::new);
    DeferredItem<Item> MOSSY_HOOK = (DeferredItem) HOOKS_REGISTRY.register("mossy_hook", SingleStackBasicItem::new);
    DeferredItem<Item> STONE_HOOK = (DeferredItem) HOOKS_REGISTRY.register("stone_hook", SingleStackBasicItem::new);
    DeferredItem<Item> SPLIT_HOOK = (DeferredItem) HOOKS_REGISTRY.register("split_hook", SingleStackBasicItem::new);
    DeferredItem<Item> HEAVY_HOOK = (DeferredItem) HOOKS_REGISTRY.register("heavy_hook", SingleStackBasicItem::new);
    DeferredItem<Item> VANILLA_HOOK = (DeferredItem) HOOKS_REGISTRY.register("vanilla_hook", SingleStackBasicItem::new);
    DeferredItem<Item> COPPER_HOOK = (DeferredItem) HOOKS_REGISTRY.register("copper_hook", SingleStackBasicItem::new);
    DeferredItem<Item> EXPOSED_COPPER_HOOK = (DeferredItem) HOOKS_REGISTRY.register("exposed_copper_hook", SingleStackBasicItem::new);
    DeferredItem<Item> WEATHERED_COPPER_HOOK = (DeferredItem) HOOKS_REGISTRY.register("weathered_copper_hook", SingleStackBasicItem::new);
    DeferredItem<Item> OXIDISED_COPPER_HOOK = (DeferredItem) HOOKS_REGISTRY.register("oxidised_copper_hook", SingleStackBasicItem::new);
    DeferredItem<Item> ECHOING_HOOK = (DeferredItem) HOOKS_REGISTRY.register("echoing_hook", SingleStackBasicItem::new);
    DeferredItem<Item> FROZEN_HOOK = (DeferredItem) HOOKS_REGISTRY.register("frozen_hook", SingleStackBasicItem::new);

    DeferredItem<Item> BOBBER = (DeferredItem) BOBBERS_REGISTRY.register("bobber", SingleStackBasicItem::new);
    DeferredItem<Item> STEADY_BOBBER = (DeferredItem) BOBBERS_REGISTRY.register("steady_bobber", SingleStackBasicItem::new);
    DeferredItem<Item> CLEAR_BOBBER = (DeferredItem) BOBBERS_REGISTRY.register("clear_bobber", SingleStackBasicItem::new);
    DeferredItem<Item> AQUA_BOBBER = (DeferredItem) BOBBERS_REGISTRY.register("aqua_bobber", SingleStackBasicItem::new);
    DeferredItem<Item> VANILLA_BOBBER = (DeferredItem) BOBBERS_REGISTRY.register("vanilla_bobber", SingleStackBasicItem::new);
    DeferredItem<Item> LEAF_BOBBER = (DeferredItem) BOBBERS_REGISTRY.register("leaf_bobber", SingleStackBasicItem::new);
    DeferredItem<Item> SLIMEY_BOBBER = (DeferredItem) BOBBERS_REGISTRY.register("slimey_bobber", SingleStackBasicItem::new);

    DeferredItem<Item> WORM = (DeferredItem) ITEMS.register("worm", BasicItem::new);
    DeferredItem<Item> ALMIGHTY_WORM = (DeferredItem) ITEMS.register("almighty_worm", BasicItem::new);
    DeferredItem<Item> SEEKING_WORM = (DeferredItem) ITEMS.register("seeking_worm", BasicItem::new);
    DeferredItem<Item> DEV_WORM = (DeferredItem) ITEMS.register("dev_worm", BasicItem::new);

    DeferredItem<Item> GUNPOWDER_BAIT = (DeferredItem) ITEMS.register("gunpowder_bait", BasicItem::new);
    DeferredItem<Item> CHERRY_BAIT = (DeferredItem) ITEMS.register("cherry_bait", BasicItem::new);
    DeferredItem<Item> LUSH_BAIT = (DeferredItem) ITEMS.register("lush_bait", BasicItem::new);
    DeferredItem<Item> SCULK_BAIT = (DeferredItem) ITEMS.register("sculk_bait", BasicItem::new);
    DeferredItem<Item> DRIPSTONE_BAIT = (DeferredItem) ITEMS.register("dripstone_bait", BasicItem::new);
    DeferredItem<Item> MURKWATER_BAIT = (DeferredItem) ITEMS.register("murkwater_bait", BasicItem::new);
    DeferredItem<Item> LEGENDARY_BAIT = (DeferredItem) ITEMS.register("legendary_bait", BasicItem::new);
    DeferredItem<Item> METEOROLOGICAL_BAIT = (DeferredItem) ITEMS.register("meteorological_bait", BasicItem::new);

    DeferredItem<Item> PEARL_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("pearl_smithing_template", BasicItem::new);
    DeferredItem<Item> KIMBE_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("kimbe_smithing_template", BasicItem::new);
    DeferredItem<Item> COLORFUL_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("colorful_smithing_template", BasicItem::new);
    DeferredItem<Item> CLEAR_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("clear_smithing_template", BasicItem::new);
    DeferredItem<Item> FROG_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("frog_smithing_template", BasicItem::new);
    DeferredItem<Item> KING_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("king_smithing_template", BasicItem::new);

    DeferredItem<Item> NATURALIST_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("naturalist_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> ICEBORN_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("iceborn_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> MAGMAFORGED_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("magmaforged_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> SLIMED_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("slimed_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> SHARKTOOTH_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("sharktooth_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> AZURE_CRYSTAL_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("azure_crystal_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> BAMBOO_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("bamboo_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> OBSIDIAN_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("obsidian_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> ALPHA_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("alpha_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> GOOD_OLD_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("good_old_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> BONER_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("boner_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> SKY_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("sky_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> LUSH_GLOWBERRY_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("lush_glowberry_skin_smithing_template", BasicItem::new);
    DeferredItem<Item> HUMBLE_SKIN_SMITHING_TEMPLATE = (DeferredItem) TEMPLATES_REGISTRY.register("humble_skin_smithing_template", BasicItem::new);

    DeferredItem<Item> ROD = (DeferredItem) RODS_REGISTRY.register("starcatcher_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> NATURALIST_ROD = (DeferredItem) RODS_REGISTRY.register("naturalist_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> ICEBORN_ROD = (DeferredItem) RODS_REGISTRY.register("iceborn_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> MAGMAFORGED_ROD = (DeferredItem) RODS_REGISTRY.register("magmaforged_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> SLIMED_ROD = (DeferredItem) RODS_REGISTRY.register("slimed_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> SHARKTOOTH_ROD = (DeferredItem) RODS_REGISTRY.register("sharktooth_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> AZURE_CRYSTAL_ROD = (DeferredItem) RODS_REGISTRY.register("azure_crystal_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> GOOD_OLD_ROD = (DeferredItem) RODS_REGISTRY.register("good_old_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> BAMBOO_ROD = (DeferredItem) RODS_REGISTRY.register("bamboo_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> OBSIDIAN_ROD = (DeferredItem) RODS_REGISTRY.register("obsidian_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> ALPHA_ROD = (DeferredItem) RODS_REGISTRY.register("alpha_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> BONER_ROD = (DeferredItem) RODS_REGISTRY.register("boner_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> SKY_ROD = (DeferredItem) RODS_REGISTRY.register("sky_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> LUSH_GLOWBERRY_ROD = (DeferredItem) RODS_REGISTRY.register("lush_glowberry_rod", StarcatcherFishingRodItem::new);
    DeferredItem<Item> HUMBLE_ROD = (DeferredItem) RODS_REGISTRY.register("humble_rod", StarcatcherFishingRodItem::new);

    DeferredItem<Item> LETTER = (DeferredItem) ITEMS.register("letter", LetterItem::new);
    DeferredItem<Item> BOTTLED_LETTER = (DeferredItem) ITEMS.register("bottled_letter", BottledLetterItem::new);

    DeferredItem<Item> MESSAGE_IN_A_BOTTLE = (DeferredItem) ITEMS.register("message_in_a_bottle", MessageInABottleItem::new);
    DeferredItem<Item> MESSAGE = (DeferredItem) ITEMS.register("message", LetterItem::new);

    DeferredItem<Item> BROKEN_BOTTLE = (DeferredItem) ITEMS.register("broken_bottle", BrokenBottleItem::new);

    DeferredItem<Item> SECRET_NOTE = (DeferredItem) ITEMS.register("secret_note", SecretNote::new);

    DeferredItem<Item> DRIFTING_WATERLOGGED_BOTTLE = (DeferredItem) ITEMS.register("drifting_waterlogged_bottle", NoteContainer::new);
    DeferredItem<Item> SCALDING_BOTTLE = (DeferredItem) ITEMS.register("scalding_bottle", NoteContainer::new);
    DeferredItem<Item> BURNING_BOTTLE = (DeferredItem) ITEMS.register("burning_bottle", NoteContainer::new);
    DeferredItem<Item> HOPEFUL_BOTTLE = (DeferredItem) ITEMS.register("hopeful_bottle", NoteContainer::new);
    DeferredItem<Item> HOPELESS_BOTTLE = (DeferredItem) ITEMS.register("hopeless_bottle", NoteContainer::new);
    DeferredItem<Item> TRUE_BLUE_BOTTLE = (DeferredItem) ITEMS.register("true_blue_bottle", NoteContainer::new);
    DeferredItem<Item> WITHERED_BOTTLE = (DeferredItem) ITEMS.register("withered_bottle", NoteContainer::new);

    DeferredItem<Item> WATERLOGGED_SATCHEL = (DeferredItem) ITEMS.register("waterlogged_satchel", WaterloggedSatchel::new);

    DeferredItem<Item> FISH_BONES = (DeferredItem) ITEMS.register("fish_bones", BasicItem::new);
    DeferredItem<Item> PEARL = (DeferredItem) ITEMS.register("pearl", BasicItem::new);

    DeferredItem<Item> OBIDONTIEE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("obidontiee", FishItem::new);
    DeferredItem<Item> SILVERVEIL_PERCH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("silverveil_perch", FishItem::new);
    DeferredItem<Item> ELDERSCALE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("elderscale", FishItem::new);
    DeferredItem<Item> DRIFTFIN = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("driftfin", FishItem::new);
    DeferredItem<Item> TWILIGHT_KOI = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("twilight_koi", FishItem::new);
    DeferredItem<Item> THUNDER_BASS = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("thunder_bass", FishItem::new);
    DeferredItem<Item> LIGHTNING_BASS = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("lightning_bass", FishItem::new);
    DeferredItem<Item> BOOT = (DeferredItem) ITEMS.register("boot", BasicItem::new);

    DeferredItem<Item> SLUDGE_CATFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("sludge_catfish", FishItem::new);
    DeferredItem<Item> LILY_SNAPPER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("lily_snapper", FishItem::new);
    DeferredItem<Item> SAGE_CATFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("sage_catfish", FishItem::new);
    DeferredItem<Item> MOSSY_BOOT = (DeferredItem) ITEMS.register("mossy_boot", BasicItem::new);

    DeferredItem<Item> PALE_CARP = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("pale_carp", FishItem::new);
    DeferredItem<Item> PALE_PINFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("pale_pinfish", FishItem::new);
    DeferredItem<Item> PINFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("pinfish", FishItem::new);

    DeferredItem<Item> FROSTJAW_TROUT = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("frostjaw_trout", FishItem::new);
    DeferredItem<Item> CRYSTALBACK_TROUT = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("crystalback_trout", FishItem::new);
    DeferredItem<Item> AURORA = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("aurora", FishItem::new);
    DeferredItem<Item> WINTERY_PIKE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("wintery_pike", FishItem::new);

    DeferredItem<Item> SANDTAIL = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("sandtail", FishItem::new);
    DeferredItem<Item> MIRAGE_CARP = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("mirage_carp", FishItem::new);
    DeferredItem<Item> SCORCHFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("scorchfish", FishItem::new);
    DeferredItem<Item> CACTIFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("cactifish", FishItem::new);
    DeferredItem<Item> AGAVE_BREAM = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("agave_bream", FishItem::new);

    DeferredItem<Item> SUNNY_STURGEON = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("sunny_sturgeon", FishItem::new);
    DeferredItem<Item> ROCKGILL = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("rockgill", FishItem::new);
    DeferredItem<Item> PEAKDWELLER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("peakdweller", FishItem::new);
    DeferredItem<Item> SUN_SEEKING_CARP = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("sun_seeking_carp", FishItem::new);

    DeferredItem<Item> BLOSSOMFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("blossomfish", FishItem::new);
    DeferredItem<Item> PETALDRIFT_CARP = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("petaldrift_carp", FishItem::new);
    DeferredItem<Item> PINK_KOI = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("pink_koi", FishItem::new);
    DeferredItem<Item> MORGANITE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("morganite", FishItem::new);
    DeferredItem<Item> ROSE_SIAMESE_FISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("rose_siamese_fish", FishItem::new);
    DeferredItem<Item> VESANI = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("vesani", FishItem::new);

    DeferredItem<Item> CRYSTALBACK_STURGEON = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("crystalback_sturgeon", FishItem::new);
    DeferredItem<Item> ICETOOTH_STURGEON = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("icetooth_sturgeon", FishItem::new);
    DeferredItem<Item> BOREAL = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("boreal", FishItem::new);
    DeferredItem<Item> CRYSTALBACK_BOREAL = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("crystalback_boreal", FishItem::new);

    DeferredItem<Item> SILVERFIN_PIKE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("silverfin_pike", FishItem::new);
    DeferredItem<Item> CARPENJOE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("carpenjoe", FishItem::new);
    DeferredItem<Item> WILLOW_BREAM = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("willow_bream", FishItem::new);
    DeferredItem<Item> DRIFTING_BREAM = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("drifting_bream", FishItem::new);
    DeferredItem<Item> DOWNFALL_BREAM = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("downfall_bream", FishItem::new);
    DeferredItem<Item> HOLLOWBELLY_DARTER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("hollowbelly_darter", FishItem::new);
    DeferredItem<Item> MISTBACK_CHUB = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("mistback_chub", FishItem::new);
    DeferredItem<Item> BLUEGIGI = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("bluegigi", FishItem::new);
    DeferredItem<Item> DRIED_SEAWEED = (DeferredItem) ITEMS.register("dried_seaweed", BasicItem::new);

    DeferredItem<Item> FROSTGILL_CHUB = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("frostgill_chub", FishItem::new);
    DeferredItem<Item> CRYSTALBACK_MINNOW = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("crystalback_minnow", FishItem::new);
    DeferredItem<Item> AZURE_CRYSTALBACK_MINNOW = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("azure_crystalback_minnow", FishItem::new);
    DeferredItem<Item> BLUE_CRYSTAL_FIN = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("blue_crystal_fin", FishItem::new);

    DeferredItem<Item> BLUE_HERRING = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("blue_herring", FishItem::new);
    DeferredItem<Item> IRONJAW_HERRING = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("ironjaw_herring", FishItem::new);
    DeferredItem<Item> DEEPJAW_HERRING = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("deepjaw_herring", FishItem::new);
    DeferredItem<Item> DUSKTAIL_SNAPPER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("dusktail_snapper", FishItem::new);
    DeferredItem<Item> JOEL = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("joel", FishItem::new);
    DeferredItem<Item> REDSCALED_TUNA = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("redscaled_tuna", FishItem::new);
    DeferredItem<Item> BIGEYE_TUNA = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("bigeye_tuna", FishItem::new);
    DeferredItem<Item> SEA_BASS = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("sea_bass", FishItem::new);

    DeferredItem<Item> SHROOMFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("shroomfish", FishItem::new);
    DeferredItem<Item> SPOREFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("sporefish", FishItem::new);

    DeferredItem<Item> GOLD_FAN = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("gold_fan", FishItem::new);
    DeferredItem<Item> GEODE_EEL = (DeferredItem) ITEMS.register("geode_eel", BasicItem::new);

    DeferredItem<Item> WHITEVEIL = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("whiteveil", FishItem::new);
    DeferredItem<Item> BLACK_EEL = (DeferredItem) ITEMS.register("black_eel", BasicItem::new);
    DeferredItem<Item> AMETHYSTBACK = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("amethystback", FishItem::new);
    DeferredItem<Item> STONEFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("stonefish", FishItem::new);

    DeferredItem<Item> FOSSILIZED_ANGELFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("fossilized_angelfish", FishItem::new);
    DeferredItem<Item> DRIPFIN = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("dripfin", FishItem::new);
    DeferredItem<Item> YELLOWSTONE_FISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("yellowstone_fish", FishItem::new);

    DeferredItem<Item> LUSH_PIKE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("lush_pike", FishItem::new);
    DeferredItem<Item> VIVID_MOSS = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("vivid_moss", FishItem::new);
    DeferredItem<Item> THE_QUARRISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("the_quarrish", FishItem::new);

    DeferredItem<Item> GHOSTLY_PIKE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("ghostly_pike", FishItem::new);
    DeferredItem<Item> AQUAMARINE_PIKE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("aquamarine_pike", FishItem::new);
    DeferredItem<Item> GARNET_MACKEREL = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("garnet_mackerel", FishItem::new);
    DeferredItem<Item> BRIGHT_AMETHYST_SNAPPER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("bright_amethyst_snapper", FishItem::new);
    DeferredItem<Item> DARK_AMETHYST_SNAPPER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("dark_amethyst_snapper", FishItem::new);
    DeferredItem<Item> DEEPSLATEFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("deepslatefish", FishItem::new);

    DeferredItem<Item> SCULKFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("sculkfish", FishItem::new);
    DeferredItem<Item> WARD = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("ward", FishItem::new);
    DeferredItem<Item> GLOWING_DARK = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("glowing_dark", FishItem::new);

    DeferredItem<Item> SUNEATER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("suneater", FireResistantBasicItem::new);
    DeferredItem<Item> PYROTROUT = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("pyrotrout", FireResistantBasicItem::new);
    DeferredItem<Item> OBSIDIAN_EEL = (DeferredItem) ITEMS.register("obsidian_eel", FireResistantBasicItem::new);

    DeferredItem<Item> MOLTEN_SHRIMP = (DeferredItem) ITEMS.register("molten_shrimp", FireResistantBasicItem::new);
    DeferredItem<Item> OBSIDIAN_CRAB = (DeferredItem) ITEMS.register("obsidian_crab", FireResistantBasicItem::new);

    DeferredItem<Item> SCORCHED_BLOODSUCKER = (DeferredItem) ITEMS.register("scorched_bloodsucker", FireResistantBasicItem::new);
    DeferredItem<Item> MOLTEN_DEEPSLATE_CRAB = (DeferredItem) ITEMS.register("molten_deepslate_crab", FireResistantBasicItem::new);

    DeferredItem<Item> EMBERGILL = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("embergill", FireResistantBasicItem::new);
    DeferredItem<Item> SCALDING_PIKE = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("scalding_pike", FireResistantBasicItem::new);
    DeferredItem<Item> CINDER_SQUID = (DeferredItem) ITEMS.register("cinder_squid", FireResistantBasicItem::new);
    DeferredItem<Item> LAVA_CRAB = (DeferredItem) ITEMS.register("lava_crab", FireResistantBasicItem::new);
    DeferredItem<Item> MAGMA_FISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("magma_fish", FireResistantBasicItem::new);
    DeferredItem<Item> GLOWSTONE_SEEKER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("glowstone_seeker", FireResistantBasicItem::new);
    DeferredItem<Item> GLOWSTONE_PUFFERFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("glowstone_pufferfish", FireResistantBasicItem::new);
    DeferredItem<Item> WILLISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("willish", FireResistantBasicItem::new);

    DeferredItem<Item> CERBERAY = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("cerberay", FireResistantBasicItem::new);

    DeferredItem<Item> LAVA_CRAB_CLAW = (DeferredItem) ITEMS.register("lava_crab_claw", FireResistantBasicItem::new);

    DeferredItem<Item> CHARFISH = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("charfish", FishItem::new);
    DeferredItem<Item> CHORUS_CRAB = (DeferredItem) ITEMS.register("chorus_crab", FishItem::new);
    DeferredItem<Item> END_GLOW = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("end_glow", FishItem::new);
    DeferredItem<Item> VOIDBITER = (DeferredItem) BUCKETABLE_FISHES_REGISTRY.register("voidbiter", FishItem::new);

    DeferredItem<Item> STARCAUGHT_BUCKET = (DeferredItem) ITEMS.register("starcaught_bucket", key -> new StarcaughtBucket(key, Fluids.WATER));

    DeferredItem<Item> COOKED_STARCAUGHT_FISH = (DeferredItem) ITEMS.register("cooked_starcaught_fish", key -> new Item(new Item.Properties().setId(key).food(SCFoodProperties.BASIC_COOKED_FISH)));

    static void register() {}
}
