package exide.sensibility.block;

import exide.sensibility.creativetab.CreativeTabSensibility;
import exide.sensibility.reference.Reference;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockSensibility extends Block
{
    public BlockSensibility(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabSensibility.SENSE_TAB);
    }

    public BlockSensibility()
    {
        this(Material.rock);
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
//    public boolean isGettingPoweredAtAll(World world, BlockPos pos){
//    	if(world.isBlockPowered(pos) || world.isBlockIndirectlyGettingPowered(pos)){
//    		return true;
//    	}else{
//    		return false;
//    	}
//    }
}
