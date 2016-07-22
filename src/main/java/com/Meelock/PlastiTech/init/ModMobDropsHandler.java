package com.Meelock.PlastiTech.init;

import java.util.Random;

import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.KilledByPlayer;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModMobDropsHandler {
	
	@SubscribeEvent
	public void onLootTablesLoaded(LootTableLoadEvent event) {
	  
	    if (event.getName().equals(LootTableList.ENTITIES_SKELETON)) {

	        final LootPool main = event.getTable().getPool("main");
	         
	        if (main != null) {

	            // pool2.addEntry(new LootEntryItem(ITEM, WEIGHT, QUALITY, FUNCTIONS, CONDITIONS, NAME));
	            main.addEntry(new LootEntryItem(ModItems.tooth, 1, 0, new LootFunction[0] , new LootCondition[] { new KilledByPlayer(false)}, "PlastiTech:tooth"));
	        }
	          
	    }
	}
}
