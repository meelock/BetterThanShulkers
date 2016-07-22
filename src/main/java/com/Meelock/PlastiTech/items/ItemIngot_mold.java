package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.PlastiTechReference.PlastiTechItems;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;
import com.Meelock.PlastiTech.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIngot_mold extends Item {
	
	public ItemIngot_mold(PlastiTechReference.PlastiTechItems itemtype)  {
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setContainerItem(ModItems.ingot_mold);
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
	}
}
