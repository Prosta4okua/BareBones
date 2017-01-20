package com.mramericanmike.barebones.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mramericanmike.barebones.configuration.ConfigValues;
import com.mramericanmike.barebones.items.*;

public class ModItems {
		
	//CREATE THE ITEMS
	
	public static final Item EXAMPLE_ITEM = new ExampleItem("example_item"); //The name here between the "" has to match the texture name (Use lowercase)
	
	public static final Item SCISSOR = new GenericModItem("scissor").setMaxStackSize(1); //In this case its a generic item with nothing particular on it
	
	public static void registerItems() {
		
		//This will only register this items if the Config value is true
		if(ConfigValues.enableExampleItems){
			registerItem(EXAMPLE_ITEM);
			registerItem(SCISSOR);
		}
		
	}//END INIT
	
	//This gets called on ClientPoxy
	public static void registerRenders() {
		
		//This will only register render for this items if the Config value is true
		if(ConfigValues.enableExampleItems){
			registerRender(EXAMPLE_ITEM);
			registerRender(SCISSOR);
		}
		
		
	}//END REGISTER RENDERS
	
	

	private static void registerItem(Item item){
		GameRegistry.register(item);
	}

	public static void registerRender(Item item) {
    	ModelResourceLocation modelLocation = new ModelResourceLocation(item.getRegistryName(), "inventory");
    	ModelLoader.setCustomModelResourceLocation(item, 0,  modelLocation);
	}
	
}