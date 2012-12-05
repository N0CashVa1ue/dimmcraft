package tak.dimmcraft.conf;

import net.minecraftforge.common.Configuration;

public class ConfDimmFurnace {
	
	public static boolean DimmFurnaceStatus;

	public static void configLoad (Configuration cfg) {
		
		configGeneral(cfg);
	}
	
	private static void configGeneral (Configuration cfg) {
		
		DimmFurnaceStatus = cfg.get(Configuration.CATEGORY_GENERAL, "DimmFurnace", true).getBoolean(true);
	}
}
