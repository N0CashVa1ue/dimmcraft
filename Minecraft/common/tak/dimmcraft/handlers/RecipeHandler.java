package tak.dimmcraft.handlers;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {

//	Recipe used by packageBlocks
	public static void packageRecipe (ItemStack compressedStack, ItemStack uncompressedStack, Item uncompressedItem) {
		
		GameRegistry.addShapelessRecipe(compressedStack,
				uncompressedStack, uncompressedStack, uncompressedStack,
				uncompressedStack);
		
		GameRegistry.addShapelessRecipe(new ItemStack(uncompressedItem, 4), compressedStack);
	}
}
