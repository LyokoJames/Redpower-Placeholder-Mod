package rpph;

import net.minecraft.creativetab.CreativeTabs;
import rpph.block.ModBlocks;
import rpph.core.proxy.CommonProxy;
import rpph.creativetab.CreativeTabRPPH;
import rpph.item.ModItems;
import rpph.lib.Reference;


import rpph.recipe.CraftingRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class RpPlaceholder {
    
    @Instance(Reference.MOD_ID)
    public static RpPlaceholder instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static CreativeTabs tabsRPPH = new CreativeTabRPPH(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        CraftingRecipes.init();
    }
    
    @PostInit
    public void postInit() {
        
    }

}
