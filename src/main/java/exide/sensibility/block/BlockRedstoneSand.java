package exide.sensibility.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import exide.sensibility.reference.Names;

public class BlockRedstoneSand extends BlockSensibilityFalling{
	 public BlockRedstoneSand()
	    {
	        super(Material.sand);
	        this.setUnlocalizedName(Names.Blocks.REDSTONE_SAND);
	        this.setHardness(0.9F);
	        this.setStepSound(soundTypeSand);
	    }
	 public boolean canProvidePower()
	    {
	        return true;
	    }

	 public int getWeakPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side)
	    {
	        return 15;
	    }
	 public int getStrongPower(IBlockAccess worldIn, BlockPos pos, IBlockState state, EnumFacing side)
	    {
	        return 0;
	    }
	 public boolean isNormalCube(IBlockAccess world, BlockPos pos)
	    {
	    return true;
	    }
}
