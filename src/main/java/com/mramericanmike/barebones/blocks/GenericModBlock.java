package com.mramericanmike.barebones.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import com.mramericanmike.barebones.ModInfo;
import com.mramericanmike.barebones.creativetab.ModCreativeTab;

public class GenericModBlock extends Block {

	public GenericModBlock(String name) {
		super(Material.ROCK);
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setRegistryName(name);
		this.setCreativeTab(ModCreativeTab.MOD_TAB);
		this.setHardness(2F);
	}
	
	public GenericModBlock(Material material, String name) {
		super(material);
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setRegistryName(name);
		this.setCreativeTab(ModCreativeTab.MOD_TAB);
		this.setHardness(2F);
	}
	
	public GenericModBlock(Material material, String name, SoundType soundType) {
		super(material);
		this.setSoundType(soundType);
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setRegistryName(name);
		this.setCreativeTab(ModCreativeTab.MOD_TAB);
		this.setHardness(2F);
	}
	
}