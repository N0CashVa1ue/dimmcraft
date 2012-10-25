package tak.dimmcraft;

import java.util.logging.Level;

import tak.dimmcraft.conf.ConfDimmFurnace;
import tak.dimmcraft.conf.ConfPackageBlocks;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.*;

public class ConfHandler {
	
//	Sets up the config to be handled
	public static void setupConfig(FMLPreInitializationEvent event) {
		
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		
		try {
			
			cfg.load();
			
			ConfDimmFurnace.configLoad(cfg);
			ConfPackageBlocks.configLoad(cfg);
		} catch (Exception e) {
			
			FMLLog.log(Level.SEVERE, e, "DimmCraft failed to load config file.");
		} finally {
			
			cfg.save();
		}
	}
}
