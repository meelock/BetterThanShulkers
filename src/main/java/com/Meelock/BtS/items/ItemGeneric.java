package com.Meelock.BtS.items;

import com.Meelock.BtS.BtSReference;

import net.minecraft.item.Item;

public class ItemGeneric extends Item {

	public ItemGeneric(BtSReference.BtSItems itemtype) {
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
	}
}
