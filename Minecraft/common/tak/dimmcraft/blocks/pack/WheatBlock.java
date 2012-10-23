package tak.dimmcraft.blocks.pack;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraftforge.common.MinecraftForge;
import tak.dimmcraft.CommonProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class WheatBlock extends Block {
	
	/* Loads the block against BlockLoader */
	public static void loadBlock (FMLInitializationEvent event) {
		
		final Block wheatBlock = new WheatBlock(504, 4, Material.ground)
		.setHardness(0.5F).setStepSound(Block.soundGravelFootstep)
		.setBlockName("wheatBlock").setCreativeTab(CreativeTabs.tabDecorations);
		
		LanguageRegistry.addName(wheatBlock, "Wheat Block");
		MinecraftForge.setBlockHarvestLevel(wheatBlock, "shovel", 0);
		GameRegistry.registerBlock(wheatBlock);
		
		crafting(wheatBlock);
	}
	
	/* Handles crafting up to this tier */
	public static void crafting (Block wheatBlock) {
		
		ItemStack wheatStack = new ItemStack(Item.wheat);
		ItemStack wheatBlockStack = new ItemStack(wheatBlock);
		
		GameRegistry.addShapelessRecipe(wheatBlockStack,
				wheatStack, wheatStack, wheatStack,
				wheatStack);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 4), wheatBlockStack);
	}
	
	/* Constructs the block against Block */
	public WheatBlock (int id, int texture, Material material) {
		super(id, texture, material);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCKS_PNG;
	}
}
