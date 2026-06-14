package com.wdiscute.starcatcher.registry.items;

import com.wdiscute.starcatcher.DeferredRegister;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class HatItem extends BlockItem {
    public HatItem(Block block) {
        super(block, new Properties().setId(DeferredRegister.Items.getKey()).stacksTo(1));
    }
}
