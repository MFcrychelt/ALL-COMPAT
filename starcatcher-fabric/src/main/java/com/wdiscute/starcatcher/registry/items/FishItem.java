package com.wdiscute.starcatcher.registry.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class FishItem extends Item {
    public FishItem(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).food(SCFoodProperties.BASIC_RAW_FISH));
    }
}
