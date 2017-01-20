package com.mramericanmike.barebones.items;

import net.minecraft.item.Item;

import com.mramericanmike.barebones.ModInfo;
import com.mramericanmike.barebones.creativetab.ModCreativeTab;

public class GenericModItem extends Item
{
	
	public GenericModItem(String name)
	{
		super();
		this.setCreativeTab(ModCreativeTab.MOD_TAB);
		this.setUnlocalizedName(ModInfo.MODID.toLowerCase() + ":" + name);
		this.setRegistryName(name);
	}
	
}
