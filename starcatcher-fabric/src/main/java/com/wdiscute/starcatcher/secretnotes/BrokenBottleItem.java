package com.wdiscute.starcatcher.secretnotes;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class BrokenBottleItem extends Item {
    public BrokenBottleItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }
}
