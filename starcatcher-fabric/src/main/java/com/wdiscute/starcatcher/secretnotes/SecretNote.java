package com.wdiscute.starcatcher.secretnotes;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class SecretNote extends Item {
    public SecretNote(ResourceKey<Item> key) {
        super(new Item.Properties().setId(key).stacksTo(1));
    }

    public enum Note {
        AMETHYST_HOOK, ARNWULF_1, ARNWULF_2, HOPEFUL_NOTE, HOPELESS_NOTE, TRUE_BLUE, WITHER
    }
}
