package rottenturtle.schedule;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;

class MySqlMain {
    private static Connection connection;

    void mysqlsetup(String host,String database,String username,String password,int port){
        try{
            synchronized (this){
                if(getConnection() != null && !getConnection().isClosed()){
                    return;
                }
                Class.forName("com.mysql.jdbc.Driver");
                setConnection(DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port + "/" + database, username, password));
                Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"Successful connection to MySQL Database");
        }
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }


     public static Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
