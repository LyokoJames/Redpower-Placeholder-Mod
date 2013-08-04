package lj.rpph.block;

import lj.rpph.block.item.ItemBlockGemBlock;
import lj.rpph.block.item.ItemBlockMarbleBlock;
import lj.rpph.block.item.ItemBlockOreBlock;
import lj.rpph.lib.BlockIds;
import lj.rpph.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ModBlocks {
    
    public static Block gemBlock;
    public static Block marbleBlock;
    public static Block oreBlock;
    public static Block rubberWood;
    public static Block rubberLeaves;
    
    public static void init() {
        gemBlock = new BlockGemBlock(BlockIds.GEM_BLOCK);
        marbleBlock = new BlockMarbleBlock(BlockIds.MARBLE_BLOCK);
        oreBlock = new BlockOreBlock(BlockIds.ORE_BLOCK);
        rubberWood = new BlockRubberWood(BlockIds.RUBBER_WOOD);
        rubberLeaves = new BlockRubberLeaves(BlockIds.RUBBER_LEAVES);
        
        GameRegistry.registerBlock(gemBlock, ItemBlockGemBlock.class,
                Strings.GEM_BLOCK_UNLOC_NAME);
        
        GameRegistry.registerBlock(marbleBlock, ItemBlockMarbleBlock.class,
                Strings.MARBLE_BLOCK_UNLOC_NAME);
        
        GameRegistry.registerBlock(oreBlock, ItemBlockOreBlock.class,
                Strings.ORE_BLOCK_UNLOC_NAME);
        
        GameRegistry.registerBlock(rubberWood, Strings.RUBBER_WOOD_UNLOC_NAME);
        GameRegistry.registerBlock(rubberLeaves, Strings.RUBBER_LEAVES_UNLOC_NAME);
        
        for (int i = 0; i < 3; i++) {
            LanguageRegistry.addName(new ItemStack(gemBlock, 1, i),
                    BlockGemBlock.gemBlockNames[i]);
        }
        for (int i = 0; i < 7; i++) {
            LanguageRegistry.addName(new ItemStack(marbleBlock, 1, i),
                    BlockMarbleBlock.marbleBlockNames[i]);
        }
        for (int i = 0; i < 8; i++) {
            LanguageRegistry.addName(new ItemStack(oreBlock, 1, i),
                    BlockOreBlock.oreBlockNames[i]);
        }
        
        LanguageRegistry.addName(rubberWood, Strings.RUBBER_WOOD_ENG_NAME);
        LanguageRegistry.addName(rubberLeaves, Strings.RUBBER_LEAVES_ENG_NAME);
        
        MinecraftForge.setBlockHarvestLevel(gemBlock, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(marbleBlock, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreBlock, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(rubberWood, "axe", 0);
    }
    
    
}
