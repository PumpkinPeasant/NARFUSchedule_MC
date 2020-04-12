package rottenturtle.schedule;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;
import rottenturtle.schedule.Events.EventsClass;

public class main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Narfu schedule has been enabled");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("Narfu schedule has been disabled");

    }
}
