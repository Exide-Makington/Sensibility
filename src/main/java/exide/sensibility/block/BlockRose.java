package exide.sensibility.block;

import java.util.Random;

import exide.sensibility.creativetab.CreativeTabSensibility;
import exide.sensibility.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockRose extends BlockSensibility implements IPlantable 
{

	public BlockRose(){
		super(Material.plants);
		this.setUnlocalizedName(Names.Blocks.ROSE);
		this.setTickRandomly(true);
		this.setStepSound(soundTypeGrass);
		float f = 0.2F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);

	}
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		return super.canPlaceBlockAt(worldIn, pos) && worldIn.getBlockState(pos.down()).getBlock().canSustainPlant(worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
	}
	protected boolean canPlaceBlockOn(Block ground)
	{
		return ground == Blocks.grass || ground == Blocks.dirt || ground == Blocks.farmland;
	}
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		super.onNeighborBlockChange(worldIn, pos, state, neighborBlock);
		this.checkAndDropBlock(worldIn, pos, state);
	}

	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		this.checkAndDropBlock(worldIn, pos, state);
	}

	protected void checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state)
	{
		if (!this.canBlockStay(worldIn, pos, state))
		{
			this.dropBlockAsItem(worldIn, pos, state, 0);
			worldIn.setBlockState(pos, Blocks.air.getDefaultState(), 3);
		}
	}

	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	{
		BlockPos down = pos.down();
		Block soil = worldIn.getBlockState(down).getBlock();
		if (state.getBlock() != this) return this.canPlaceBlockOn(soil); //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
		return soil.canSustainPlant(worldIn, down, net.minecraft.util.EnumFacing.UP, this);
	}

	public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
	{
		return null;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean isFullCube()
	{
		return false;
	}

	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return net.minecraftforge.common.EnumPlantType.Plains;

	}
	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		IBlockState state = world.getBlockState(pos);
		if (state.getBlock() != this) return getDefaultState();
		return state;

	}
}

