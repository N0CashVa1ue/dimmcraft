package tak.dimmcraft.handlers;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import tak.dimmcraft.blocks.Indiclarus;
import tak.dimmcraft.blocks.pack.BoneBlock;
import tak.dimmcraft.blocks.pack.RedstoneBlock;
import tak.dimmcraft.blocks.pack.SugarcaneBlock;
import tak.dimmcraft.blocks.pack.WheatBlock;

import tak.dimmcraft.conf.ConfPackageItems;

public class BlockHandler extends Block {

	//	Loads all the blocks against the config
	public static void blockLoader (FMLInitializationEvent event) {
		
		// Ore Blocks
		
		// Package Blocks
//		Could crash client if config doesn't match server
		if (ConfPackageItems.PackageBlocks == true) {
			
//			BoneBlock.loadBlock(event);
			RedstoneBlock.loadBlock(event);
//			SugarcaneBlock.loadBlock(event);
//			WheatBlock.loadBlock(event);
		}
		
		//Etc
		Indiclarus.loadBlock(event);
	}
	
//	Registers a block against Block
	public static void registerBlock (Block block, String string, String string1, Integer int1 ) {
		
		LanguageRegistry.addName(block, string);
		MinecraftForge.setBlockHarvestLevel(block, string1, int1);
		GameRegistry.registerBlock(block);
	}
	
//	Implements an Abstract inheritance of Block for Dimmcraft Modules to use
	public BlockHandler(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
		// TODO Auto-generated constructor stub
	}
}
