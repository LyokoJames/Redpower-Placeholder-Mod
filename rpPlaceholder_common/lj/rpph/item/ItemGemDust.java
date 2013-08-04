package lj.rpph.item;


import java.util.List;

import lj.rpph.RpPlaceholder;
import lj.rpph.lib.Reference;
import lj.rpph.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemGemDust extends ItemRPPH{
    
    public static final String[] gemDustNames = {"Ruby", "Green Sapphire",
        "Sapphire", "", "", "", "Nikolite", "", "", "", "", "", "", "", "", ""};
    
    Icon[] icons;

    public ItemGemDust(int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Strings.GEM_DUST_UNLOC_NAME);
        this.setCreativeTab(RpPlaceholder.tabsRPPH);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return gemDustNames[stack.getItemDamage()];
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[4];
        for (int i = 0; i < 3; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + gemDustNames[i]);
        }
        icons[3] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                + ":" + gemDustNames[6]);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        if (meta < 3)
            return icons[meta];
        else if (meta == 6) return icons[3];
        else return icons[0];
    }
    
    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @SideOnly(Side.CLIENT)
    public void getSubItems(int id, CreativeTabs creativeTab, List list) {
        for (int meta = 0; meta < 3; meta++) {
            list.add(new ItemStack(id, 1, meta));
        }
        list.add(new ItemStack(id, 1, 6));
    }
    
    

}
