package com.wdiscute.starcatcher.registry.items;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class FishItem extends Item {
    public FishItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).food(SCFoodProperties.BASIC_RAW_FISH));
    }
}
