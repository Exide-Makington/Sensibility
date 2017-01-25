package exide.sensibility.proxy;

import net.minecraft.world.World;

public interface IProxy
{
    public abstract void registerKeyBindings();
    
    public void spawnFogFX(World world, int X, int Y, int Z); 
    
    public void registerRenders();
    
    //public void nameRefresh();

}
