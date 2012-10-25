package tak.dimmcraft;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "DimmCraft", name="DimmCraft", version = "1.3.2:0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DimmCraft {
	
	
	// The instance of your mod that Forge uses.
	@Instance("DimmCraft")
	public static DimmCraft instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="tak.dimmcraft.client.ClientProxy", serverSide="tak.dimmcraft.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfHandler.setupConfig(event);
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		BlockHandler.blockLoader(event);
		
		proxy.registerRenderers();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
}
