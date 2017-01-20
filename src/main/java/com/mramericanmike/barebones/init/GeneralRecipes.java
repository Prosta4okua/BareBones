package com.mramericanmike.barebones.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.mramericanmike.barebones.configuration.ConfigValues;
import com.mramericanmike.barebones.util.StacksForRecipes;

public class GeneralRecipes {
	
	public static void registerRecipes()
	{

		//Check if the item is true on the Configs before adding a recipe for it
		if(ConfigValues.enableExampleItems){
			
			//SHAPPED RECIPE
			GameRegistry.addRecipe(StacksForRecipes.example_item,
				"G G",
				"GYG",
				"YGY", 'G', StacksForRecipes.green_dye, 'Y', StacksForRecipes.yellow_dye);
			
			//SHAPPELESS RECIPE
			GameRegistry.addShapelessRecipe(StacksForRecipes.scissor, StacksForRecipes.iron_ingot, StacksForRecipes.gold_ingot); //Output then ingredients
			
		}
		
		//Check if the block is true on the Configs before adding a recipe for it
		if(ConfigValues.enableExampleBlocks){
			
			//SHAPPED RECIPE
			GameRegistry.addRecipe(StacksForRecipes.black_stone_8,
				"SSS",
				"SDS",
				"SSS", 'S', StacksForRecipes.stone, 'D', StacksForRecipes.black_dye);
			
		}
	
	
	
		//SMELTING
		//GameRegistry.addSmelting(input, output, 0.2F); //Last value is XP
		
	}

}
