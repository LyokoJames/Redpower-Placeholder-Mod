package rpph.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import rpph.RpPlaceholder;
import rpph.lib.Reference;
import rpph.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockRubberWood extends Block {
    
    public static String[] blockSides = {"Inside", "Outside"};
    
    Icon[] icons;

    public BlockRubberWood(int id) {
        super(id, Material.wood);
        this.setUnlocalizedName(Strings.RUBBER_WOOD_UNLOC_NAME);
        this.setHardness(2F);
        this.setStepSound(Block.soundWoodFootstep);
        this.setCreativeTab(RpPlaceholder.tabsRPPH);
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[2];
            icons[0] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + this.getUnlocalizedName2() + "." + blockSides[0]);
            icons[1] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + this.getUnlocalizedName2() + "." + blockSides[1]);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if(side == 0 || side == 1) return icons[0];
        else return icons[1];
    }
    
    
}
