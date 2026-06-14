package com.wdiscute.starcatcher.registry.items.helper;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class BasicItem extends Item {
    public BasicItem(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key));
    }
}
