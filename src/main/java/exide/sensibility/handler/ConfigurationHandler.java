package exide.sensibility.handler;

import exide.sensibility.reference.Reference;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean enableFancyBlocks = false;
    public static String anotherValue = "";
    public static boolean haxyStuff = false;


    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
    	// All the config values
        enableFancyBlocks = configuration.getBoolean("Enable Fancy Blocks", Configuration.CATEGORY_GENERAL, false, "Set this to false if you can't handle those HD textures.");
        anotherValue = configuration.getString("Whelks", Configuration.CATEGORY_GENERAL, "ambrosia", "Well, now. I see potential for message transmission...");
        haxyStuff = configuration.getBoolean("HAX!", Configuration.CATEGORY_GENERAL, false, "Enables haxy stuff to do with the prodding stick.");
        
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
