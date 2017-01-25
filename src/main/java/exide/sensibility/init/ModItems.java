package exide.sensibility.init;

import exide.sensibility.item.*;
import exide.sensibility.reference.Names;
import exide.sensibility.reference.Reference;
import exide.sensibility.utility.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemSensibility logo = new ItemLogo();
    public static final ItemSensibility knife = new ItemKnife();
    public static final Item cpieslice = new ItemSensibilityFood(Names.Items.CPIESLICE, 2, 1.2f, false);
    public static final Item ppieslice = new ItemSensibilityFood(Names.Items.PPIESLICE, 2, 1.2f, false);
    public static final Item lpieslice = new ItemSensibilityFood(Names.Items.LPIESLICE, 2, 1.2f, false, new PotionEffect(Potion.moveSpeed.id, 600));
    public static final Item cakeslice = new ItemSensibilityFood(Names.Items.CAKESLICE, 2, 1.2f, false);
    public static final ItemSensibility glimpite_dust = new ItemGlimpiteDust();
    public static final ItemSensibility spring = new ItemSpring();
    public static final ItemSensibility spring_bundle = new ItemSpringBundle();
//    public static final ItemSensibility prodder = new ItemProdder();
    public static final ItemSensibilityFood salad = new ItemSalad();
    
    //Armor is in here because I didn't want to create a whole new class just for one thing. I'll move it when logical.
    public static ArmorMaterial melonArmorMaterial = EnumHelper.addArmorMaterial("melon", "sensibility:melon", 40, new int[]{1,2,2,1}, 10);
    public static final ItemSensibilityArmor melon_hat = new ItemSensibilityArmor(melonArmorMaterial, 0, 0, "melon_hat");
	public static final ItemSensibilityArmor melon_shirt = new ItemSensibilityArmor(melonArmorMaterial, 0, 1, "melon_shirt");
	public static final ItemSensibilityArmor melon_pants = new ItemSensibilityArmor(melonArmorMaterial, 1, 2, "melon_pants");
	public static final ItemSensibilityArmor melon_boots = new ItemSensibilityArmor(melonArmorMaterial, 0, 3, "melon_boots");

    public static void init()
    {
    
        GameRegistry.registerItem(logo, Names.Items.LOGO);
        GameRegistry.registerItem(knife, Names.Items.KNIFE);
        GameRegistry.registerItem(cpieslice, Names.Items.CPIESLICE);
        GameRegistry.registerItem(ppieslice, Names.Items.PPIESLICE);
        GameRegistry.registerItem(lpieslice, Names.Items.LPIESLICE);
        GameRegistry.registerItem(cakeslice, Names.Items.CAKESLICE);
        GameRegistry.registerItem(glimpite_dust, Names.Items.GLIMPITE_DUST);
        GameRegistry.registerItem(spring, Names.Items.SPRING);
        GameRegistry.registerItem(spring_bundle, Names.Items.SPRING_BUNDLE);
//        GameRegistry.registerItem(prodder, Names.Items.PRODDER);
        GameRegistry.registerItem(salad, Names.Items.SALAD);
        GameRegistry.registerItem(melon_hat, Names.Items.MELON_HAT);
        GameRegistry.registerItem(melon_shirt, Names.Items.MELON_SHIRT);
        GameRegistry.registerItem(melon_pants, Names.Items.MELON_PANTS);
        GameRegistry.registerItem(melon_boots, Names.Items.MELON_BOOTS);

    }
    
    public static void registerRenders(){
    	addRegRen(logo);
    	addRegRen(glimpite_dust);
    	addRegRen(spring);
    	addRegRen(spring_bundle);
    	addRegRen(salad);
    	addRegRen(cakeslice);
    	addRegRen(cpieslice);
    	addRegRen(lpieslice);
    	addRegRen(ppieslice);
    	addRegRen(knife);
    	addRegRen(melon_hat);
    	addRegRen(melon_shirt);
    	addRegRen(melon_pants);
    	addRegRen(melon_boots);
    	


    }
    
    protected static void addRegRen(Item item){
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));

    }
}
