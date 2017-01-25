package exide.sensibility.proxy;

import net.minecraftforge.fml.common.eventhandler.Event;
//import exide.sensibility.event.SensibilityEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.NameFormat;

public abstract class CommonProxy implements IProxy{
	Minecraft mc = Minecraft.getMinecraft();
	
	@Override
	public void spawnFogFX(World world, int X, int Y, int Z) {
		
	}
	
	@Override
	public void registerRenders(){
		
	}
	
	/*
	@Override
	public void nameRefresh(){
		if(mc.theWorld != null) {
			System.out.println("world not null");
			
			if(mc.thePlayer != null){
				if(mc.thePlayer.getClass() != null){
				System.out.println("spoon: " + mc.thePlayer.getClass() + " | " + mc.thePlayer.getCommandSenderName());
				Event ev = new SensibilityEvent.NameRefresh();
				MinecraftForge.EVENT_BUS.post(ev);
				//mc.thePlayer.refreshDisplayName();
			}
			}

			for(int i = 0; i < mc.theWorld.playerEntities.size(); i++) {
				if(mc.theWorld.playerEntities.get(i) != null){
					System.out.println("entities not null");
					System.out.println(mc.theWorld.playerEntities.get(i).getClass());

					EntityPlayer player = (EntityPlayer) mc.theWorld.playerEntities.get(i);
					if(player != null){
						System.out.println("should refresh disp name");

						player.refreshDisplayName();
					}
					if (player instanceof EntityOtherPlayerMP){
						System.out.println("other");
					}
				}
			}
		}
	}
*/
	
}
