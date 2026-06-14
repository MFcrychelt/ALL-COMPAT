package com.wdiscute.starcatcher;

import net.minecraft.resources.ResourceKey;

public class DeferredHolder<T, U extends T> {
    private final U val;
    private final ResourceKey<T> key;

    public DeferredHolder(U val, ResourceKey<T> key) {
        this.val = val;
        this.key = key;
    }

    public U get() { return val; }
    public U value() { return val; }
    public ResourceKey<T> getKey() { return key; }
}
