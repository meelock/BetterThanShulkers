package com.Meelock.PlastiTech.init;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.PlastiTechReference.PlastiTechItems;

import net.minecraft.item.Item;

public class ItemIngot_mold extends Item {

	public ItemIngot_mold(PlastiTechReference.PlastiTechItems itemtype)  {
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setContainerItem(ModItems.ingot_mold);
	}
}
