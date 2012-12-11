package tak.dimmcraft.blocks;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import tak.dimmcraft.DimmCraftCommonProxy;
import tak.dimmcraft.blocks.pack.RedstoneBlock;
import tak.dimmcraft.conf.ConfIndiclarus;
import tak.dimmcraft.conf.ConfPackageItems;
import tak.dimmcraft.handlers.BlockHandler;
import net.minecraft.src.Block;
import net.minecraft.src.BlockBreakable;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class Indiclarus extends BlockBreakable {

//	Loads the block against BlockLoader
	public static void loadBlock (FMLInitializationEvent event) {
		
		final Block indiclarus = new Indiclarus(ConfIndiclarus.Indiclarus, 48, Material.glass, false)
		.setHardness(-1F).setStepSound(Block.soundGlassFootstep)
		.setBlockName("indiclarus").setCreativeTab(CreativeTabs.tabDecorations);
		
		BlockHandler.registerBlock(indiclarus, "Indiclarus", "pickaxe", 0);
	}
	
	public Indiclarus(int par1, int par2, Material par3Material, boolean par4) {
	        
		super(par1, par2, par3Material, par4);
	}
	
	@Override
	public String getTextureFile () {
		
		return DimmCraftCommonProxy.BLOCKS_PNG;
	}
}
