package lj.rpph.configurations;

import java.io.File;
import java.util.logging.Level;

import lj.rpph.lib.BlockIds;
import lj.rpph.lib.ItemIds;
import lj.rpph.lib.Reference;
import lj.rpph.lib.Strings;
import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
    
    public static Configuration configuration;
    
    public static void init(File configFile) {
        
        configuration = new Configuration(configFile);
        
        try {
            configuration.load();
            
            BlockIds.GEM_BLOCK = configuration.getBlock(Strings.GEM_BLOCK_ENG_NAME, BlockIds.GEM_BLOCK_DEFAULT).getInt(BlockIds.GEM_BLOCK_DEFAULT);
            BlockIds.MARBLE_BLOCK = configuration.getBlock(Strings.MARBLE_BLOCK_ENG_NAME, BlockIds.MARBLE_BLOCK_DEFAULT).getInt(BlockIds.MARBLE_BLOCK_DEFAULT);
            BlockIds.ORE_BLOCK = configuration.getBlock(Strings.ORE_BLOCK_ENG_NAME, BlockIds.ORE_BLOCK_DEFAULT).getInt(BlockIds.ORE_BLOCK_DEFAULT);
            BlockIds.RUBBER_WOOD = configuration.getBlock(Strings.RUBBER_WOOD_ENG_NAME, BlockIds.RUBBER_WOOD_DEFAULT).getInt(BlockIds.RUBBER_WOOD_DEFAULT);
            BlockIds.RUBBER_LEAVES = configuration.getBlock(Strings.RUBBER_LEAVES_ENG_NAME, BlockIds.RUBBER_LEAVES_DEFAULT).getInt(BlockIds.RUBBER_LEAVES_DEFAULT);
            
            ItemIds.ITEM_RUBY = configuration.getItem(Strings.ITEM_RUBY_ENG_NAME, ItemIds.ITEM_RUBY_DEFAULT).getInt(ItemIds.ITEM_RUBY_DEFAULT);
        }
        catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
        }
        finally {
            configuration.save();
        }
    }

}
