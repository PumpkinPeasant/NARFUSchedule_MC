package rottenturtle.schedule;

import org.apache.logging.log4j.core.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;

public class SubGroupSelect implements Listener {
    private main plugin = main.getPlugin(main.class);


        public void newInventory(Player player){
        Inventory SubgroupSelector = plugin.getServer().createInventory(null,9, ChatColor.DARK_BLUE + "Выберите курс");


        String skin_of_one = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2E1MTZmYmFlMTYwNThmMjUxYWVmOWE2OGQzMDc4NTQ5ZjQ4ZjZkNWI2ODNmMTljZjVhMTc0NTIxN2Q3MmNjIn19fQ==";
        String skin_of_two = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDY5OGFkZDM5Y2Y5ZTRlYTkyZDQyZmFkZWZkZWMzYmU4YTdkYWZhMTFmYjM1OWRlNzUyZTlmNTRhZWNlZGM5YSJ9fX0=";
        String skin_of_three ="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmQ5ZTRjZDVlMWI5ZjNjOGQ2Y2E1YTFiZjQ1ZDg2ZWRkMWQ1MWU1MzVkYmY4NTVmZTlkMmY1ZDRjZmZjZDIifX19";
        String skin_of_four = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjJhM2Q1Mzg5ODE0MWM1OGQ1YWNiY2ZjODc0NjlhODdkNDhjNWMxZmM4MmZiNGU3MmY3MDE1YTM2NDgwNTgifX19";
        String skin_of_five = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDFmZTM2YzQxMDQyNDdjODdlYmZkMzU4YWU2Y2E3ODA5YjYxYWZmZDYyNDVmYTk4NDA2OTI3NWQxY2JhNzYzIn19fQ==";


        ItemStack course1 = SkullCreator.itemFromBase64(skin_of_one);
        ItemStack course2 = SkullCreator.itemFromBase64(skin_of_two);
        ItemStack course3 = SkullCreator.itemFromBase64(skin_of_three);
        ItemStack course4 = SkullCreator.itemFromBase64(skin_of_four);
        ItemStack course5 = SkullCreator.itemFromBase64(skin_of_five);
        SkullMeta Meta1 = (SkullMeta) course1.getItemMeta();
        SkullMeta Meta2 = (SkullMeta) course2.getItemMeta();
        SkullMeta Meta3 = (SkullMeta) course3.getItemMeta();
        SkullMeta Meta4 = (SkullMeta) course4.getItemMeta();
        SkullMeta Meta5 = (SkullMeta) course5.getItemMeta();
        Meta1.setDisplayName("1 Курс");
        Meta2.setDisplayName("2 Курс");
        Meta3.setDisplayName("3 Курс");
        Meta4.setDisplayName("4 Курс");
        Meta5.setDisplayName("5 Курс");
        course1.setItemMeta(Meta1);
        course2.setItemMeta(Meta2);
        course3.setItemMeta(Meta3);
        course4.setItemMeta(Meta4);
        course5.setItemMeta(Meta5);


        SubgroupSelector.setItem(0, course1);
        SubgroupSelector.setItem(2, course2);
        SubgroupSelector.setItem(4, course3);
        SubgroupSelector.setItem(6, course4);
        SubgroupSelector.setItem(8, course5);

        player.openInventory(SubgroupSelector);
    }

}
