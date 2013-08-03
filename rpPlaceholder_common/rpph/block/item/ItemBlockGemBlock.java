package rpph.block.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import rpph.block.BlockGemBlock;
import rpph.block.ModBlocks;
import rpph.lib.Reference;
import rpph.lib.Strings;

public class ItemBlockGemBlock extends ItemBlock {
    
    Icon[] icons;

    public ItemBlockGemBlock(int id) {
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
        return BlockGemBlock.gemBlockNames[itemstack.getItemDamage()];
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[3];
        for (int i = 0; i < 3; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + BlockGemBlock.gemBlockNames[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        if (meta < 3)
            return icons[meta];
        else if (meta == 6) return icons[3];
        else return icons[0];
    }
}
