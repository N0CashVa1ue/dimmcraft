package tak.dimmcraft.handlers;

import tak.dimmcraft.items.pack.SlimeCubeChunk;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class ItemHandler {

	public static void itemLoader(FMLInitializationEvent event) {
		
		SlimeCubeChunk.loadItem(event);
	}

}
