package rpph.block.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import rpph.block.BlockGemBlock;
import rpph.block.BlockMarbleBlock;
import rpph.lib.Reference;
import rpph.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockMarbleBlock extends ItemBlock {
    
    Icon[] icons;

    public ItemBlockMarbleBlock(int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Strings.MARBLE_BLOCK_UNLOC_NAME);
    }
    
    @Override
    public int getMetadata (int damageValue) {
        return damageValue;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return BlockMarbleBlock.marbleBlockNames[itemstack.getItemDamage()];
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[7];
        for (int i = 0; i < 7; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + BlockMarbleBlock.marbleBlockNames[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        if (meta < 7)
            return icons[meta];
        else return icons[0];
    }

}
