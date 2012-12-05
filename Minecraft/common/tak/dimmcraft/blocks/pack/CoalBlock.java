package tak.dimmcraft.blocks.pack;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import tak.dimmcraft.DimmCraftCommonProxy;
import tak.dimmcraft.blocks.PackageBlock;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class CoalBlock extends PackageBlock {

//	Loads the block against BlockLoader
	public static void loadBlock (FMLInitializationEvent event) {
		
//		Needs to edit blockid and decide if this should just be an item
		final Block coalBlock = new CoalBlock(502, 2, Material.ground)
		.setHardness(0.5F).setStepSound(Block.soundGravelFootstep)
		.setBlockName("coalBlock").setCreativeTab(CreativeTabs.tabDecorations);
		
		PackageBlock.registerBlock(coalBlock, "Coal Block", "shovel");
		crafting(coalBlock);
	}
	
//	Handles crafting up to this tier
	public static void crafting (Block coalBlock) {
		
		ItemStack coalStack = new ItemStack(Item.coal);
		ItemStack coalBlockStack = new ItemStack(coalBlock);
		
		PackageBlock.recipeSetup(coalBlockStack, coalStack, Item.coal);
	}
	
//	Constructs the block against Block
	public CoalBlock (int id, int texture, Material material) {
		super(id, texture, material);
	}
	
	@Override
	public String getTextureFile () {
		return DimmCraftCommonProxy.BLOCKS_PNG;
	}
}
