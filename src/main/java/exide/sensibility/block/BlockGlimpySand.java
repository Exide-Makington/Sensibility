package exide.sensibility.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import exide.sensibility.reference.Names;

public class BlockGlimpySand extends BlockSensibilityFalling
{
    public BlockGlimpySand()
    {
        super(Material.sand);
        this.setUnlocalizedName(Names.Blocks.GLIMPY_SAND);
        this.setStepSound(soundTypeGravel);
        this.setHardness(0.6F);
    }
}
