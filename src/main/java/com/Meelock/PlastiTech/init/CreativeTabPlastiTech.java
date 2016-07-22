package com.Meelock.PlastiTech.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabPlastiTech extends CreativeTabs {
	
	public static final CreativeTabs tabPlastiTech = new CreativeTabPlastiTech();

	public CreativeTabPlastiTech() {
		super("PlastiTech");
	}
	

	@Override
	public Item getTabIconItem() {
		return ModItems.filled_plastic_bar_mold;
	}

}
