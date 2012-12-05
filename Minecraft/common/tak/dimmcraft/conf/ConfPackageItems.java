package tak.dimmcraft.conf;

import net.minecraftforge.common.Configuration;

public class ConfPackageItems {
	
	public static boolean PackageItems;
	public static boolean PackageBlocks;

	public static void configLoad (Configuration cfg) {
		
		configGeneral(cfg);
	}
	
	private static void configGeneral (Configuration cfg) {
		
		PackageItems = cfg.get(Configuration.CATEGORY_GENERAL, "ModulePackageItemsOn", true).getBoolean(true);
		PackageBlocks = cfg.get(Configuration.CATEGORY_GENERAL, "ModulePackageBlocksOn", true).getBoolean(true);
	}
}
