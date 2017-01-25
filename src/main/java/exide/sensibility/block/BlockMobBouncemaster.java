package exide.sensibility.block;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;

public class BlockMobBouncemaster extends BlockSensibility
{
	public BlockMobBouncemaster()
	{
		super();
		this.setUnlocalizedName(Names.Blocks.MOB_BOUNCEMASTER);
        this.setHardness(0.7F);
	}

	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, Entity entityIn){
		if(entityIn instanceof EntityCreature && !worldIn.isBlockPowered(pos)){
			entityIn.motionY += 2.5D;
		}
	}

	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance){
		entityIn.fall(fallDistance, 0.0F);
	}

}
