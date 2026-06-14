package com.wdiscute.starcatcher.registry.items.helper;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class BasicItem extends Item {
    public BasicItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()));
    }
}
