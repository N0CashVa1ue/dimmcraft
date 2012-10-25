package tak.dimmcraft.conf;

import net.minecraftforge.common.Configuration;

public class ConfPackageBlocks {
	
	public static boolean PackageBlocks;

	public static void configLoad (Configuration cfg) {
		
		configGeneral(cfg);
	}
	
	private static void configGeneral (Configuration cfg) {
		
		PackageBlocks = cfg.get(Configuration.CATEGORY_GENERAL, "PackageBlocks", true).getBoolean(true);
	}
}
