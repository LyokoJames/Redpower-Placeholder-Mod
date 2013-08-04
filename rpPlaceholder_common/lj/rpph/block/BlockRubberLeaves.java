package lj.rpph.block;

import java.util.ArrayList;
import java.util.Random;

import lj.rpph.RpPlaceholder;
import lj.rpph.lib.Reference;
import lj.rpph.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class BlockRubberLeaves extends Block implements IShearable{

    public BlockRubberLeaves(int id) {
        super(id, Material.leaves);
        this.setUnlocalizedName(Strings.RUBBER_LEAVES_UNLOC_NAME);
        this.setHardness(0.2F);
        this.setStepSound(Block.soundGrassFootstep);
        this.setCreativeTab(RpPlaceholder.tabsRPPH);
    }

    @Override
    public boolean isShearable(ItemStack item, World world, int x, int y, int z) {
        return true;
    }

    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x,
            int y, int z, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1));
        return ret;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                + ":"
                + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
    public int idDropped(int par1, Random par2Random, int par3) {
        return -1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }

}
