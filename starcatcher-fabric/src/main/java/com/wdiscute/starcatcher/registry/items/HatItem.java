package com.wdiscute.starcatcher.registry.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class HatItem extends BlockItem {
    public HatItem(Block block, ResourceKey<Item> key) {
        super(block, new Properties().setId(key).stacksTo(1));
    }
}
