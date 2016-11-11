//package com.Meelock.PlastiTech.init;
//
//import net.minecraft.inventory.InventoryCrafting;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.oredict.ShapelessOreRecipe;
//
////public class ChargeRedstoneDrillWithRedstoneDustHandler extends ShapelessOreRecipe {
//
//	//public ChargeRedstoneDrillWithRedstoneDustHandler(ItemStack result, Object[] recipe, ItemStack drillItem) {
//		super(result, recipe);
//		
//	}
//
//	@Override
//	public ItemStack getCraftingResult(InventoryCrafting inv) {
//		ItemStack CraftingOutput = super.getCraftingResult(inv);
//		if(drill!=null)
//			for(int i=0; i<CraftingOutput.stackSize; i++)
//				if(CraftingOutput==null && inv.getStackInSlot(i)!=null && tool.matchesItemStack(inv.getStackInSlot(i)))
//				{
//					ItemStack damaged = inv.getStackInSlot(i).copy();
//					damaged.setItemDamage(damaged.getItemDamage()+1);
//					if(damaged.getItemDamage()<=damaged.getMaxDamage())
//						CraftingOutput = damaged;
//				}
//				else if(CraftingOutput!=null && tool.matchesItemStack(CraftingOutput))
//				{
//					CraftingOutput.setItemDamage(CraftingOutput.getItemDamage()+1);
//					if(CraftingOutput.getItemDamage()>CraftingOutput.getMaxDamage())
//						CraftingOutput = null;
//				}
//		return CraftingOutput;
//	}
//
//}