package rpph.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import rpph.block.item.ItemBlockGemBlock;
import rpph.block.item.ItemBlockMarbleBlock;
import rpph.lib.BlockIds;
import rpph.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ModBlocks {
    
    public static Block gemBlock;
    public static Block marbleBlock;
    
    public static void init() {
        gemBlock = new BlockGemBlock(BlockIds.GEM_BLOCK);
        marbleBlock = new BlockMarbleBlock(BlockIds.MARBLE_BLOCK);
        
        GameRegistry.registerBlock(gemBlock, ItemBlockGemBlock.class,
                Strings.GEM_BLOCK_UNLOC_NAME);
        
        GameRegistry.registerBlock(marbleBlock, ItemBlockMarbleBlock.class,
                Strings.MARBLE_BLOCK_UNLOC_NAME);
        
        for (int i = 0; i < 3; i++) {
            LanguageRegistry.addName(new ItemStack(gemBlock, 1, i),
                    BlockGemBlock.gemBlockNames[i]);
        }
        for (int i = 0; i < 7; i++) {
            LanguageRegistry.addName(new ItemStack(marbleBlock, 1, i),
                    BlockMarbleBlock.marbleBlockNames[i]);
        }
    }
    
    
}
