package com.wdiscute.starcatcher.registry.items;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;

public class StarcaughtBucket extends Item {
    public StarcaughtBucket(Fluid fluid) {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }
}
