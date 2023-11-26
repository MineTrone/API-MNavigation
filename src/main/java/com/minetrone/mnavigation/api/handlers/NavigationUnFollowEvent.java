package com.minetrone.mnavigation.api.handlers;

import com.minetrone.mnavigation.MNavigationNotInstalledExpection;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NavigationUnFollowEvent extends Event {

    public NavigationUnFollowEvent(Player player) {
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
}