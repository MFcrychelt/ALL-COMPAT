package com.wdiscute.starcatcher.blocks.stand;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class StandBlock extends Block {
    public StandBlock(ResourceKey<Block> key) { super(Block.Properties.of().setId(key)); }
}
