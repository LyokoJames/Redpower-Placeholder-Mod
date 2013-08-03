package rpph.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import rpph.RpPlaceholder;
import rpph.lib.Reference;
import rpph.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockGemBlock extends Block {
    
    public static String[] gemBlockNames = {"Ruby Block",
        "Green Sapphire Block", "Sapphire Block", "","","","","","","","","","","","",""};
    
    Icon[] icons;
    
    public BlockGemBlock(int id) {
        super(id, Material.iron);
        this.setUnlocalizedName(Strings.GEM_BLOCK_UNLOC_NAME);
        this.setHardness(5F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setCreativeTab(RpPlaceholder.tabsRPPH);
    }
    
    @Override
    public int damageDropped (int metadata) {
        return metadata;
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
        for (int ix = 0; ix < 3; ix++) {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[3];
        for (int i = 0; i < 3; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + gemBlockNames[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int id, int meta) {
        if (meta < 3)
            return icons[meta];
        else if (meta == 6) return icons[3];
        else return icons[0];
    }
    
}
