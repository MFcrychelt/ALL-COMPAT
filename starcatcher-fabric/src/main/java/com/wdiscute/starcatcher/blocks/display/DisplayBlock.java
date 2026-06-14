package com.wdiscute.starcatcher.blocks.display;

import net.minecraft.world.level.block.Block;

public class DisplayBlock extends Block {
    public static final net.minecraft.world.level.block.state.properties.BooleanProperty HAS_ITEM = net.minecraft.world.level.block.state.properties.BooleanProperty.create("has_item");
    public DisplayBlock() { super(Block.Properties.of()); }
}
