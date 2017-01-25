package exide.sensibility.item;

import exide.sensibility.creativetab.CreativeTabSensibility;
import exide.sensibility.init.ModItems;
import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSensibilityFood extends ItemFood
{

	private PotionEffect[] effects;

	public ItemSensibilityFood(String unlocalizedName, int amount, float saturation, boolean isWolfFood, PotionEffect... effects) {
		super(amount, saturation, isWolfFood);
		this.effects = effects;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabSensibility.SENSE_TAB);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		if(!world.isRemote) {
			for(int i = 0; i < effects.length; i++) {
				player.addPotionEffect(new PotionEffect(effects[i]));
			}
		}
	}

	//Stuff from Pahi
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
