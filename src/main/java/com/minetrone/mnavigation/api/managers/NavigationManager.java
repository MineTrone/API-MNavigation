package com.minetrone.mnavigation.api.managers;

import com.minetrone.mnavigation.MNavigationNotInstalledExpection;
import com.minetrone.mnavigation.cache.NavigationCache;

public class NavigationManager {

    public NavigationCache getNavigationCache(String name) {
        throw new MNavigationNotInstalledExpection();
    }
}