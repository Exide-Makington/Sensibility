package exide.sensibility.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import exide.sensibility.init.ModBlocks;

public class SensibilityOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId()){
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateOverworld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}
	}
	
	/**
	 * A nice handy ore adding method to consolidate the various numbers into one place.
	 * @param block the ore block
	 * @param random a random number generator
	 * @param world the world
	 * @param chunkX chunk X coord
	 * @param chunkZ chunk Z coord
	 * @param veinSize max size of the ore vein
	 * @param spawnBelow generate below this Y level
	 * @param spawnChance chance of spawning. the higher the number, the more it tries to spawn it.
	 */
	private void addOre(Block block, Random random, World world, int chunkX, int chunkZ, int veinSize, int spawnBelow, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			BlockPos pos = new BlockPos(chunkX + random.nextInt(16), random.nextInt(spawnBelow), chunkZ + random.nextInt(16));

			new WorldGenMinable(block.getDefaultState(), veinSize).generate(world, random, pos);
		}
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {

	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		addOre(ModBlocks.glimp_ore, random, world, chunkX, chunkZ, 10, 42, 13);		
	}

	private void generateNether(Random random, int i, int j, World world) {

	}

}
