package com.minetrone.mnavigation.api.handlers;

import com.minetrone.mnavigation.MNavigationNotInstalledExpection;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NavigationFollowEvent extends Event {

    public NavigationFollowEvent(Player player, Location navigationLocation, String navigationName) {
        throw new MNavigationNotInstalledExpection();
    }

    @Override
    public HandlerList getHandlers() {
        throw new MNavigationNotInstalledExpection();
    }

    public static HandlerList getHandlerList() {
        throw new MNavigationNotInstalledExpection();
    }

    public boolean isCancelled() {
        throw new MNavigationNotInstalledExpection();
    }

    public void setCancelled(boolean cancel) {
        throw new MNavigationNotInstalledExpection();
    }

    public Player getPlayer() {
        throw new MNavigationNotInstalledExpection();
    }

    public Location getNavigationLocation() {
        throw new MNavigationNotInstalledExpection();
    }

    public String getNavigationName() {
        throw new MNavigationNotInstalledExpection();
    }
}