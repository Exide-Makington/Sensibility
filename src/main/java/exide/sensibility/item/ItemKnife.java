package exide.sensibility.item;

import java.util.Random;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import exide.sensibility.block.BlockPumpkinPie;
import exide.sensibility.init.ModBlocks;
import exide.sensibility.init.ModItems;
import exide.sensibility.reference.Names;
import exide.sensibility.utility.LogHelper;

public class ItemKnife extends ItemSensibility
{
	public ItemKnife()
	{
		super();
		this.setUnlocalizedName(Names.Items.KNIFE);
		this.setMaxStackSize(1);
		this.setFull3D();
	}
	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ){
		if (world.isRemote) return false;
		IBlockState state = world.getBlockState(pos);
		Block block = world.getBlockState(pos).getBlock();
		int flag = 2;
		Random rand = new Random();
		float f = 0.7F;
		double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
		double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
		double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
		
		if (block == ModBlocks.pumpkin_pie){
			int i = ((Integer)state.getValue(BlockPumpkinPie.BITES)).intValue();
			 if (i < 6) {
	             world.setBlockState(pos, state.withProperty(BlockPumpkinPie.BITES, Integer.valueOf(i + 1)), 3);
	         }else{
	             world.setBlockToAir(pos);
	         }
			ItemStack stack1 = new ItemStack(ModItems.ppieslice);
			EntityItem entityitem = new EntityItem(player.worldObj, (double)pos.getX() + d, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack1);
			player.worldObj.spawnEntityInWorld(entityitem);
		}
		if (block == ModBlocks.cactus_pie){
			int i = ((Integer)state.getValue(BlockPumpkinPie.BITES)).intValue();
			 if (i < 6) {
	             world.setBlockState(pos, state.withProperty(BlockPumpkinPie.BITES, Integer.valueOf(i + 1)), 3);
	         }else{
	             world.setBlockToAir(pos);
	         }
			ItemStack stack1 = new ItemStack(ModItems.cpieslice);
			EntityItem entityitem = new EntityItem(player.worldObj, (double)pos.getX() + d, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack1);
			player.worldObj.spawnEntityInWorld(entityitem);
		}
		if (block == ModBlocks.luminecent_pie){
			int i = ((Integer)state.getValue(BlockPumpkinPie.BITES)).intValue();
			 if (i < 6) {
	             world.setBlockState(pos, state.withProperty(BlockPumpkinPie.BITES, Integer.valueOf(i + 1)), 3);
	         }else{
	             world.setBlockToAir(pos);
	         }
			ItemStack stack1 = new ItemStack(ModItems.lpieslice);
			EntityItem entityitem = new EntityItem(player.worldObj, (double)pos.getX() + d, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack1);
			player.worldObj.spawnEntityInWorld(entityitem);
		}
		if (block == Blocks.cake){
			int i = ((Integer)state.getValue(BlockPumpkinPie.BITES)).intValue();
			 if (i < 6) {
	             world.setBlockState(pos, state.withProperty(BlockPumpkinPie.BITES, Integer.valueOf(i + 1)), 3);
	         }else{
	             world.setBlockToAir(pos);
	         }
			ItemStack stack1 = new ItemStack(ModItems.cakeslice);
			EntityItem entityitem = new EntityItem(player.worldObj, (double)pos.getX() + d, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack1);
			player.worldObj.spawnEntityInWorld(entityitem);
		}
	/*	if (block == ModBlocks.lumi_pie){
			world.setBlockMetadataWithNotify(X, Y, Z, meta + 1, flag);
			if (meta >= 6){ world.setBlockToAir(X, Y, Z); }
			ItemStack stack1 = new ItemStack(ModItems.lpieslice);
			Random rand = new Random();
			float f = 0.7F;
			double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
			double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
			double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
			EntityItem entityitem = new EntityItem(player.worldObj, (double)X + d, (double)Y + d1, (double)Z + d2, stack1);
			entityitem.delayBeforeCanPickup = 2;
			player.worldObj.spawnEntityInWorld(entityitem);
		}
		if (block == Blocks.cake){
			world.setBlockMetadataWithNotify(X, Y, Z, meta + 1, flag);
			if (meta >= 6){ world.setBlockToAir(X, Y, Z); }
			ItemStack stack1 = new ItemStack(ModItems.cakeslice);
			Random rand = new Random();
			float f = 0.7F;
			double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
			double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
			double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
			EntityItem entityitem = new EntityItem(player.worldObj, (double)X + d, (double)Y + d1, (double)Z + d2, stack1);
			entityitem.delayBeforeCanPickup = 2;
			player.worldObj.spawnEntityInWorld(entityitem);
		}*/

		return true;
	}

//	public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int X, int Y, int Z, EntityLivingBase entity){
//		Block disBlock = world.getBlock(X, Y, Z);
//		int disBlocksMeta = world.getBlockMetadata(X, Y, Z);
//		int datBlocksMeta =  world.getBlockMetadata(X, Y - 1, Z);     // vvvvv   this mess of ||s checks if it is a top block of the tall plant   vvvvv
//		if(disBlock == Blocks.double_plant && (disBlocksMeta == 4 || disBlocksMeta == 8 || disBlocksMeta == 9 || disBlocksMeta == 10 || disBlocksMeta == 11)){
//
//			if(disBlocksMeta == 8 || disBlocksMeta == 9 || disBlocksMeta == 10 || disBlocksMeta == 11){
//				if(datBlocksMeta == 4){
//					ItemStack stack1 = new ItemStack(ModBlocks.rose);
//					Random rand = new Random();
//					float f = 0.7F;
//					double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
//					double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
//					double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
//					EntityItem entityitem = new EntityItem(entity.worldObj, (double)X + d, (double)Y + d1, (double)Z + d2, stack1);
//					entityitem.delayBeforeCanPickup = 2;
//					entity.worldObj.spawnEntityInWorld(entityitem);
//				}
//			}else if(disBlocksMeta == 4){
//
//				ItemStack stack1 = new ItemStack(ModBlocks.rose);
//				Random rand = new Random();
//				float f = 0.7F;
//				double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
//				double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
//				double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
//				EntityItem entityitem = new EntityItem(entity.worldObj, (double)X + d, (double)Y + d1, (double)Z + d2, stack1);
//				entityitem.delayBeforeCanPickup = 2;
//				entity.worldObj.spawnEntityInWorld(entityitem);
//			}
//		}
//		return false;
//	}	
//-----------------------*-----------*----------*-------------
	//	public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer player, EntityLiving target) {
	//		if (itemStack.itemID == Sensibility.itemKnife.itemID && target.getClass() == EntityEnderman.class) {
	//			//TODO do all the fixing of this!!! make enderman drop carried block on rclick
	//			System.out.println("WAABLADOO-OP");
	//			target.dropItem(((EntityEnderman) target).getCarried(), 1);
	//			((EntityEnderman) target).setCarried(0);
	//			return true;
	//		}else {
	//			return false;
	//		}
	//	}
}
