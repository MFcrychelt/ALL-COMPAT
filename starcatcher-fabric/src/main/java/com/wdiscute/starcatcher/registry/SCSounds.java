package com.wdiscute.starcatcher.registry;

import com.wdiscute.starcatcher.Starcatcher;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class SCSounds {
    public static final Supplier<SoundEvent> KING_HEHEHA = registerSoundEvent("king_heheha");
    public static final Supplier<SoundEvent> KING_CRY = registerSoundEvent("king_cry");
    public static final Supplier<SoundEvent> KING_GRR = registerSoundEvent("king_grr");

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        Identifier id = Starcatcher.rl(name);
        SoundEvent event = Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
        return () -> event;
    }

    public static void register() {
        // Sounds are registered during static initialization!
    }
}
