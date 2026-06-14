package com.wdiscute.starcatcher.secretnotes;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.Item;

public class SecretNote extends Item {
    public SecretNote() {
        super(new Item.Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }

    public enum Note {
        AMETHYST_HOOK, ARNWULF_1, ARNWULF_2, HOPEFUL_NOTE, HOPELESS_NOTE, TRUE_BLUE, WITHER
    }
}
