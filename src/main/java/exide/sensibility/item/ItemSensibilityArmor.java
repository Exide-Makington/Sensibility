package exide.sensibility.item;

import exide.sensibility.creativetab.CreativeTabSensibility;
import exide.sensibility.reference.Reference;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSensibilityArmor extends ItemArmor{

	public ItemSensibilityArmor(ArmorMaterial material, int renderIndex, int armorType, String unlocalizedName) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabSensibility.SENSE_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}