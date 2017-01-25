package exide.sensibility.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import exide.sensibility.reference.Names;

public class ItemLogo extends ItemSensibility
{
    public ItemLogo()
    {
        super();
        this.setUnlocalizedName(Names.Items.LOGO);
        this.setCreativeTab(null);
    }
    @Override
	public void addInformation(ItemStack stack, EntityPlayer player, List itemInfo, boolean bool){
		itemInfo.add("If you found this in NEI or whatever");
		itemInfo.add("and wonder what it does,");
		itemInfo.add("it is used as the creative tab icon,");
		itemInfo.add("and wherever else one might want a logo of the mod.");
	}
}
