package rpph.block;

import java.util.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import rpph.RpPlaceholder;
import rpph.item.ModItems;
import rpph.lib.Reference;
import rpph.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockOreBlock extends Block {
    
    public static String[] oreBlockNames = {"Ruby Ore"
        ,"Green Sapphire Ore"
        ,"Sapphire Ore"
        ,"Silver Ore"
        ,"Tin Ore"
        ,"Copper Ore"
        ,"Tungsten Ore"
        ,"Nikolite Ore", "", "","","","","","", ""};
    
    Icon[] icons;

    public BlockOreBlock(int id) {
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.ORE_BLOCK_UNLOC_NAME);
        this.setHardness(3F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setCreativeTab(RpPlaceholder.tabsRPPH);
    }
    
    public void dropBlockAsItemWithChance(World world, int x, int y, int z, int meta, float chance, int fortune) {
        if (!world.isRemote) {
            int multiplier = 1;
            float rand = world.rand.nextFloat();
            if (fortune == 1) {
                if(rand <= 0.33F) multiplier = 2;
            }
            if (fortune == 2) {
                if(rand <= 0.25F) multiplier = 2;
                else if(rand <= 0.5F) multiplier = 3;
            }
            if (fortune == 3) {
                if(rand <= 0.2F) multiplier = 2;
                else if(rand <= 0.4F) multiplier = 3;
                else if(rand <= 0.6F) multiplier = 4;
            }
            if (meta == 7) {
                if (world.rand.nextFloat() <= 0.5F)
                    this.dropBlockAsItem_do(world, x, y, z,
                            new ItemStack(ModItems.gemDust, 5*multiplier, 6));
                else
                    this.dropBlockAsItem_do(world, x, y, z,
                            new ItemStack(ModItems.gemDust, 4*multiplier, 6));
            }
            else if (meta < 3)
                this.dropBlockAsItem_do(world, x, y, z,
                        new ItemStack(ModItems.gemDust, multiplier, meta));
            else
                this.dropBlockAsItem_do(world, x, y, z,
                    new ItemStack(ModBlocks.oreBlock, 1, meta));
        }
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
        for (int ix = 0; ix < 8; ix++) {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[8];
        for (int i = 0; i < 8; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + oreBlockNames[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int id, int meta) {
        if (meta < 8)
            return icons[meta];
        else return icons[0];
    }
}
