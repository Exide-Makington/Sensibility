package exide.sensibility.creativetab;

import exide.sensibility.init.ModItems;
import exide.sensibility.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSensibility
{
    public static final CreativeTabs SENSE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.logo;
        }
    };
}
