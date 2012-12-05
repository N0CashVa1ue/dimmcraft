package tak.dimmcraft.conf;

import net.minecraftforge.common.Configuration;

public class ConfPackageItems {
	
	public static boolean PackageItems;

	public static void configLoad (Configuration cfg) {
		
		configGeneral(cfg);
	}
	
	private static void configGeneral (Configuration cfg) {
		
		PackageItems = cfg.get(Configuration.CATEGORY_GENERAL, "PackageItems", true).getBoolean(true);
	}
}
