package tak.dimmcraft.client;

import net.minecraftforge.client.MinecraftForgeClient;
import tak.dimmcraft.CommonProxy;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
	}
	
}