package exide.sensibility.block;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;

public class BlockGlowstoneSheet extends BlockSensibility{

	public static final PropertyEnum<BlockGlowstoneSheet.EnumBlockHalf> HALF = PropertyEnum.<BlockGlowstoneSheet.EnumBlockHalf>create("half", BlockGlowstoneSheet.EnumBlockHalf.class);

	public BlockGlowstoneSheet()
	{
		super(Material.glass);
		IBlockState iblockstate = this.blockState.getBaseState();
		iblockstate = iblockstate.withProperty(HALF, BlockGlowstoneSheet.EnumBlockHalf.BOTTOM);
		this.setUnlocalizedName(Names.Blocks.GLOWSTONE_SHEET);
		this.setStepSound(soundTypeGlass);
		this.setLightLevel(1.0F);
		this.setHardness(0.3F);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos){

		IBlockState iblockstate = worldIn.getBlockState(pos);
		float f = 0.0625F;

		if (iblockstate.getBlock() == this)
		{
			if (iblockstate.getValue(HALF) == BlockGlowstoneSheet.EnumBlockHalf.TOP)
			{
				this.setBlockBounds(0.0F, 1.0F - f, 0.0F, 1.0F, 1.0F, 1.0F);
			}
			else
			{
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
			}
		}

	}

	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		IBlockState iblockstate = super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(HALF, BlockGlowstoneSheet.EnumBlockHalf.BOTTOM);
		if((facing != EnumFacing.DOWN && (facing == EnumFacing.UP || (double)hitY <= 0.5D)) && !worldIn.isAirBlock(pos.down())){
			return iblockstate;
		}else if(!worldIn.isAirBlock(pos.up())){
			return iblockstate.withProperty(HALF, BlockGlowstoneSheet.EnumBlockHalf.TOP);
		}else{
			return iblockstate;
		}

	}
	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { HALF });
	}
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(HALF, (meta & 8) == 0 ? BlockGlowstoneSheet.EnumBlockHalf.BOTTOM : BlockGlowstoneSheet.EnumBlockHalf.TOP);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		int i = 0;
		if (state.getValue(HALF) == BlockGlowstoneSheet.EnumBlockHalf.TOP)
		{
			i |= 8;
		}

		return i;
	}

	public void setBlockBoundsForItemRender()
	{
		float f = 0.0625F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean isFullCube()
	{
		return false;
	}

	public void addCollisionBoxesToList(World worldIn, BlockPos pos, IBlockState state, AxisAlignedBB mask, List<AxisAlignedBB> list, Entity collidingEntity)
	{
		this.setBlockBoundsBasedOnState(worldIn, pos);
		super.addCollisionBoxesToList(worldIn, pos, state, mask, list, collidingEntity);
	}
	@Override
	public boolean doesSideBlockRendering(IBlockAccess world, BlockPos pos, EnumFacing face){
		// face is on the block being rendered, not this block.
		EnumBlockHalf side = world.getBlockState(pos).getValue(HALF);
		return (side == EnumBlockHalf.TOP && face == EnumFacing.DOWN) || (side == EnumBlockHalf.BOTTOM && face == EnumFacing.UP);
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
	{
		if (side != EnumFacing.UP && side != EnumFacing.DOWN && !super.shouldSideBeRendered(worldIn, pos, side))
		{
			return false;
		}
		// additional logic breaks doesSideBlockRendering and is no longer useful.
		return super.shouldSideBeRendered(worldIn, pos, side);
	}


	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos){
		return super.canPlaceBlockAt(worldIn, pos) && this.canBlockPlace(worldIn, pos);
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor Block
	 */
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		this.checkForDrop(worldIn, pos, state);
	}

	private boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state)
	{
		if (!this.canBlockStay(worldIn, pos, state))
		{
			this.dropBlockAsItem(worldIn, pos, state, 0);
			worldIn.setBlockToAir(pos);
			return false;
		}
		else
		{
			return true;
		}
	}

	private boolean canBlockPlace(World worldIn, BlockPos pos){
		IBlockState state = worldIn.getBlockState(pos);
		if(!worldIn.isAirBlock(pos.down())||(!worldIn.isAirBlock(pos.up()))){
			return true;
		}else{
			return false;
		}
	}
	private boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state){
		if(state.getValue(HALF) == EnumBlockHalf.BOTTOM){
			return !worldIn.isAirBlock(pos.down());
		}else{
			return !worldIn.isAirBlock(pos.up());
		}		
	}

	public static enum EnumBlockHalf implements IStringSerializable	{
		TOP("top"),
		BOTTOM("bottom");

		private final String name;

		private EnumBlockHalf(String name)
		{
			this.name = name;
		}

		public String toString()
		{
			return this.name;
		}

		public String getName()
		{
			return this.name;
		}
	}

}


