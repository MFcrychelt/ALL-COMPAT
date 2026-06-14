package com.wdiscute.starcatcher.secretnotes;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class LetterItem extends Item {
    public LetterItem() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }

    public record Message(java.util.UUID id, String author, net.minecraft.resources.Identifier dimension, java.util.List<String> text, boolean isCreative) {}
}
