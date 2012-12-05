package tak.dimmcraft.client;

import tak.dimmcraft.DimmClientCommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

// DimmCraft's Client Modding Client Proxy
public class DimmClientProxy extends DimmClientCommonProxy {

	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
	}
}
