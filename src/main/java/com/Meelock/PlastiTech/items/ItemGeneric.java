package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;

import net.minecraft.item.Item;

public class ItemGeneric extends Item {

	public ItemGeneric(PlastiTechReference.PlastiTechItems itemtype) {
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
	}
}
