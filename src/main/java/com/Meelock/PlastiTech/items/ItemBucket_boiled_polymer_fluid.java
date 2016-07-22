package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;
import com.Meelock.PlastiTech.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemBucket_boiled_polymer_fluid extends Item {

public ItemBucket_boiled_polymer_fluid(PlastiTechReference.PlastiTechItems itemtype) {
	setUnlocalizedName(itemtype.getUnlocalizedName());
	setRegistryName(itemtype.getRegistryName());
	setContainerItem(Items.BUCKET);
	setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
}
}