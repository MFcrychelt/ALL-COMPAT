package koala.fishingreal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;

public class FishingRealFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DynamicRegistries.registerSynced(FishingReal.FISHING_CONVERSION_REGISTRY_KEY, FishingConversion.CODEC);
    }
}
