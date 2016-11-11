package com.Meelock.PlastiTech.init;

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting {

	public static void register() {

		
		// furnace recipes.
		GameRegistry.addSmelting(ModItems.bucket_unboiled_polymer_fluid,
				new ItemStack(ModItems.bucket_boiled_polymer_fluid), 4);
		GameRegistry.addSmelting(new ItemStack(ModItems.unfired_ingot_mold), 
				new ItemStack(ModItems.ingot_mold), 4);
		GameRegistry.addSmelting(new ItemStack(Blocks.SOUL_SAND), new ItemStack(ModItems.soul_ash), 0);
		//shaped recipes.
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mortar_and_pestal), " I ", "BIB", " B ", 
				'B', "stone", 'I', Items.STICK));
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.unfired_ingot_mold), "   ", "C C", "CCC", 'C',
				Items.CLAY_BALL);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.plastic_block), "III", "III", "III", 
				'I', ModItems.plastic_ingot);
		
		//shapeless recipes!
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.plastic_ingot, 9), 
				new Object[] {ModBlocks.plastic_block});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gold_dust),
				new Object[] { Items.GOLD_INGOT, ModItems.mortar_and_pestal });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.filled_plastic_bar_mold),
				new Object[] { ModItems.bucket_boiled_polymer_fluid, ModItems.ingot_mold });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bucket_unboiled_polymer_fluid),
				new Object[] { Items.WATER_BUCKET, ModItems.tooth, new ItemStack(Items.DYE, 1, 15) });
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
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamantine_ingot),
				new Object[] { ModItems.soul_ash, Items.DIAMOND, Items.IRON_INGOT });

		/*
		 * (with his help i made part of this) cw84's in part code:
		 */

		// Get all vanilla recipes...
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> recipe = recipes.iterator();

		// Cycle through and find the item we want to change...
		while (recipe.hasNext()) {
			ItemStack it = recipe.next().getRecipeOutput();

			if (it != null) {
				Item thing = it.getItem();

				if (thing == Items.DIAMOND_AXE) {
					recipe.remove();
				}
				if (thing == Items.DIAMOND_HOE) {
					recipe.remove();
				}
				if (thing == Items.DIAMOND_PICKAXE) {
					recipe.remove();
				}
				if (thing == Items.DIAMOND_SHOVEL) {
					recipe.remove();
				}
				if (thing == Items.DIAMOND_SWORD) {
					recipe.remove();
				}
			}
		}
		// Add replacement diamond stuff recipes.
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_AXE),
				new Object[] { "DD", "DS", " S", 'D', ModItems.diamantine_ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_HOE),
				new Object[] { "DD", " S", " S", 'D', ModItems.diamantine_ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_PICKAXE),
				new Object[] { "DDD", " S ", " S ", 'D', ModItems.diamantine_ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_SHOVEL),
				new Object[] { "D", "S", "S", 'D', ModItems.diamantine_ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_SWORD),
				new Object[] { "D", "D", "S", 'D', ModItems.diamantine_ingot, 'S', Items.STICK });

	}

}
