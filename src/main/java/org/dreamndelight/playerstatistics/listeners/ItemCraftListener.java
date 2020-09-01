package org.dreamndelight.playerstatistics.listeners;

import org.dreamndelight.playerstatistics.enums.Statistic;
import org.dreamndelight.playerstatistics.main.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;


public class ItemCraftListener implements Listener {

    @EventHandler
    public void onCraftItem(CraftItemEvent event) {
        assert event.getWhoClicked() instanceof Player;
        if(event.getCurrentItem() == null) return;
        Main.getInstance().getStatisticsManager().addStatistic((Player) event.getWhoClicked(), Statistic.ITEMS_CRAFTED, event.getCurrentItem().getType(), event.getCurrentItem().getAmount());
    }

}