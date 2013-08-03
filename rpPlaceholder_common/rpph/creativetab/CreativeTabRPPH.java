package rpph.creativetab;

import rpph.lib.ItemIds;
import rpph.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabRPPH extends CreativeTabs {

    public CreativeTabRPPH(int par1, String par2Str) {
        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {

        return ItemIds.ITEM_RUBY;
    }

    @Override
    public String getTranslatedTabLabel() {
        return Reference.MOD_NAME;
    }

}
