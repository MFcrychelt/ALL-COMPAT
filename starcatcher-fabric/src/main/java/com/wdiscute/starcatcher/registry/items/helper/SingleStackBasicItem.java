package com.wdiscute.starcatcher.registry.items.helper;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class SingleStackBasicItem extends Item {
    public SingleStackBasicItem(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).stacksTo(1));
    }
}
