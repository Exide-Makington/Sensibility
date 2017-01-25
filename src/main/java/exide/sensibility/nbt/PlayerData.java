package exide.sensibility.nbt;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerData implements IExtendedEntityProperties {
//TODO SORT ALL THIS OUT
    private static final String identifier = "sensibilityPlayerData";

    // PROPERTIES =============================================================

    private final EntityPlayer player;
    
    private String dispName;

    // CONSTRUCTOR, GETTER, REGISTER ==========================================

    public PlayerData(EntityPlayer player) {
        this.player = player;
    }

    public static PlayerData get(EntityPlayer player) {
        return (PlayerData) player.getExtendedProperties(identifier);
    }

    public static void register(EntityPlayer player) {
        player.registerExtendedProperties(identifier, new PlayerData(player));
    }

    public boolean isServerSide() {
        return this.player instanceof EntityPlayerMP;
    }
    
 // GETTER, SETTER, SYNCER =================================================

    public void setDispName(String dispName) {
        this.dispName = dispName;
    }

    public String getDispName() {
        return this.dispName;
    }

    // LOAD, SAVE =============================================================

    @Override
    public void saveNBTData(NBTTagCompound nbt) {
        nbt.setString("dispName", this.getDispName());
    }

    @Override
    public void loadNBTData(NBTTagCompound nbt) {
        if (nbt.hasKey("dispName", 8))
            this.setDispName(nbt.getString("dispName"));
    }

    @Override
    public void init(Entity entity, World world) {
    }
}