package com.mramericanmike.barebones.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.mramericanmike.barebones.ModInfo;

public class ConfigurationHandler {

	public static Configuration configuration;
	public static final String CATEGORY_GENERAL = "General Configs";
	public static final String CATEGORY_EXTRA = "Extra Configs";
	
	
	public static void init(File configFile) {
		if (configuration == null)
		{
		configuration = new Configuration(configFile);
		loadConfiguration();
		}
	}
	
	public static void loadConfiguration() {
		
			ConfigValues.enableExampleItems = configuration.getBoolean("enableExampleItems", CATEGORY_GENERAL, ConfigValues.enableExampleItems, "Enable the Example Items");
			
			ConfigValues.enableExampleBlocks = configuration.getBoolean("enableExampleBlocks", CATEGORY_GENERAL, ConfigValues.enableExampleBlocks, "Enable the Example Blocks");
			
			ConfigValues.sampleInt = configuration.getInt("sampleInt", CATEGORY_EXTRA, ConfigValues.sampleInt, 1, 100, "Sample Integer");

			if (configuration.hasChanged()){
				configuration.save();
			}
				
	
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if (event.getModID().equalsIgnoreCase(ModInfo.MODID)) {
		loadConfiguration();
		}
	}

}