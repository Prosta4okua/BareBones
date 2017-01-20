package com.mramericanmike.barebones.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.mramericanmike.barebones.init.ModBlocks;
import com.mramericanmike.barebones.init.ModItems;

public class StacksForRecipes {
	
	
	//MOD ITEMS
	public static ItemStack example_item = new ItemStack(ModItems.EXAMPLE_ITEM,1,0); //One Example Item with Metadata of 0
	public static ItemStack scissor = new ItemStack(ModItems.SCISSOR,1,0); //One Scissor with Metadata of 0
	
	//MOD BLOCKS
	public static ItemStack black_stone_8 = new ItemStack(ModBlocks.BLACK_STONE,8,0); //Eight Black Stones
	
	
	//VANILLA ITEMS
	public static ItemStack iron_ingot = new ItemStack(Items.IRON_INGOT,1,0); //One Iron Ingot with Metadata of 0
	public static ItemStack gold_ingot = new ItemStack(Items.GOLD_INGOT,1,0); //One Gold Ingot with Metadata of 0
	
	public static ItemStack black_dye = new ItemStack(Items.DYE,1,0); //One Black Dye (Ink Sac) Notice Metadata is 0
	public static ItemStack green_dye = new ItemStack(Items.DYE,1,2); //One Cactus Green Notice Metadata is 2
	public static ItemStack yellow_dye = new ItemStack(Items.DYE,1,11); //One Yellow Dye Notice Metadata is 11
	
	//VANILLA BLOCKS
	public static ItemStack stone = new ItemStack(Blocks.STONE,1,0); //One Stone

}
