package tak.dimmcraft.blocks;

import java.util.logging.Level;

import tak.dimmcraft.ConfHandler;

import net.minecraft.src.TileEntityFurnace;

import cpw.mods.fml.common.FMLLog;

public class DimmFurnace extends TileEntityFurnace {
	
	public static boolean isValid() {
		
		if (ConfHandler.DimmFurnace == true) {
			
			return true;
		} else {
			
			return false;
		}
	}
}
