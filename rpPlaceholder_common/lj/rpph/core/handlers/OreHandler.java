package lj.rpph.core.handlers;

import lj.rpph.block.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreHandler {
    public static void init() {
        OreDictionary.registerOre("oreSilver", new ItemStack(ModBlocks.oreBlock, 1, 3));
        OreDictionary.registerOre("oreTin", new ItemStack(ModBlocks.oreBlock, 1, 4));
        OreDictionary.registerOre("oreCopper", new ItemStack(ModBlocks.oreBlock, 1, 5));
        OreDictionary.registerOre("oreTungsten", new ItemStack(ModBlocks.oreBlock, 1, 6));
    }
}
