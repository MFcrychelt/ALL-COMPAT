package com.wdiscute.starcatcher.secretnotes;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class LetterItem extends Item {
    public LetterItem(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).stacksTo(1));
    }

    public record Message(java.util.UUID id, String author, net.minecraft.resources.Identifier dimension, java.util.List<String> text, boolean isCreative) {}
}
