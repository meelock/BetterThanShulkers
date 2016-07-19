package com.Meelock.BtS;

import com.Meelock.BtS.init.ModItems;
import com.Meelock.BtS.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BtSReference.MOD_ID, name = BtSReference.NAME, version = BtSReference.VERSION, acceptedMinecraftVersions = BtSReference.ACCEPTED_VERSIONS)
public class BtSMain {
	
	@Instance
	public static BtSMain instance;
	
	@SidedProxy(clientSide = BtSReference.CLIENT_PROXY_CLASS, serverSide = BtSReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre init");
		
		ModItems.init();
		ModItems.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		System.out.println("init");
		proxy.init();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		System.out.println("Post init");
	}
}
