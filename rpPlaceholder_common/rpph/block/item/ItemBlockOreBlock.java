package rpph.block.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import rpph.block.BlockOreBlock;
import rpph.lib.Reference;
import rpph.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockOreBlock extends ItemBlock {
    
    Icon[] icons;

    public ItemBlockOreBlock(int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Strings.GEM_BLOCK_UNLOC_NAME);
    }
    
    @Override
    public int getMetadata (int damageValue) {
        return damageValue;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return BlockOreBlock.oreBlockNames[itemstack.getItemDamage()];
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[8];
        for (int i = 0; i < 8; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + BlockOreBlock.oreBlockNames[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        if (meta < 8)
            return icons[meta];
        else return icons[0];
    }
}
