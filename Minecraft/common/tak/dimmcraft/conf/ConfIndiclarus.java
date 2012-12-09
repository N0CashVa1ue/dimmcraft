package tak.dimmcraft.conf;

import net.minecraftforge.common.Configuration;

public class ConfIndiclarus {

	public static int Indiclarus;
	
	public static void configLoad (Configuration cfg) {
		
		configGeneral(cfg);
		configBlock(cfg);
		configItem(cfg);
	}
	
	private static void configGeneral (Configuration cfg) {
		
	}
	
	private static void configBlock (Configuration cfg) {
		
		Indiclarus = cfg.get(Configuration.CATEGORY_BLOCK, "Indiclarus", 901).getInt();
	}
	
	private static void configItem (Configuration cfg) {
		
	}
}
