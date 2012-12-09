package tak.dimmcraft.blocks;


import tak.dimmcraft.handlers.BlockHandler;
import tak.dimmcraft.handlers.RecipeHandler;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraftforge.common.MinecraftForge;

public abstract class PackageBlock extends BlockHandler {
	
	public static void recipeSetup (ItemStack compressedStack, ItemStack uncompressedStack, Item uncompressedItem) {
		
		RecipeHandler.packageRecipe(compressedStack, uncompressedStack, uncompressedItem);
	}
	
//	Abstract Class for PackageBlocks
	public PackageBlock(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
	}
}
