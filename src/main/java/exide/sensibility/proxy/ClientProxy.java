package exide.sensibility.proxy;

import exide.sensibility.init.ModBlocks;
import exide.sensibility.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
//import exide.sensibility.client.particle.EntityFogFX;
//import exide.sensibility.client.settings.Keybindings;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders(){
    	ModItems.registerRenders();
    	ModBlocks.registerRenders();
    }
	
	@Override
    public void registerKeyBindings()
    {
//        ClientRegistry.registerKeyBinding(Keybindings.charge);
//        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
    
//    @Override
//    public void spawnFogFX(World world, int X, int Y, int Z)
//    {
//       //note to self: refer to jabelar's tutorial on particles for the original structure of this function
//        EntityFX particleFog = new EntityFogFX(world, X + 0.5D, Y + 1.2D, Z + 0.5D, 0.0D, 0.05D, 0.0D);
//        Minecraft.getMinecraft().effectRenderer.addEffect(particleFog);    
//        // Minecraft.getMinecraft().effectRenderer.addEffect(new EntityFogFX(world, X + 0.5D, Y + 1.2D, Z + 0.5D, 0.0D, 0.05D, 0.0D));
//    }
    
  /*  @Override
	public void nameRefresh(){
		if(mc.theWorld != null) {
			System.out.println("world not null (cl)");

			for(int i = 0; i < mc.theWorld.playerEntities.size(); i++) {
				if(mc.theWorld.playerEntities.get(i) != null){
					System.out.println("entities not null (cl)");
					System.out.println(mc.theWorld.playerEntities.get(i).getClass());

					EntityPlayer player = (EntityPlayer) mc.theWorld.playerEntities.get(i);
					if(player != null){
						System.out.println("should refresh disp name (cl)");

						player.refreshDisplayName();
						mc.thePlayer.refreshDisplayName();
					}
				}
			}
		}
    }*/
    
}
