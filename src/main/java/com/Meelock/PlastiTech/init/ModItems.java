package com.Meelock.PlastiTech.init;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.items.ItemBucket_boiled_polymer_fluid;
import com.Meelock.PlastiTech.items.ItemGeneric;
import com.Meelock.PlastiTech.items.ItemMortar_and_pestal;

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
	public static Item ingot_mold;
	

	public static void init() {
		plastic_ingot = new ItemGeneric(PlastiTechReference.PlastiTechItems.PLASTIC_INGOT);
		hot_sticky_lightly_reinforced_plastic_bar = new ItemGeneric(PlastiTechReference.PlastiTechItems.HOT_STICKY_LIGHTLY_REINFORCED_PLASTIC_BAR);
		gold_dust = new ItemGeneric(PlastiTechReference.PlastiTechItems.GOLD_DUST);
		bucket_unboiled_polymer_fluid = new ItemGeneric(PlastiTechReference.PlastiTechItems.BUCKET_UNBOILED_POLYMER_FLUID);
		bucket_boiled_polymer_fluid = new ItemBucket_boiled_polymer_fluid(PlastiTechReference.PlastiTechItems.BUCKET_BOILED_POLYMER_FLUID);
		hot_sticky_plastic_bar = new ItemGeneric(PlastiTechReference.PlastiTechItems.HOT_STICKY_PLASTIC_BAR);
		lightly_reinforced_plastic_ingot = new ItemGeneric(PlastiTechReference.PlastiTechItems.LIGHTLY_REINFORCED_PLASTIC_INGOT);
		mortar_and_pestal = new ItemMortar_and_pestal(PlastiTechReference.PlastiTechItems.MORTAR_AND_PESTAL);
		tooth = new ItemGeneric(PlastiTechReference.PlastiTechItems.TOOTH);
		ingot_mold = new ItemIngot_mold(PlastiTechReference.PlastiTechItems.INGOT_MOLD);
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
		GameRegistry.register(ingot_mold);
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
		registerRender(ingot_mold);
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "Inventory"));
	}
}
