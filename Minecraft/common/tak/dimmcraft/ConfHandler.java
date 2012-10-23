package tak.dimmcraft;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.*;

public class ConfHandler {

	public static boolean DimmFurnace;
	public static boolean PackageBlocks;
	
	/** Sets up the config to be handled */
	public static void setupConfig(FMLPreInitializationEvent event) {
		
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		
		try {
			
			cfg.load();
			// Setup config instance grabber
			DimmFurnace = cfg.get(Configuration.CATEGORY_GENERAL, "DimmFurnace", true).getBoolean(true);
			PackageBlocks = cfg.get(Configuration.CATEGORY_GENERAL, "PackageBlocks", true).getBoolean(true);
		} catch (Exception e) {
			
			FMLLog.log(Level.SEVERE, e, "DimmCraft failed to load config file.");
		} finally {
			
			cfg.save();
		}
	}
}
