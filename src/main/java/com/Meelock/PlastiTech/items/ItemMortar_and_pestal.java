package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;
import com.Meelock.PlastiTech.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMortar_and_pestal extends Item {

	public ItemMortar_and_pestal(PlastiTechReference.PlastiTechItems itemtype) {
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setContainerItem(ModItems.mortar_and_pestal);
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);

	}
}
