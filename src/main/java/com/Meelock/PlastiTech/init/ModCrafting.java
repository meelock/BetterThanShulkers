package com.Meelock.PlastiTech.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bucket_unboiled_polymer_fluid),
				new Object[] { Items.WATER_BUCKET, ModItems.tooth, new ItemStack(Items.DYE, 1, 15) });
		GameRegistry.addSmelting(ModItems.bucket_unboiled_polymer_fluid,
				new ItemStack(ModItems.bucket_boiled_polymer_fluid), 4);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.mortar_and_pestal), " I ", "BIB", " B ", 'B', Blocks.STONE,
				'I', Items.STICK);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gold_dust),
				new Object[] { Items.GOLD_INGOT, ModItems.mortar_and_pestal });
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.unfired_ingot_mold), "   ", "C C", "CCC", 'C',
				Items.CLAY_BALL);
		GameRegistry.addSmelting(new ItemStack(ModItems.unfired_ingot_mold), new ItemStack(ModItems.ingot_mold), 4);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.filled_plastic_bar_mold),
				new Object[] { ModItems.bucket_boiled_polymer_fluid, ModItems.ingot_mold });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.filled_reinforced_plastic_bar_mold),
				new Object[] { ModItems.filled_plastic_bar_mold, Items.STRING, Items.IRON_INGOT });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hot_sticky_plastic_bar),
				new Object[] { ModItems.filled_plastic_bar_mold });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hot_sticky_reinforced_plastic_bar),
				new Object[] { ModItems.filled_reinforced_plastic_bar_mold });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.reinforced_plastic_ingot),
				new Object[] { ModItems.hot_sticky_reinforced_plastic_bar, Blocks.ICE });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.plastic_ingot),
				new Object[] { ModItems.hot_sticky_plastic_bar, Blocks.ICE });
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.mining_drill, 1, 1998), "   ", "   ", "   ", 'P', ModItems.reinforced_plastic_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mining_drill, 1, ModItems.mining_drill.getDamage(stack) - 20), new Object[] {ModItems.mining_drill, Items.REDSTONE});

	}

}
