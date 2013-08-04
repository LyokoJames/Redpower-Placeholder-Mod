package lj.rpph.recipe;

import lj.rpph.block.ModBlocks;
import lj.rpph.lib.BlockIds;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class SmeltingRecipes {
    public static void init() {
        FurnaceRecipes.smelting().addSmelting(BlockIds.MARBLE_BLOCK, 3,
                new ItemStack(ModBlocks.marbleBlock, 1, 1), 0);
    }
}
