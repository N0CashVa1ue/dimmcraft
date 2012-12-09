package tak.dimmcraft.handlers;

import java.util.logging.Level;

import tak.dimmcraft.conf.ConfDimmFurnace;
import tak.dimmcraft.conf.ConfIndiclarus;
import tak.dimmcraft.conf.ConfPackageItems;

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
			ConfPackageItems.configLoad(cfg);
			ConfIndiclarus.configLoad(cfg);
		} catch (Exception e) {
			
			FMLLog.log(Level.SEVERE, e, "DimmCraft failed to load config file.");
		} finally {
			
			cfg.save();
		}
	}
}
