package com.wdiscute.starcatcher.guide;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class FishingGuideItem extends Item {
    public FishingGuideItem(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).stacksTo(1));
    }
}
