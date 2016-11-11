package com.Meelock.PlastiTech;

public class PlastiTechReference {
	public static final String MOD_ID = "plastitech";
	public static final String NAME = "PlastiTech";
	public static final String VERSION = "0.0.1-alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";

	public static final String CLIENT_PROXY_CLASS = "com.Meelock.PlastiTech.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Meelock.PlastiTech.proxy.ServerProxy";

	public static enum PlastiTechItems {
		PLASTIC_INGOT("plastic_ingot", "ItemPlastic_ingot"),
		HOT_STICKY_REINFORCED_PLASTIC_BAR("hot_sticky_reinforced_plastic_bar", "ItemHot_sticky_reinforced_plastic_bar"),
		GOLD_DUST("gold_dust", "ItemGold_dust"),
		BUCKET_UNBOILED_POLYMER_FLUID("bucket_unboiled_polymer_fluid", "ItemBucket_unboiled_polymer_fluid"),
		BUCKET_BOILED_POLYMER_FLUID("bucket_boiled_polymer_fluid", "ItemBucket_boiled_polymer_fluid"),
		HOT_STICKY_PLASTIC_BAR("hot_sticky_plastic_bar", "ItemHot_sticky_plastic_bar"),
		REINFORCED_PLASTIC_INGOT("reinforced_plastic_ingot", "ItemReinforced_plastic_ingot"),
		MORTAR_AND_PESTAL("mortar_and_pestal", "ItemMortar_and_pestal"),
		TOOTH("tooth", "ItemTooth"),
		INGOT_MOLD("ingot_mold", "ItemIngot_mold"),
		FILLED_PLASTIC_BAR_MOLD("filled_plastic_bar_mold", "ItemFilled_plastic_bar_mold"),
		UNFIRED_INGOT_MOLD("unfired_ingot_mold", "ItemUnfired_ingot_mold"),
		FILLED_REINFORCED_PLASTIC_BAR_MOLD("filled_reinforced_plastic_bar_mold",
				"ItemFilled_reinforced_plastic_bar_mold"),
		MINING_DRILL("mining_drill", "ItemMining_drill"),
		SKY_TRANSMUTITIVE_STONE("sky_transmutitive_stone", "ItemSky_transmutitive_stone"),
		EARTH_TRANSMUTITIVE_STONE("earth_transmutitive_stone", "ItemEarth_transmutitive_stone"),
		ENDER_CONTROL_UNIT("ender_control_unit", "ItemEnder_control_unit"), 
		diamantine_ingot("diamantine_ingot", "ItemDiamantine_ingot"), 
		soul_ash("soul_ash", "ItemSoul_ash"), 
		slag_iron_ingot("slag_iron_ingot", "ItemSlag_iron_ingot"), 
		smelted_iron_ingot("smelted_iron_ingot", "ItemSmelted_iron_ingot"), 
		slag_iron_dust("slag_iron_dust", "ItemSlag_iron_dust"), 
		slag_iron_nugget("slag_iron_nugget", "ItemSlag_iron_nugget"), //hi there
		smelted_iron_dust("smelted_iron_dust", "ItemSmelted_iron_dust"), 
		smelted_iron_nugget("smelted_iron_nugget", "ItemSmelted_iron_nugget");

		private String unlocalizedName;
		private String registryName;

		PlastiTechItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}
	}

	public static enum PlastiTechBlocks {
		TENTACLE("Tentacle", "BlockTentacle"),
		TENTACLE_SUCKER("Tentacle_sucker", "BlockTentacleSucker"),
		ELECTRIC_FENCE("electric_fence", "BlockElectric_fence"),
		PLASTIC_BLOCK("plastic_block", "BlockPlastic_block"),
		PARADOXITE_ORE("paradoxite_ore", "BlockParadoxite_ore");

		private String unlocalizedName;
		private String registryName;

		PlastiTechBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}
	}

}