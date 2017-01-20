package com.mramericanmike.barebones.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.mramericanmike.barebones.blocks.*;
import com.mramericanmike.barebones.configuration.ConfigValues;

public class ModBlocks {
	
	//CREATE THE BLOCKS
	public static final Block BLACK_STONE = new BlackStone(Material.ROCK, "black_stone"); //The name here between the "" has to match the texture name (Use lowercase)
		
	public static void registerBlocks() {

		//This will only register this blocks if the Config value is true
		if(ConfigValues.enableExampleBlocks){
			registerBlock(BLACK_STONE);
		}
	}
	
	//This gets called on ClientPoxy
	public static void registerRenders() {

		//This will only register the render for this blocks if the Config value is true
		if(ConfigValues.enableExampleBlocks){
			registerRender(BLACK_STONE);
		}
	}
	

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	public static void registerRender(Block block) {
		ModelResourceLocation modelLocation = new ModelResourceLocation(block.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), block.getMetaFromState(block.getDefaultState()),  modelLocation);
	}
	
}