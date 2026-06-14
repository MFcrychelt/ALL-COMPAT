package com.wdiscute.starcatcher.secretnotes;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class BrokenBottleItem extends Item {
    public BrokenBottleItem(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).stacksTo(1));
    }
}
