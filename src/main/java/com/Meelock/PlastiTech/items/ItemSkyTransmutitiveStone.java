package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.PlastiTechReference.PlastiTechItems;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;
import com.Meelock.PlastiTech.init.ModItems;

import net.minecraft.item.Item;

public class ItemSkyTransmutitiveStone extends Item {

	public ItemSkyTransmutitiveStone(PlastiTechReference.PlastiTechItems itemtype) {
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setContainerItem(ModItems.sky_transmutitive_stone);
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
	}

}
