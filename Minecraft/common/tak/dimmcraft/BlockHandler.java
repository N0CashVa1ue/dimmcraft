package tak.dimmcraft;

import cpw.mods.fml.common.event.FMLInitializationEvent;

import tak.dimmcraft.blocks.pack.BoneBlock;
import tak.dimmcraft.blocks.pack.RedstoneBlock;
import tak.dimmcraft.blocks.pack.SlimeBlock;
import tak.dimmcraft.blocks.pack.SugarcaneBlock;
import tak.dimmcraft.blocks.pack.WheatBlock;

import tak.dimmcraft.conf.ConfPackageBlocks;

public class BlockHandler {
	
//	Loads all the blocks against the config
	public static void blockLoader (FMLInitializationEvent event) {
		
//		Could crash client if config doesn't match server
		if (ConfPackageBlocks.PackageBlocks == true) {
			
			SlimeBlock.loadBlock(event);
			BoneBlock.loadBlock(event);
			RedstoneBlock.loadBlock(event);
			SugarcaneBlock.loadBlock(event);
			WheatBlock.loadBlock(event);
		}
	}
}
