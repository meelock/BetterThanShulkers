package com.Meelock.BtS;

public class BtSReference {
	public static final String MOD_ID = "BtS";
	public static final String NAME = "BetterThanShulkers";
	public static final String VERSION = "0.0.1-alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.Meelock.BtS.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Meelock.BtS.proxy.ServerProxy";

	public static enum BtSItems {
		PLASTIC("plastic", "ItemPlastic");
		
		private String unlocalizedName;
		private String registryName;
		
		
		BtSItems(String unlocalizedName, String registryName) {
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
