package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ItemCoolingHSRPlasticBar extends Item {
	
	
	
	public ItemCoolingHSRPlasticBar(PlastiTechReference.PlastiTechItems itemtype) {
        setHasSubtypes(true);
        setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
	}
	
	
	

	int time;

	@SubscribeEvent
	public void onPlayerTick(TickEvent.ServerTickEvent event) {

		time++;

		if (time >= 40) {
			time = 0;
			//System.out.println("kind of worked");
			
		}
	}
}
