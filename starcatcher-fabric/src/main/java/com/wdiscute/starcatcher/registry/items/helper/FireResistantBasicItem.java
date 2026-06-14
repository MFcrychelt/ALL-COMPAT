package com.wdiscute.starcatcher.registry.items.helper;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class FireResistantBasicItem extends Item {
    public FireResistantBasicItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).fireResistant());
    }
}
