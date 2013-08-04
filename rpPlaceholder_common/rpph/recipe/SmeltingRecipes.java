package rpph.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import rpph.block.ModBlocks;
import rpph.lib.BlockIds;

public class SmeltingRecipes {
    public static void init() {
        FurnaceRecipes.smelting().addSmelting(BlockIds.MARBLE_BLOCK, 3,
                new ItemStack(ModBlocks.marbleBlock, 1, 1), 0);
    }
}
