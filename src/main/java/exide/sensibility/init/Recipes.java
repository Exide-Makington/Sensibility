package exide.sensibility.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import exide.sensibility.utility.LogHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cactus_pie), "ccc", "sms", "www", 's', new ItemStack(Items.sugar),'c', new ItemStack(Blocks.cactus),'m', new ItemStack(Items.milk_bucket),'w', new ItemStack(Items.wheat));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.luminecent_pie), "ggg", "sms", "www", 's', new ItemStack(Items.sugar),'g', new ItemStack(Items.glowstone_dust),'m', new ItemStack(Items.milk_bucket),'w', new ItemStack(Items.wheat));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pumpkin_pie), "ppp", "sms", "www", 's', new ItemStack(Items.sugar),'p', new ItemStack(Blocks.pumpkin),'m', new ItemStack(Items.milk_bucket),'w', new ItemStack(Items.wheat));
		GameRegistry.addRecipe(new ItemStack(ModItems.knife), "  i", " si", "s  ", 's', new ItemStack(Items.stick),'i', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(ModItems.salad), "glg", "glg", " b ", 'b', new ItemStack(Items.bowl),'g', new ItemStack(Blocks.tallgrass, 1, 1), 'l', Blocks.leaves);
		GameRegistry.addRecipe(new ItemStack(ModItems.spring), "ii ", " ii", "ii ", 'i', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(ModItems.spring), " ii", "ii ", " ii", 'i', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.glimp), "ddd", "ddd", "ddd", 'd', new ItemStack(ModItems.glimpite_dust));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.player_bouncemaster), "cfc", "csc", "cgc", 'c', new ItemStack(Blocks.cobblestone), 's', new ItemStack(ModItems.spring), 'g', new ItemStack(ModBlocks.glimp), 'f', new ItemStack(Items.porkchop));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mob_bouncemaster), "cfc", "csc", "cgc", 'c', new ItemStack(Blocks.cobblestone), 's', new ItemStack(ModItems.spring), 'g', new ItemStack(ModBlocks.glimp), 'f', new ItemStack(Items.rotten_flesh));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.shock_absorber), "cfc", "csc", "cgc", 'c', new ItemStack(Blocks.cobblestone), 's', new ItemStack(ModItems.spring), 'g', new ItemStack(ModBlocks.glimp), 'f', new ItemStack(Blocks.wool, 1, 7));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.redstone_sand), " r ", "rsr", " r ", 'r', new ItemStack(Items.redstone), 's', new ItemStack(Blocks.sand));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.glimpy_sand), "grg", "sgs", "grg", 'r', new ItemStack(Blocks.gravel), 's', new ItemStack(Blocks.sand), 'g', new ItemStack(ModItems.glimpite_dust));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.glimpy_sand), "gsg", "rgr", "gsg", 'r', new ItemStack(Blocks.gravel), 's', new ItemStack(Blocks.sand), 'g', new ItemStack(ModItems.glimpite_dust));
//		GameRegistry.addRecipe(new ItemStack(ModItems.prodder), " gw", " sg", "s  ", 'g', new ItemStack(ModItems.glimpite_dust), 'w', new ItemStack(Blocks.wool), 's', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.spring_bundle), "sss", "sss", 's', new ItemStack(ModItems.spring));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.glowstone_sheet, 2), "ggg", 'g', new ItemStack(Items.glowstone_dust));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.insanity_tubes), "gdg", "bbb", "lll", 'g', new ItemStack(ModItems.glimpite_dust), 'b', new ItemStack(ModItems.spring_bundle), 'l', new ItemStack(Blocks.stone_slab), 'd', new ItemStack(Items.dye, 1, 10));
		GameRegistry.addRecipe(new ItemStack(ModItems.melon_hat), "mmm", "mdm", 'm', new ItemStack(Blocks.melon_block), 'd', new ItemStack(ModItems.glimpite_dust));
		GameRegistry.addRecipe(new ItemStack(ModItems.melon_shirt), "mdm", "mmm", "mmm", 'm', new ItemStack(Blocks.melon_block), 'd', new ItemStack(ModItems.glimpite_dust));
		GameRegistry.addRecipe(new ItemStack(ModItems.melon_pants), "mmm", "mdm", "m m", 'm', new ItemStack(Blocks.melon_block), 'd', new ItemStack(ModItems.glimpite_dust));
		GameRegistry.addRecipe(new ItemStack(ModItems.melon_pants), "mmm", "m m", "mdm", 'm', new ItemStack(Blocks.melon_block), 'd', new ItemStack(ModItems.glimpite_dust));
		GameRegistry.addRecipe(new ItemStack(ModItems.melon_boots), "mdm", "m m", 'm', new ItemStack(Blocks.melon_block), 'd', new ItemStack(ModItems.glimpite_dust));
		GameRegistry.addRecipe(new ItemStack(ModItems.melon_boots), "m m", "mdm", 'm', new ItemStack(Blocks.melon_block), 'd', new ItemStack(ModItems.glimpite_dust));

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.glimpite_dust, 9), new ItemStack(ModBlocks.glimp));
		
//		for(int i = 0; i <= 15; i++){
//			GameRegistry.addRecipe(new ItemStack(ModBlocks.sticky_carpet, 1, i), "s", "c", 's', new ItemStack(Items.slime_ball), 'c', new ItemStack(Blocks.carpet, 1, i));
//		}
	}
}
