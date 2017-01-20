package com.mramericanmike.barebones.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.mramericanmike.barebones.ModInfo;
import com.mramericanmike.barebones.init.ModItems;

public class ModCreativeTab {
	
	public static final CreativeTabs MOD_TAB = new CreativeTabs(ModInfo.MODID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.EXAMPLE_ITEM;
		}
	};

}
