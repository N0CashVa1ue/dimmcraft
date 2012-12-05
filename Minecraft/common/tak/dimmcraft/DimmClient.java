package tak.dimmcraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "DimmCraft Client", name="DimmCraft Client", version = "1.4.5:0.1")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
public class DimmClient {

//	The instance of your mod that Forge uses.
	@Instance("DimmCraft Client")
	public static DimmClient instance;
	
//	Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="tak.dimmcraft.client.DimmClientProxy", serverSide="tak.dimmcraft.DimmClientCommonProxy")
	public static DimmClientCommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
}
