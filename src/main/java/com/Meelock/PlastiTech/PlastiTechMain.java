package com.Meelock.PlastiTech;

import com.Meelock.PlastiTech.init.ModBlocks;
import com.Meelock.PlastiTech.init.ModCrafting;
import com.Meelock.PlastiTech.init.ModItems;
import com.Meelock.PlastiTech.init.ModMobDropsHandler;
import com.Meelock.PlastiTech.proxy.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PlastiTechReference.MOD_ID, name = PlastiTechReference.NAME, version = PlastiTechReference.VERSION, acceptedMinecraftVersions = PlastiTechReference.ACCEPTED_VERSIONS)
public class PlastiTechMain {

	@Instance
	public static PlastiTechMain instance;

	@SidedProxy(clientSide = PlastiTechReference.CLIENT_PROXY_CLASS, serverSide = PlastiTechReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre init");

		ModItems.init();
		ModItems.register();

		ModBlocks.init();
		ModBlocks.register();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		System.out.println("init");
		proxy.init();
		
		ModCrafting.register();
		MinecraftForge.EVENT_BUS.register(new ModMobDropsHandler());
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		System.out.println("Post init");
	}
}
