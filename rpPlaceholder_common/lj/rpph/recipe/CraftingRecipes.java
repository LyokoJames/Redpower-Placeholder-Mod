package lj.rpph.recipe;

import lj.rpph.block.ModBlocks;
import lj.rpph.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
        
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.marbleBlock, 4, 2),
                "BB",
                "BB",
                'B', new ItemStack(ModBlocks.marbleBlock, 1, 0));
        
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.marbleBlock, 4, 4),
                "BB",
                "BB",
                'B', new ItemStack(ModBlocks.marbleBlock, 1, 1));
        
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.marbleBlock, 1, 6),
                "B",
                'B', new ItemStack(ModBlocks.marbleBlock, 1, 1));
        
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.marbleBlock, 4, 5),
                "BB",
                "BB",
                'B', new ItemStack(ModBlocks.marbleBlock, 1, 4));
        
        GameRegistry.addShapedRecipe(new ItemStack(Item.stick, 8),
                "B",
                'B', ModBlocks.rubberWood);
    }
}
