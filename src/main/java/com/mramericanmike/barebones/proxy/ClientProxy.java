package com.mramericanmike.barebones.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.mramericanmike.barebones.init.ModBlocks;
import com.mramericanmike.barebones.init.ModItems;

public class ClientProxy extends CommonProxy
{

	@Override
	public void preInit() {
		
		//Register Renders on Client Side Only
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		
	}

	
}
