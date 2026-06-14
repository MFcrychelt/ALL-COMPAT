package com.wdiscute.starcatcher.blocks.tacklebox;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

public class TackleBoxBlock extends Block {
    public TackleBoxBlock(ResourceKey<Block> key, DyeColor color, MapColor mapColor) { super(Block.Properties.of().setId(key)); }
}
