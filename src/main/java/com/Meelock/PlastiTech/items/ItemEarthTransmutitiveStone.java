package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.PlastiTechReference.PlastiTechItems;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;
import com.Meelock.PlastiTech.init.ModItems;

import net.minecraft.item.Item;

public class ItemEarthTransmutitiveStone extends Item {

	public ItemEarthTransmutitiveStone(PlastiTechReference.PlastiTechItems itemtype) {
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setContainerItem(ModItems.earth_transmutitive_stone);
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
	}

}
