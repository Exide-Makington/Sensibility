package exide.sensibility.init;

import java.util.ArrayList;
import java.util.List;

import exide.sensibility.block.*;
import exide.sensibility.handler.ConfigurationHandler;
//import exide.sensibility.item.ItemFancyBlock;
//import exide.sensibility.item.ItemStickyCarpet;
import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{
	
    public static final BlockSensibility glimp = new BlockGlimp();
    public static final BlockSensibilityFalling black_sand = new BlockBlackSand();
    public static final BlockSensibility glimp_ore = new BlockGlimpOre();
    public static final BlockSensibilityFalling glimpy_sand = new BlockGlimpySand();
    public static final BlockSensibility cactus_pie = new BlockCactusPie();
    public static final BlockSensibility pumpkin_pie = new BlockPumpkinPie();
    public static final BlockSensibility luminecent_pie = new BlockLumiPie();
    public static final BlockSensibility player_bouncemaster = new BlockPlayerBouncemaster();
    public static final BlockSensibility mob_bouncemaster = new BlockMobBouncemaster();
    public static final BlockSensibility crazy_crafter = new BlockCrazyCrafter();
    public static final BlockSensibility insanity_tubes = new BlockInsanityTubes();
    public static final BlockSensibility glowstone_sheet = new BlockGlowstoneSheet();
//    public static final BlockSensibility fancy_block = new BlockFancyBlock();
    public static final BlockSensibility rose = new BlockRose();
//    public static final BlockSensibility sticky_carpet = new BlockStickyCarpet();
    public static final BlockSensibilityFalling redstone_sand = new BlockRedstoneSand();
//    public static final BlockSensibilityRail rusty_rail = new BlockRustyRail();
    public static final BlockSensibility shock_absorber = new BlockShockAbsorber();



    public static void init()
    {
        GameRegistry.registerBlock(glimp, Names.Blocks.GLIMP);
        GameRegistry.registerBlock(black_sand, Names.Blocks.BLACK_SAND);
        GameRegistry.registerBlock(glimp_ore, Names.Blocks.GLIMP_ORE);
        GameRegistry.registerBlock(glimpy_sand, Names.Blocks.GLIMPY_SAND);
        GameRegistry.registerBlock(cactus_pie, Names.Blocks.CACTUS_PIE);
        GameRegistry.registerBlock(pumpkin_pie, Names.Blocks.PUMPKIN_PIE);
        GameRegistry.registerBlock(luminecent_pie, Names.Blocks.LUMI_PIE);
        GameRegistry.registerBlock(player_bouncemaster, Names.Blocks.PLAYER_BOUNCEMASTER);
        GameRegistry.registerBlock(mob_bouncemaster, Names.Blocks.MOB_BOUNCEMASTER);
        GameRegistry.registerBlock(crazy_crafter, Names.Blocks.CRAZY_CRAFTER);
        GameRegistry.registerBlock(insanity_tubes, Names.Blocks.INSANITY_TUBES);
        GameRegistry.registerBlock(glowstone_sheet, Names.Blocks.GLOWSTONE_SHEET);
        GameRegistry.registerBlock(rose, Names.Blocks.ROSE);
//        GameRegistry.registerBlock(sticky_carpet, ItemStickyCarpet.class, Names.Blocks.STICKY_CARPET);
        GameRegistry.registerBlock(redstone_sand, Names.Blocks.REDSTONE_SAND);
//        GameRegistry.registerBlock(rusty_rail, Names.Blocks.RUSTY_RAIL);
        GameRegistry.registerBlock(shock_absorber, Names.Blocks.SHOCK_ABSORBER);

        if(ConfigurationHandler.enableFancyBlocks){
        	LogHelper.info("I would load the Fancy Blocks here, if the mod was further developed.");
      //Fancy Blocks will be added in 1.8 and will utilize block subtypes rather than metadata
     //   GameRegistry.registerBlock(fancy_block, ItemFancyBlock.class, Names.Blocks.FANCY_BLOCK);
        
        }
    }
    
    public static void registerRenders(){
    	addRegRen(glimp_ore);
    	addRegRen(glimp);
    	addRegRen(black_sand);
    	addRegRen(glimpy_sand);
    	addRegRen(redstone_sand);
    	addRegRen(insanity_tubes);
    	addRegRen(glowstone_sheet);
    	addRegRen(crazy_crafter);
    	addRegRen(player_bouncemaster);
    	addRegRen(mob_bouncemaster);
    	addRegRen(shock_absorber);
    	addRegRen(rose);
    	addRegRen(pumpkin_pie);
    	addRegRen(cactus_pie);
    	addRegRen(luminecent_pie);
    	

    }
    
    protected static void addRegRen(Block block){
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getUnlocalizedName().substring(5), "inventory"));
    }
    
}
