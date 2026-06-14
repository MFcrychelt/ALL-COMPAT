package com.wdiscute.starcatcher;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class DeferredBlock<T extends Block> extends DeferredHolder<Block, T> {
    public DeferredBlock(T val, ResourceKey<Block> key) {
        super(val, key);
    }
}
