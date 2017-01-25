package exide.sensibility.block;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import exide.sensibility.init.ModBlocks;
import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;

public class BlockInsanityTubes extends BlockSensibility{

	public BlockInsanityTubes(){
		super();
		this.setUnlocalizedName(Names.Blocks.INSANITY_TUBES);
		this.setStepSound(soundTypeMetal);
		this.setHardness(5.0F);
	}

/*	public void onBlockAdded(World world, BlockPos pos, IBlockState state){
		super.onBlockAdded(world, pos, state);
		//world.spawnParticle("reddust", X + 0.5D, Y + 1, Z + 0.5D, 0.0D, 0.1D, 0.0D);
		//System.out.println("Placed at least");
		BlockPos pos2;
		int l;
		int m;
		int n;
		for (l = X - 2;l <= X + 2;l++){
			for (m = Z - 2;m <= Z + 2;m++){
				for (n = Y - 1;n <= Y + 1;n++){				
					//System.out.println(l + " , " + n + " , " + m);	
					if(world.getBlockState(pos) == ModBlocks.crazy_crafter){
						world.setBlock(l, n, m, Blocks.crafting_table);
					}
				}
			}
		}
		
		int i;
		int j;
		for (i = X - 1;i <= X + 1;i++){
			for (j = Z - 1;j <= Z + 1;j++){
				//System.out.println(i + " , " + j);	
				if(world.getBlock(i, Y, j) == Blocks.crafting_table){
					world.setBlock(i, Y, j, ModBlocks.crazy_crafter);
//					world.spawnParticle("reddust", i , Y + 1, j + 1, 0.0D, 0.0D, 0.0D);
//					world.spawnParticle("reddust", i , Y + 1, j, 0.0D, 0.0D, 0.0D);
//					world.spawnParticle("reddust", i + 1, Y + 1, j + 1, 0.0D, 0.0D, 0.0D);
//					world.spawnParticle("reddust", i + 1, Y + 1, j, 0.0D, 0.0D, 0.0D);
//					world.spawnParticle("reddust", X + 0.5D, Y + 1, Z + 0.5D, 0.0D, 0.1D, 0.0D);
				}
			}
		}	
	}
	
	public void onBlockPreDestroy(World world, int X, int Y, int Z, int meta){
		super.onBlockPreDestroy(world, X, Y, Z, meta);
		int i;
		int j;
		for (i = X - 1;i <= X + 1;i++){
			for (j = Z - 1;j <= Z + 1;j++){
				if(world.getBlock(i, Y, j) == ModBlocks.crazy_crafter){
					world.setBlock(i, Y, j, Blocks.crafting_table);
				}
			}
		}
	}*/
}
