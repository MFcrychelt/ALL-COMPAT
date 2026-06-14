package com.wdiscute.starcatcher.registry.items.rod;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;

public class StarcatcherFishingRodItem extends FishingRodItem {
    public StarcatcherFishingRodItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).durability(64));
    }
}
