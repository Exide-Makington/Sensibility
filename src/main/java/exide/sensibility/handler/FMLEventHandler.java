package exide.sensibility.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class FMLEventHandler {

	Minecraft mc = Minecraft.getMinecraft();
	MinecraftServer mcs = MinecraftServer.getServer();
	
/*	int i = 0;
	
	@SubscribeEvent
	public void tickerThing(TickEvent.ClientTickEvent ev){
		
		if(i >= 300){
			if(mc.thePlayer != null){
				//System.out.println(mc.thePlayer.getCommandSenderName());
			}
			if(mc.theWorld != null){
				if(mc.theWorld.getPlayerEntityByName("MaybeIMadeIt") != null){
					//System.out.println(mc.theWorld.getPlayerEntityByName("MaybeIMadeIt").getEntityData().getBoolean("SUN"));
				}
			}
			i = 0;
		}else{
			i++;
		}
	}*/
}
