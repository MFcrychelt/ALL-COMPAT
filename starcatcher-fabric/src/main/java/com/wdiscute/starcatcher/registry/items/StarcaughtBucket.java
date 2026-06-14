package com.wdiscute.starcatcher.registry.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class StarcaughtBucket extends Item {
    public StarcaughtBucket(ResourceKey<Item> key, Fluid fluid) {
        super(new Item.Properties().setId(key).stacksTo(1));
    }
}
