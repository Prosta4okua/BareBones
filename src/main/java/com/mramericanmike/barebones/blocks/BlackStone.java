package com.mramericanmike.barebones.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.mramericanmike.barebones.ModInfo;
import com.mramericanmike.barebones.init.ModItems;

public class BlackStone extends GenericModBlock {
	
	public BlackStone(Material materialIn, String name) {
		super(materialIn, name);
		this.setUnlocalizedName(ModInfo.MODID + ":" + name);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
		
	}
	
	//When player right clicks a block
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		if(!worldIn.isRemote){
		if(heldItem != null) {
        	Item itemUsed = heldItem.getItem();
        	if(itemUsed==ModItems.SCISSOR)
        	{
        		worldIn.destroyBlock(pos, true);
        	}
		}
		
        return false;
        
		}
		
		return false;
    }
	

}
