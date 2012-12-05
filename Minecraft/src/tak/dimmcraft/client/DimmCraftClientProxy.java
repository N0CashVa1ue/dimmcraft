package tak.dimmcraft.client;

import net.minecraftforge.client.MinecraftForgeClient;
import tak.dimmcraft.DimmCraftCommonProxy;

public class DimmCraftClientProxy extends DimmCraftCommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
	}
	
}