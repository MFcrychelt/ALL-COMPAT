package com.wdiscute.starcatcher.registry.items;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class WaterloggedSatchel extends Item {
    public WaterloggedSatchel() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }
}
