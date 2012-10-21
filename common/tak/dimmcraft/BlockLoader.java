package tak.dimmcraft;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import tak.dimmcraft.blocks.SlimeBlock;

public class BlockLoader {
	
	public static void blockLoader (FMLInitializationEvent event) {
	
		SlimeBlock.loadBlock(event);
	}
}
