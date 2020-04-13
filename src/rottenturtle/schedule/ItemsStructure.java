package rottenturtle.schedule;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemsStructure {
    public ItemsStructure(String name_group,int id_group){
        Stack = new ItemStack(Material.PAPER);
        Meta = Stack.getItemMeta();
        Meta.setDisplayName(name_group);
        ArrayList<String> lore = new ArrayList<>();
        lore.add(String.valueOf(id_group));
        Meta.setLore(lore);
    }
    public ItemStack Stack;
    public ItemMeta Meta;
}
