package exide.sensibility.world;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SensibilityWorldGen {
	
	public static void mainRegistry(){
		initialzeWorldGen();
	}
	
	public static void initialzeWorldGen(){
		registerWorldGen(new SensibilityOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int wProb){
		GameRegistry.registerWorldGenerator(worldGenClass, wProb);
	}
}
