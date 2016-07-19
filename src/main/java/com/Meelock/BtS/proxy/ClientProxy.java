package com.Meelock.BtS.proxy;

import com.Meelock.BtS.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}

	
}
