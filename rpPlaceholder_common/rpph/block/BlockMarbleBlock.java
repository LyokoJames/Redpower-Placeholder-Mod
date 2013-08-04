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

public class BlockMarbleBlock extends Block {
    
    public static String[] marbleBlockNames = {"Marble", "Basalt", "Marble Brick",
        "Basalt Cobblestone", "Basalt Brick", "Chiseled Basalt Brick", "Basalt Paver",
        "", "", "", "", "", "", "", "", ""};
    
    Icon[] icons;

    public BlockMarbleBlock(int id) {
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.MARBLE_BLOCK_UNLOC_NAME);
        this.setHardness(1.5F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setCreativeTab(RpPlaceholder.tabsRPPH);
    }
    
    @Override
    public int damageDropped (int metadata) {
        if (metadata == 1 || metadata == 6) return 3;
        else return metadata;
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
        for (int ix = 0; ix < 7; ix++) {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[7];
        for (int i = 0; i < 7; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + marbleBlockNames[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int id, int meta) {
        if (meta < 7)
            return icons[meta];
        else return icons[0];
    }

}
