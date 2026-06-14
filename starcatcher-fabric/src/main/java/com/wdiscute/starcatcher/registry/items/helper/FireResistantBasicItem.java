package com.wdiscute.starcatcher.registry.items.helper;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class FireResistantBasicItem extends Item {
    public FireResistantBasicItem(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).fireResistant());
    }
}
