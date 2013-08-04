package lj.rpph;

import java.io.File;

import lj.rpph.block.ModBlocks;
import lj.rpph.configurations.ConfigurationHandler;
import lj.rpph.core.handlers.FuelHandler;
import lj.rpph.core.handlers.OreHandler;
import lj.rpph.core.proxy.CommonProxy;
import lj.rpph.creativetab.CreativeTabRPPH;
import lj.rpph.item.ModItems;
import lj.rpph.lib.Reference;
import lj.rpph.recipe.CraftingRecipes;
import lj.rpph.recipe.SmeltingRecipes;
import net.minecraft.creativetab.CreativeTabs;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true)
public class RpPlaceholder {
    
    @Instance(Reference.MOD_ID)
    public static RpPlaceholder instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static CreativeTabs tabsRPPH = new CreativeTabRPPH(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        
        ModItems.init();
        ModBlocks.init();
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        CraftingRecipes.init();
        SmeltingRecipes.init();
        GameRegistry.registerFuelHandler(new FuelHandler());
        OreHandler.init();
    }

}
