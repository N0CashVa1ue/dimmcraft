package tak.dimmcraft.blocks;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import tak.dimmcraft.blocks.pack.RedstoneBlock;
import tak.dimmcraft.conf.ConfPackageItems;
import tak.dimmcraft.handlers.BlockHandler;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class Indiclarus extends BlockHandler {

//	Loads the block against BlockLoader
	public static void loadBlock (FMLInitializationEvent event) {
		
		final Block indiclarius = new Indiclarus(905, 3, Material.glass)
		.setHardness(-1F).setStepSound(Block.soundGlassFootstep)
		.setBlockName("indiclarius").setCreativeTab(CreativeTabs.tabDecorations);
		
		BlockHandler.registerBlock(indiclarius, "Indiclarius", "pickaxe", 0);
	}
	
	public Indiclarus(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
	}
}
