package com.wdiscute.starcatcher.registry.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class NoteContainer extends Item {
    public NoteContainer(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).stacksTo(1));
    }
}
