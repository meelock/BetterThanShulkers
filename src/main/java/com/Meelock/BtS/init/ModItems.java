package com.Meelock.BtS.init;

import com.Meelock.BtS.BtSReference;
import com.Meelock.BtS.items.ItemGeneric;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item plastic_ingot;

	public static void init() {
		plastic_ingot = new ItemGeneric(BtSReference.BtSItems.PLASTIC_INGOT);
	}

	public static void register() {
		GameRegistry.register(plastic_ingot);
	}

	public static void registerRenders() {
		registerRender(plastic_ingot);
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "Inventory"));
	}
}
