package exide.sensibility;

//import exide.sensibility.client.handler.GuiHandler;
//import exide.sensibility.client.handler.KeyInputEventHandler;
import exide.sensibility.handler.ConfigurationHandler;
import exide.sensibility.handler.FMLEventHandler;
//import exide.sensibility.handler.GeneralEventHandler;
import exide.sensibility.init.ModBlocks;
import exide.sensibility.init.ModItems;
import exide.sensibility.init.Recipes;
import exide.sensibility.proxy.IProxy;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;
import exide.sensibility.world.SensibilityWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Sensibility
{
    @Mod.Instance(Reference.MOD_ID)
    public static Sensibility instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();

        ModBlocks.init();
        
        SensibilityWorldGen.mainRegistry();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    	 
      //  MinecraftForge.EVENT_BUS.register(new KeyInputEventHandler());
        
        Recipes.init();
        
     //   MinecraftForge.EVENT_BUS.register(new GeneralEventHandler());
        
        MinecraftForge.EVENT_BUS.register(new FMLEventHandler());
        
        proxy.registerRenders();
        
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Do the data thing...");
        LogHelper.info("Post Initialization Complete!");
    }
    
}
