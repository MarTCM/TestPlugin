package com.martcm.test.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {

    public static ItemStack Survival;

    public static void init() {
        createSurvival();
    }

    private static void createSurvival() {
        ItemStack item = new ItemStack(Material.GRASS_BLOCK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("&6Survival");
        item.setItemMeta(meta);
        Survival = item;
    }

}
