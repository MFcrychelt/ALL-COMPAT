package com.wdiscute.starcatcher.guide;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class FishingGuideItem extends Item {
    public FishingGuideItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }
}
