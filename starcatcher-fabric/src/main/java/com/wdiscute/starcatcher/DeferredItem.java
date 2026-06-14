package com.wdiscute.starcatcher;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class DeferredItem<T extends Item> extends DeferredHolder<Item, T> {
    public DeferredItem(T val, ResourceKey<Item> key) {
        super(val, key);
    }
}
