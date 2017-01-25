package exide.sensibility.item;

import exide.sensibility.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSalad extends ItemSensibilityFood
{
    public ItemSalad()
    {
        super(Names.Items.SALAD, 6, 0.2f, false);
        this.setMaxStackSize(1);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        super.onItemUseFinish(stack, worldIn, playerIn);
        return new ItemStack(Items.bowl);
    }
}