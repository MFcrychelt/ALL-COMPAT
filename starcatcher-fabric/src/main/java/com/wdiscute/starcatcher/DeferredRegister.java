package com.wdiscute.starcatcher;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DeferredRegister<T> {
    protected final Registry<T> registry;
    protected final String modId;
    protected final List<DeferredHolder<T, ?>> entries = new ArrayList<>();

    public DeferredRegister(Registry<T> registry, String modId) {
        this.registry = registry;
        this.modId = modId;
    }

    public static <T> DeferredRegister<T> create(Registry<T> registry, String modId) {
        return new DeferredRegister<>(registry, modId);
    }

    public <U extends T> DeferredHolder<T, U> register(String name, Supplier<U> sup) {
        Identifier id = Identifier.fromNamespaceAndPath(modId, name);
        U val = Registry.register(registry, id, sup.get());
        ResourceKey<T> key = ResourceKey.create(registry.key(), id);
        DeferredHolder<T, U> holder = new DeferredHolder<>(val, key);
        entries.add(holder);
        return holder;
    }

    public List<DeferredHolder<T, ?>> getEntries() {
        return entries;
    }

    public void register() {}
    public void register(Object obj) {}

    public static class Items extends DeferredRegister<net.minecraft.world.item.Item> {
        public Items(String modId) {
            super(net.minecraft.core.registries.BuiltInRegistries.ITEM, modId);
        }

        @Override
        public <U extends net.minecraft.world.item.Item> DeferredItem<U> register(String name, Function<ResourceKey<net.minecraft.world.item.Item>, U> factory) {
            Identifier id = Identifier.fromNamespaceAndPath(super.modId, name);
            ResourceKey<net.minecraft.world.item.Item> key = ResourceKey.create(super.registry.key(), id);
            U val = Registry.register(super.registry, id, factory.apply(key));
            DeferredItem<U> holder = new DeferredItem<>(val, key);
            super.entries.add(holder);
            return holder;
        }
    }

    public static class Blocks extends DeferredRegister<net.minecraft.world.level.block.Block> {
        public Blocks(String modId) {
            super(net.minecraft.core.registries.BuiltInRegistries.BLOCK, modId);
        }

        @Override
        public <U extends net.minecraft.world.level.block.Block> DeferredBlock<U> register(String name, Supplier<U> sup) {
            Identifier id = Identifier.fromNamespaceAndPath(super.modId, name);
            U val = Registry.register(super.registry, id, sup.get());
            ResourceKey<net.minecraft.world.level.block.Block> key = ResourceKey.create(super.registry.key(), id);
            DeferredBlock<U> holder = new DeferredBlock<>(val, key);
            super.entries.add(holder);
            return holder;
        }
    }

    public static Items createItems(String modId) { return new Items(modId); }
    public static Blocks createBlocks(String modId) { return new Blocks(modId); }
}
