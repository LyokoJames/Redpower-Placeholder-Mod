package lj.rpph.item;

import lj.rpph.lib.ItemIds;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
    
    public static Item gemDust;
    
    public static void init() {
        gemDust = new ItemGemDust(ItemIds.ITEM_RUBY);
        
        for(int i = 0; i < 3; i++) {
            LanguageRegistry.addName(new ItemStack(gemDust, 1, i),
                    ItemGemDust.gemDustNames[i]);
            
        }
        LanguageRegistry.addName(new ItemStack(gemDust, 1, 6),
                ItemGemDust.gemDustNames[6]);
    }
}
