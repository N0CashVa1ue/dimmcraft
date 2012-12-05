package tak.dimmcraft.blocks;


import tak.dimmcraft.handlers.RecipeHandler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

import net.minecraftforge.common.MinecraftForge;

public abstract class PackageBlock extends Block {
	
	public static void registerBlock (Block block, String string, String string1) {
		
		LanguageRegistry.addName(block, string);
		MinecraftForge.setBlockHarvestLevel(block, string1, 0);
		GameRegistry.registerBlock(block);
	}
	
	public static void recipeSetup (ItemStack compressedStack, ItemStack uncompressedStack, Item uncompressedItem) {
		
		RecipeHandler.packageRecipe(compressedStack, uncompressedStack, uncompressedItem);
	}

//	Constructs the abstract block against Block
	public PackageBlock (int id, int texture, Material material) {
		super(id, texture, material);
	}
}
