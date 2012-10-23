package tak.dimmcraft;

import cpw.mods.fml.common.event.FMLInitializationEvent;

import tak.dimmcraft.ConfHandler;

import tak.dimmcraft.blocks.pack.BoneBlock;
import tak.dimmcraft.blocks.pack.RedstoneBlock;
import tak.dimmcraft.blocks.pack.SlimeBlock;
import tak.dimmcraft.blocks.pack.SugarcaneBlock;
import tak.dimmcraft.blocks.pack.WheatBlock;

public class BlockLoader {
	
	/* Loads all the blocks against the config */
	public static void blockLoader (FMLInitializationEvent event) {
	
		if (ConfHandler.PackageBlocks == true) {
			SlimeBlock.loadBlock(event);
			BoneBlock.loadBlock(event);
			RedstoneBlock.loadBlock(event);
			SugarcaneBlock.loadBlock(event);
			WheatBlock.loadBlock(event);
		}
	}
}
