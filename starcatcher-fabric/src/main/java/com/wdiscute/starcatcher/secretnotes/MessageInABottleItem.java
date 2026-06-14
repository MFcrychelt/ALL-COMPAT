package com.wdiscute.starcatcher.secretnotes;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class MessageInABottleItem extends Item {
    public MessageInABottleItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }
}
