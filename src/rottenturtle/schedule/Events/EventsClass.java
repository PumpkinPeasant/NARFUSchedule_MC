package rottenturtle.schedule.Events;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import rottenturtle.schedule.SubGroupSelect;
import org.bukkit.plugin.Plugin;
import java.io.*;


public class EventsClass implements Listener {

    @EventHandler
    public void onNPCRightClick(NPCRightClickEvent e) throws FileNotFoundException, IOException
    {
        Player player = e.getClicker();
        NPC npc = e.getNPC();

        if(e.getNPC() instanceof NPC)
        {
            String npcName = npc.getName();

            if(npcName.equals("Приемная комиссия"))
            {
                player.sendMessage(ChatColor.DARK_GRAY + "Добро пожаловать");
                SubGroupSelect SubgroupSelector = new SubGroupSelect();

                SubgroupSelector.newInventory(player);
            }
        }
    }
    @EventHandler
    public void SubGroupSelectOpen(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        ClickType click = event.getClick();
        Inventory open = event.getClickedInventory();
        ItemStack item = event.getCurrentItem();
        if(event.getView().getTitle().equals(ChatColor.DARK_BLUE + "Выберите курс")){
            event.setCancelled(true);
            SubGroupSelect SubgroupSelector = new SubGroupSelect();
            switch (item.getItemMeta().getDisplayName()) {
                case  ("1 Курс"):
                    SubgroupSelector.MainSubjectSelect(player, 1);
                    break;
                case ("2 Курс"):
                    SubgroupSelector.MainSubjectSelect(player, 2);
                    break;
                case ("3 Курс"):
                    SubgroupSelector.MainSubjectSelect(player, 3);
                    break;
                case ("4 Курс"):
                    SubgroupSelector.MainSubjectSelect(player, 4);
                    break;
                case ("5 Курс"):
                    SubgroupSelector.MainSubjectSelect(player, 5);
                    break;
                default:
                    return;
            }

        }
    }

}
