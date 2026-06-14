package com.wdiscute.starcatcher;

import com.wdiscute.starcatcher.blocks.SCBlocks;
import com.wdiscute.starcatcher.registry.SCItems;
import com.wdiscute.starcatcher.registry.SCSounds;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Starcatcher implements ModInitializer {
    public static final String MOD_ID = "starcatcher";
    public static final Logger LOGGER = LoggerFactory.getLogger("starcatcher");

    public static Identifier rl(String s) {
        return Identifier.fromNamespaceAndPath(MOD_ID, s);
    }

    @Override
    public void onInitialize() {
        SCItems.register();
        SCBlocks.register();
        SCSounds.register();
        LOGGER.info("Starcatcher (Fabric) Core initialized! Connecting to Stardew Fishing mechanics...");
    }
}
