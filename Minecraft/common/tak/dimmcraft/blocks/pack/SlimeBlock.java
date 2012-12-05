package tak.dimmcraft.blocks.pack;

import tak.dimmcraft.CommonProxy;
import tak.dimmcraft.blocks.PackageBlock;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

import net.minecraftforge.common.MinecraftForge;

public class SlimeBlock extends PackageBlock {
	
//	Loads the block against BlockLoader
	public static void loadBlock (FMLInitializationEvent event) {
		
		final Block slimeBlock = new SlimeBlock(500, 0, Material.ground)
		.setHardness(0.5F).setStepSound(Block.soundGravelFootstep)
		.setBlockName("slimeBlock").setCreativeTab(CreativeTabs.tabDecorations);
		
		PackageBlock.registerBlock(slimeBlock, "Slime Block", "shovel");
		crafting(slimeBlock);
	}
	
//	Handles crafting up to this tier
	public static void crafting (Block slimeBlock) {
		
		ItemStack slimeballStack = new ItemStack(Item.slimeBall);
		ItemStack slimeBlockStack = new ItemStack(slimeBlock);
		
		PackageBlock.recipeSetup(slimeBlockStack, slimeballStack, Item.slimeBall);
	}
	
//	Constructs the block against Block
	public SlimeBlock (int id, int texture, Material material) {
		super(id, texture, material);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCKS_PNG;
	}

}
