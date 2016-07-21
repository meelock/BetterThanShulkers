package com.Meelock.BtS.init;

import com.Meelock.BtS.BtSReference;
import com.Meelock.BtS.items.ItemGeneric;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item plastic_ingot;
	public static Item hot_sticky_lightly_reinforced_plastic_bar;
	public static Item gold_dust;
	public static Item bucket_unboiled_polymer_fluid;
	public static Item bucket_boiled_polymer_fluid;
	public static Item hot_sticky_plastic_bar;
	public static Item lightly_reinforced_plastic_ingot;
	public static Item mortar_and_pestal;
	public static Item tooth;
	

	public static void init() {
		plastic_ingot = new ItemGeneric(BtSReference.BtSItems.PLASTIC_INGOT);
		hot_sticky_lightly_reinforced_plastic_bar = new ItemGeneric(BtSReference.BtSItems.HOT_STICKY_LIGHTLY_REINFORCED_PLASTIC_BAR);
		gold_dust = new ItemGeneric(BtSReference.BtSItems.GOLD_DUST);
		bucket_unboiled_polymer_fluid = new ItemGeneric(BtSReference.BtSItems.BUCKET_UNBOILED_POLYMER_FLUID);
		bucket_boiled_polymer_fluid = new ItemGeneric(BtSReference.BtSItems.BUCKET_BOILED_POLYMER_FLUID);
		hot_sticky_plastic_bar = new ItemGeneric(BtSReference.BtSItems.HOT_STICKY_PLASTIC_BAR);
		lightly_reinforced_plastic_ingot = new ItemGeneric(BtSReference.BtSItems.LIGHTLY_REINFORCED_PLASTIC_INGOT);
		mortar_and_pestal = new ItemGeneric(BtSReference.BtSItems.MORTAR_AND_PESTAL);
		tooth = new ItemGeneric(BtSReference.BtSItems.TOOTH);
	}

	public static void register() {
		GameRegistry.register(plastic_ingot);
		GameRegistry.register(hot_sticky_lightly_reinforced_plastic_bar);
		GameRegistry.register(gold_dust);
		GameRegistry.register(bucket_unboiled_polymer_fluid);
		GameRegistry.register(bucket_boiled_polymer_fluid);
		GameRegistry.register(hot_sticky_plastic_bar);
		GameRegistry.register(lightly_reinforced_plastic_ingot);
		GameRegistry.register(mortar_and_pestal);
		GameRegistry.register(tooth);
	}

	public static void registerRenders() {
		registerRender(plastic_ingot);
		registerRender(hot_sticky_lightly_reinforced_plastic_bar);
		registerRender(gold_dust);
		registerRender(bucket_unboiled_polymer_fluid);
		registerRender(bucket_boiled_polymer_fluid);
		registerRender(hot_sticky_plastic_bar);
		registerRender(lightly_reinforced_plastic_ingot);
		registerRender(mortar_and_pestal);
		registerRender(tooth);
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "Inventory"));
	}
}
