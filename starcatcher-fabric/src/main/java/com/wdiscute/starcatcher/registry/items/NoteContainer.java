package com.wdiscute.starcatcher.registry.items;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class NoteContainer extends Item {
    public NoteContainer() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }
}
