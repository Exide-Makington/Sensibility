package exide.sensibility.block;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import exide.sensibility.init.ModItems;
import exide.sensibility.reference.Names;

public class BlockGlimpOre extends BlockSensibility
{
    public BlockGlimpOre()
    {
        super();
        this.setUnlocalizedName(Names.Blocks.GLIMP_ORE);
        this.setHardness(3.2F);
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.glimpite_dust;
    }
    
    public int quantityDroppedWithBonus(int p_149679_1_, Random rand) {
        return this.quantityDropped(rand) + rand.nextInt(p_149679_1_ + 1);
    }

    public int quantityDropped(Random rand) {
        return 4 + rand.nextInt(2);
    }
    
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune) {
    	return  MathHelper.getRandomIntegerInRange(rand, 0, 2);
    }
}
