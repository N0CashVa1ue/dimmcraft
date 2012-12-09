package tak.dimmcraft.items.pack;

import tak.dimmcraft.DimmCraftCommonProxy;
import tak.dimmcraft.blocks.PackageBlock;
import tak.dimmcraft.conf.ConfPackageItems;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class SlimeCubeChunk extends Item {

	public static Item slimeCubeChunk;
	
//	Loads the Item into Minecraft
	public static void loadItem(FMLInitializationEvent event) {
		
		slimeCubeChunk = (new SlimeCubeChunk(ConfPackageItems.SlimeCube)).setIconIndex(0).setItemName("slimeCubeChunk");
		LanguageRegistry.addName(slimeCubeChunk, "Slime Cube");
		
		crafting(slimeCubeChunk);
	}
	
	public static void crafting(Item slimeCubeChunk) {
		
		ItemStack slimeBallStack = new ItemStack(Item.slimeBall);
		ItemStack slimeCubeStack = new ItemStack(slimeCubeChunk);
		
		PackageBlock.recipeSetup(slimeCubeStack, slimeBallStack, Item.slimeBall);
	}

//	Constructs the Item
	public SlimeCubeChunk(int par1) {
		
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getTextureFile() {
		return DimmCraftCommonProxy.ITEMS_PNG;
	}
}
