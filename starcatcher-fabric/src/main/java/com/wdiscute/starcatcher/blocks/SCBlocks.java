package com.wdiscute.starcatcher.blocks;

import com.wdiscute.starcatcher.DeferredBlock;
import com.wdiscute.starcatcher.DeferredRegister;
import com.wdiscute.starcatcher.Starcatcher;
import com.wdiscute.starcatcher.blocks.Telescope.TelescopeBlock;
import com.wdiscute.starcatcher.blocks.aquarium.AquariumBlock;
import com.wdiscute.starcatcher.blocks.display.DisplayBlock;
import com.wdiscute.starcatcher.blocks.stand.StandBlock;
import com.wdiscute.starcatcher.blocks.tacklebox.TackleBoxBlock;
import com.wdiscute.starcatcher.registry.SCItems;
import com.wdiscute.starcatcher.registry.items.HatItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public interface SCBlocks {
    DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Starcatcher.MOD_ID);
    DeferredRegister.Blocks HATS = DeferredRegister.createBlocks(Starcatcher.MOD_ID);
    DeferredRegister.Blocks TACKLE_BOXES = DeferredRegister.createBlocks(Starcatcher.MOD_ID);

    DeferredBlock<Block> TROPHY_OF_THE_OLDER_ANGLER = registerBlock("trophy_of_the_older_angler", TrophyOfTheOlderAngler::new);
    DeferredBlock<Block> TROPHY_DIAMOND = registerBlock("trophy_diamond", TrophyBlock::new);
    DeferredBlock<Block> TROPHY_EMERALD = registerBlock("trophy_emerald", TrophyBlock::new);
    DeferredBlock<Block> TROPHY_GOLD = registerBlock("trophy_gold", TrophyBlock::new);
    DeferredBlock<Block> TROPHY_IRON = registerBlock("trophy_iron", TrophyBlock::new);
    DeferredBlock<Block> TROPHY_COPPER = registerBlock("trophy_copper", TrophyBlock::new);

    DeferredBlock<Block> STAND = registerBlock("tournament_stand", StandBlock::new);

    DeferredBlock<DisplayBlock> DISPLAY = registerBlock("display", DisplayBlock::new);

    DeferredBlock<Block> TELESCOPE = registerBlock("telescope", TelescopeBlock::new);

    DeferredBlock<Block> AQUARIUM = registerBlock("aquarium", AquariumBlock::new);

    DeferredBlock<Block> CLAM = registerBlock("clam", ClamBlock::new);

    DeferredBlock<Block> CONCH = registerBlock("conch", ConchBlock::new);

    DeferredBlock<Block> TACKLE_BOX = registerTackleBox("tackle_box", (key) -> new TackleBoxBlock(key, null, MapColor.TERRACOTTA_WHITE));
    DeferredBlock<Block> TACKLE_BOX_WHITE = registerTackleBox("tackle_box_white", (key) -> new TackleBoxBlock(key, DyeColor.WHITE, MapColor.SNOW));
    DeferredBlock<Block> TACKLE_BOX_LIME = registerTackleBox("tackle_box_lime", (key) -> new TackleBoxBlock(key, DyeColor.LIME, MapColor.COLOR_LIGHT_GREEN));
    DeferredBlock<Block> TACKLE_BOX_ORANGE = registerTackleBox("tackle_box_orange", (key) -> new TackleBoxBlock(key, DyeColor.ORANGE, MapColor.COLOR_ORANGE));
    DeferredBlock<Block> TACKLE_BOX_RED = registerTackleBox("tackle_box_red", (key) -> new TackleBoxBlock(key, DyeColor.RED, MapColor.COLOR_RED));
    DeferredBlock<Block> TACKLE_BOX_GRAY = registerTackleBox("tackle_box_gray", (key) -> new TackleBoxBlock(key, DyeColor.GRAY, MapColor.COLOR_GRAY));
    DeferredBlock<Block> TACKLE_BOX_LIGHT_GRAY = registerTackleBox("tackle_box_LIGHT_GRAY", (key) -> new TackleBoxBlock(key, DyeColor.LIGHT_GRAY, MapColor.COLOR_LIGHT_GRAY));
    DeferredBlock<Block> TACKLE_BOX_BLACK = registerTackleBox("tackle_box_black", (key) -> new TackleBoxBlock(key, DyeColor.BLACK, MapColor.COLOR_BLACK));
    DeferredBlock<Block> TACKLE_BOX_BROWN = registerTackleBox("tackle_box_brown", (key) -> new TackleBoxBlock(key, DyeColor.BROWN, MapColor.COLOR_BROWN));
    DeferredBlock<Block> TACKLE_BOX_YELLOW = registerTackleBox("tackle_box_yellow", (key) -> new TackleBoxBlock(key, DyeColor.YELLOW, MapColor.COLOR_YELLOW));
    DeferredBlock<Block> TACKLE_BOX_PINK = registerTackleBox("tackle_box_pink", (key) -> new TackleBoxBlock(key, DyeColor.PINK, MapColor.COLOR_PINK));
    DeferredBlock<Block> TACKLE_BOX_MAGENTA = registerTackleBox("tackle_box_magenta", (key) -> new TackleBoxBlock(key, DyeColor.MAGENTA, MapColor.COLOR_MAGENTA));
    DeferredBlock<Block> TACKLE_BOX_PURPLE = registerTackleBox("tackle_box_purple", (key) -> new TackleBoxBlock(key, DyeColor.PURPLE, MapColor.TERRACOTTA_PURPLE));
    DeferredBlock<Block> TACKLE_BOX_BLUE = registerTackleBox("tackle_box_blue", (key) -> new TackleBoxBlock(key, DyeColor.BLUE, MapColor.COLOR_BLUE));
    DeferredBlock<Block> TACKLE_BOX_LIGHT_BLUE = registerTackleBox("tackle_box_light_blue", (key) -> new TackleBoxBlock(key, DyeColor.LIGHT_BLUE, MapColor.COLOR_LIGHT_BLUE));
    DeferredBlock<Block> TACKLE_BOX_CYAN = registerTackleBox("tackle_box_cyan", (key) -> new TackleBoxBlock(key, DyeColor.CYAN, MapColor.COLOR_CYAN));
    DeferredBlock<Block> TACKLE_BOX_GREEN = registerTackleBox("tackle_box_green", (key) -> new TackleBoxBlock(key, DyeColor.GREEN, MapColor.COLOR_GREEN));

    DeferredBlock<Block> FISHERMAN_HAT_WHITE = registerHat("fisherman_hat_white", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_LIME = registerHat("fisherman_hat_lime", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_ORANGE = registerHat("fisherman_hat_orange", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_RED = registerHat("fisherman_hat_red", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_GRAY = registerHat("fisherman_hat_gray", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_LIGHT_GRAY = registerHat("fisherman_hat_light_gray", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_BLACK = registerHat("fisherman_hat_black", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_BROWN = registerHat("fisherman_hat_brown", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_YELLOW = registerHat("fisherman_hat_yellow", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_PINK = registerHat("fisherman_hat_pink", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_MAGENTA = registerHat("fisherman_hat_magenta", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_PURPLE = registerHat("fisherman_hat_purple", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_BLUE = registerHat("fisherman_hat_blue", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_LIGHT_BLUE = registerHat("fisherman_hat_light_blue", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_CYAN = registerHat("fisherman_hat_cyan", HatBlock::new);
    DeferredBlock<Block> FISHERMAN_HAT_GREEN = registerHat("fisherman_hat_green", HatBlock::new);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<ResourceKey<Block>, T> block) {
        DeferredBlock<T> toReturn = (DeferredBlock) BLOCKS.register(name, block);
        SCItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().setId(DeferredRegister.Items.getKey())));
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<T> registerHat(String name, Function<ResourceKey<Block>, T> block) {
        DeferredBlock<T> toReturn = (DeferredBlock) HATS.register(name, block);
        SCItems.ITEMS.register(name, () -> new HatItem(toReturn.get()));
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<T> registerTackleBox(String name, Function<ResourceKey<Block>, T> block) {
        DeferredBlock<T> toReturn = (DeferredBlock) TACKLE_BOXES.register(name, block);
        SCItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1)));
        return toReturn;
    }

    static void register() {}
}
