package com.minetrone.mnavigation.cache;

import com.minetrone.mnavigation.MNavigationNotInstalledExpection;
import org.bukkit.World;

public class NavigationCache {

    public NavigationCache(String name, World world, int x, int y, int z) {
        throw new MNavigationNotInstalledExpection();
    }
}