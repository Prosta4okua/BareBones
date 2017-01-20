package com.mramericanmike.barebones.sounds;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mramericanmike.barebones.ModInfo;

public class ModSounds {
	
	public static SoundEvent FROG;

	public static void registerSounds() {
		FROG = registerSound("frog");
	}

	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(ModInfo.MODID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}

}
