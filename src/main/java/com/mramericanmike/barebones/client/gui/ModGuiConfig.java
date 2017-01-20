package com.mramericanmike.barebones.client.gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import com.mramericanmike.barebones.ModInfo;
import com.mramericanmike.barebones.configuration.ConfigurationHandler;

public class ModGuiConfig extends GuiConfig
{	
	
	public ModGuiConfig(GuiScreen parentScreen) {

		super(parentScreen,
			configElements(),
			ModInfo.MODID,
			true,
			true,
			ModInfo.CONFIG_SCREEN_TITLE);
		
	}
	
	private static List<IConfigElement> configElements(){
		
		List<IConfigElement> elements = new ArrayList<IConfigElement>();
				
		elements.add(new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CATEGORY_GENERAL)));
		elements.add(new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CATEGORY_EXTRA)));
		
		return elements;
		
	}


}