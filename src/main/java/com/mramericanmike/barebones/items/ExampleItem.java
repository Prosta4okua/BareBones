package com.mramericanmike.barebones.items;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

import com.mramericanmike.barebones.Log;
import com.mramericanmike.barebones.ModInfo;
import com.mramericanmike.barebones.creativetab.ModCreativeTab;
import com.mramericanmike.barebones.sounds.ModSounds;

public class ExampleItem extends Item {
	
	public ExampleItem(String name){

		this.maxStackSize = 1;
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setRegistryName(name);
		this.setCreativeTab(ModCreativeTab.MOD_TAB);
		
	}
    
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
		
		worldIn.playSound(playerIn, playerIn.getPosition(), ModSounds.FROG, SoundCategory.MASTER, 1.0F, 1.0F);

		
        return new ActionResult(EnumActionResult.PASS, itemStackIn);
    }	
	

}