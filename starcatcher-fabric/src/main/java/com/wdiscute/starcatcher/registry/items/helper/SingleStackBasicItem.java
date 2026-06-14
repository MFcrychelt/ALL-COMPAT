package com.wdiscute.starcatcher.registry.items.helper;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class SingleStackBasicItem extends Item {
    public SingleStackBasicItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }
}
