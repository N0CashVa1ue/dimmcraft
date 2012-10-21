package tak.dimmcraft.blocks;

import tak.dimmcraft.CommonProxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

import net.minecraftforge.common.MinecraftForge;

public class SlimeBlock extends Block {
	
	public static void loadBlock (FMLInitializationEvent event) {
		
		final Block slimeBlock = new SlimeBlock(500, 0, Material.ground)
		.setHardness(0.5F).setStepSound(Block.soundGravelFootstep)
		.setBlockName("slimeBlock").setCreativeTab(CreativeTabs.tabDecorations);
		
		LanguageRegistry.addName(slimeBlock, "Slime Block");
		MinecraftForge.setBlockHarvestLevel(slimeBlock, "shovel", 0);
		GameRegistry.registerBlock(slimeBlock);
		
		crafting(slimeBlock);
	}
	
	public static void crafting (Block slimeBlock) {
		
		ItemStack slimeballStack = new ItemStack(Item.slimeBall);
		ItemStack slimeBlockStack = new ItemStack(slimeBlock);
		
		GameRegistry.addShapelessRecipe(slimeBlockStack,
				slimeballStack, slimeballStack, slimeballStack,
				slimeballStack);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 4), slimeBlockStack);
	}
	
	public SlimeBlock (int id, int texture, Material material) {
		super(id, texture, material);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCKS_PNG;
	}

}
