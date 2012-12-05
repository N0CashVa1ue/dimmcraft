package tak.dimmcraft.blocks.pack;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

import net.minecraftforge.common.MinecraftForge;

import tak.dimmcraft.CommonProxy;
import tak.dimmcraft.blocks.PackageBlock;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class SugarcaneBlock extends PackageBlock {
	
//	Loads the block against BlockLoader
	public static void loadBlock (FMLInitializationEvent event) {
		
		final Block sugarcaneBlock = new SugarcaneBlock(503, 3, Material.ground)
		.setHardness(0.5F).setStepSound(Block.soundGravelFootstep)
		.setBlockName("boneBlock").setCreativeTab(CreativeTabs.tabDecorations);
		
		PackageBlock.registerBlock(sugarcaneBlock, "Sugar Cane Block", "shovel");
		crafting(sugarcaneBlock);
	}
	
//	Handles crafting up to this tier
	public static void crafting (Block sugarcaneBlock) {
		
		ItemStack sugarcaneStack = new ItemStack(Item.reed);
		ItemStack sugarcaneBlockStack = new ItemStack(sugarcaneBlock);
		
		PackageBlock.recipeSetup(sugarcaneBlockStack, sugarcaneStack, Item.reed);
	}
	
//	Constructs the block against Block
	public SugarcaneBlock (int id, int texture, Material material) {
		super(id, texture, material);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCKS_PNG;
	}
}
