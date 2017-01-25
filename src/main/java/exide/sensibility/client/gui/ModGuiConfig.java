package exide.sensibility.client.gui;

import exide.sensibility.handler.ConfigurationHandler;
import exide.sensibility.reference.Reference;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                "§9Sensibility Configuration");
        titleLine2 = "§7(" + GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()) + ")";
    }
}
