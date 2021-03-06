package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGeneric extends Item {

	public ItemGeneric(PlastiTechReference.PlastiTechItems itemtype) {
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
	}
}
