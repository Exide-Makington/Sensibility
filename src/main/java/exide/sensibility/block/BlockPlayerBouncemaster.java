package exide.sensibility.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;

public class BlockPlayerBouncemaster extends BlockSensibility
{
	public BlockPlayerBouncemaster()
	{
		super();
		this.setUnlocalizedName(Names.Blocks.PLAYER_BOUNCEMASTER);
        this.setHardness(0.7F);
	}
	
	 public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
	    {
	        float f = 0.0F; //0.125
	        return new AxisAlignedBB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)((float)(pos.getY() + 1) - f), (double)(pos.getZ() + 1));
	    }

	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, Entity entityIn){
		if(!entityIn.isSneaking() && entityIn instanceof EntityPlayer && !worldIn.isBlockPowered(pos)){
			entityIn.motionY += 2.5D;
		}
	}
	//	public void onEntityCollidedWithBlock(World world, int X, int Y, int Z, Entity target)
	//	{
	//       // LogHelper.info(target.getClass());
	//		if(!target.isSneaking() && (target.getClass() == EntityPlayerMP.class || target.getClass() == EntityClientPlayerMP.class) && !this.isGettingPoweredAtAll(world, X, Y, Z)){
	//			target.motionY += 2.5D;
	//			//System.out.println("boink");
	//			
	//			
	//		}
	//	}
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance){
		entityIn.fall(fallDistance, 0.0F);
	}
}
