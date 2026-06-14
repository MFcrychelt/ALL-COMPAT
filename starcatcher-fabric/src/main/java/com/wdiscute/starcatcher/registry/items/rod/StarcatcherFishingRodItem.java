package com.wdiscute.starcatcher.registry.items.rod;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;

public class StarcatcherFishingRodItem extends FishingRodItem {
    public StarcatcherFishingRodItem(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).durability(64));
    }
}
