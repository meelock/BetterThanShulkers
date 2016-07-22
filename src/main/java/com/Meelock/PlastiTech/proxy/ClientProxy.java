package com.Meelock.PlastiTech.proxy;

import com.Meelock.PlastiTech.init.ModBlocks;
import com.Meelock.PlastiTech.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
