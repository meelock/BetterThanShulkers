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
		

	}

}
