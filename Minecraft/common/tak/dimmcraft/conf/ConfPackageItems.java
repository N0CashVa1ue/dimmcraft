package tak.dimmcraft.conf;

import net.minecraftforge.common.Configuration;

public class ConfPackageItems {
	
	public static boolean PackageItems;
	public static boolean PackageBlocks;
	
	public static int SlimeCube;
	
	public static int RedstoneBlock;

	public static void configLoad (Configuration cfg) {
		
		configGeneral(cfg);
		configBlock(cfg);
		configItem(cfg);
	}
	
	private static void configGeneral (Configuration cfg) {
		
		PackageItems = cfg.get(Configuration.CATEGORY_GENERAL, "ModulePackageItemsOn", true).getBoolean(true);
		PackageBlocks = cfg.get(Configuration.CATEGORY_GENERAL, "ModulePackageBlocksOn", true).getBoolean(true);
	}
	
	private static void configBlock (Configuration cfg) {
		
		RedstoneBlock = cfg.get(Configuration.CATEGORY_BLOCK, "Redstone Block", 900).getInt();
	}
	
	private static void configItem (Configuration cfg) {
		
		SlimeCube = cfg.get(Configuration.CATEGORY_ITEM, "Slime Cube", 1800).getInt();
	}
}
