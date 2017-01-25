package exide.sensibility.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;

public class BlockShockAbsorber  extends BlockSensibility{

	public BlockShockAbsorber()
	{
		super();
		this.setUnlocalizedName(Names.Blocks.SHOCK_ABSORBER);
        this.setHardness(0.7F);
	}

	 public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
	    {
	        float f = 0.0F; //0.125
	        return new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)((float)(pos.getY() + 1) - f), (double)(pos.getZ() + 1));
	    }
	 
	 public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance){
	        entityIn.fall(fallDistance, 0.0F);
	    }
}
