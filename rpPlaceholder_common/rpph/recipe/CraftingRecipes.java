package rpph.recipe;

import net.minecraft.item.ItemStack;
import rpph.block.ModBlocks;
import rpph.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {
    public static void init() {
        for (int i = 0; i < 3; i++) {
            GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.gemBlock, 1, i),
                    "GGG",
                    "GGG",
                    "GGG",
                    'G', new ItemStack(ModItems.gemDust, 1, i));
            
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.gemDust, 9, i),
                    "B",
                    'B', new ItemStack(ModBlocks.gemBlock, 1, i));
        }
    }
}
