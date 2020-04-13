package rottenturtle.schedule;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;
import rottenturtle.schedule.Events.EventsClass;
import rottenturtle.schedule.MySqlMain;


public class main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Narfu schedule has been enabled");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
        MySqlMain SqlConn = new MySqlMain();
        LoadConfig();
        SqlConn.mysqlsetup(getConfig().getString("host"),getConfig().getString("database"),
                getConfig().getString("username"),getConfig().getString("password"),
                getConfig().getInt("port"));

    }
    public void LoadConfig(){
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }
    @Override
    public void onDisable() {
        getLogger().info("Narfu schedule has been disabled");

    }
}
