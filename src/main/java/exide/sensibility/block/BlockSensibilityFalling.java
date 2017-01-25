package exide.sensibility.block;

import exide.sensibility.creativetab.CreativeTabSensibility;
import exide.sensibility.reference.Reference;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class BlockSensibilityFalling extends BlockFalling
{
    public BlockSensibilityFalling(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabSensibility.SENSE_TAB);
    }

    public BlockSensibilityFalling()
    {
        this(Material.sand);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
