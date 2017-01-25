package exide.sensibility.block;

import java.util.Random;

import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.stats.StatList;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import exide.sensibility.Sensibility;
//import exide.sensibility.client.gui.GuiCrazyCrafting;
//import exide.sensibility.client.gui.GuiProdderConfig;
import exide.sensibility.reference.GUIs;
import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;

public class BlockCrazyCrafter extends BlockSensibility
{
    public BlockCrazyCrafter()
    {
        super(Material.wood);
        this.setUnlocalizedName(Names.Blocks.CRAZY_CRAFTER);
        this.setStepSound(soundTypeWood);
        this.setHardness(2.5F);

        
    }
 
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return Item.getItemFromBlock(Blocks.crafting_table);
    }
    
    
//    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
//    {
//        if (worldIn.isRemote)
//        {
//            return true;
//        }
//        else
//        {
//            playerIn.displayGui(new BlockWorkbench.InterfaceCraftingTable(worldIn, pos));
//            return true;
//        }
//    }
   
    
   /* public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ){
        if(world.isRemote) {
            if (world.getTileEntity(pos) != null)
                player.displayGui(Sensibility.instance, GUIs.CRAZY_CRAFTING.ordinal(), world, pos);
            	//TODO fix the not opening of gui
            	LogHelper.info("lamanate");
            	//Minecraft.getMinecraft().displayGuiScreen(new GuiCrazyCrafting(player.inventory, world, x, y, z));
            return true;
        }
        return true;
    }*/    
}
