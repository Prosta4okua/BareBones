package com.mramericanmike.barebones;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import com.mramericanmike.barebones.configuration.ConfigValues;
import com.mramericanmike.barebones.configuration.ConfigurationHandler;
import com.mramericanmike.barebones.init.GeneralRecipes;
import com.mramericanmike.barebones.init.ModBlocks;
import com.mramericanmike.barebones.init.ModItems;
import com.mramericanmike.barebones.proxy.IProxy;
import com.mramericanmike.barebones.sounds.ModSounds;

@Mod(modid = ModInfo.MODID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION, guiFactory = ModInfo.GUI_FACTORY_CLASS, acceptedMinecraftVersions = ModInfo.ACCEPTED_VERSIONS)

public class BareBones
{
	@Mod.Instance(ModInfo.MODID)
	public static BareBones instance;
	
	@SidedProxy(clientSide = ModInfo.CLIENT_PROXY_CLASS, serverSide = ModInfo.SERVER_PROXY_CLASS)
	public static IProxy proxy;	
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	Log.all("BareBones brought to you by MrAmericanMike");
    	    	
    	//CONFIGURATION
    	ConfigurationHandler.init(new File(event.getModConfigurationDirectory(), ModInfo.MOD_NAME+".cfg"));
		MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
		
		//INIT ITEMS
    	ModItems.registerItems();
    	
    	//INIT BLOCKS
    	ModBlocks.registerBlocks();
    	
    	//INIT SOUNDS
    	ModSounds.registerSounds();
    	
		//GENERAL RECIPES
		GeneralRecipes.registerRecipes();
		
		//Register Renders - This will call the right Side - Check ClientProxy for Items and Blocks render registration
    	proxy.preInit();
    			
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }


}
