package com.Meelock.BtS.init;

import com.Meelock.BtS.BtSReference;
import com.Meelock.BtS.blocks.BlockElectric_fence;
import com.Meelock.BtS.blocks.BlockGeneric;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block tentacle;
	public static Block electric_fence;

	public static void init() {
		tentacle = new BlockGeneric(BtSReference.BtSBlocks.TENTACLE);
		electric_fence = new BlockElectric_fence(Material.ROCK, MapColor.DIRT, BtSReference.BtSBlocks.ELECTRIC_FENCE);
	}

	public static void register() {
		registerBlock(tentacle);
		registerBlock(electric_fence);
	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void registerRenders() {
		registerRender(tentacle);
		registerRender(electric_fence);
	}

	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "Inventory"));
	}
}
