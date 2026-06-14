package com.wdiscute.starcatcher.registry.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class WaterloggedSatchel extends Item {
    public WaterloggedSatchel(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).stacksTo(1));
    }
}
