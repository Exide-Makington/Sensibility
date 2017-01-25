package exide.sensibility.block;

import net.minecraft.block.material.Material;
import exide.sensibility.reference.Names;

public class BlockBlackSand extends BlockSensibilityFalling
{
    public BlockBlackSand()
    {
        super(Material.sand);
        this.setUnlocalizedName(Names.Blocks.BLACK_SAND);
        this.setStepSound(soundTypeSand);
        this.setHardness(0.5F);
    }
}
