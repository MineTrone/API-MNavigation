package com.minetrone.mnavigation.api;

import com.minetrone.mnavigation.MNavigationNotInstalledExpection;
import com.minetrone.mnavigation.Main;
import com.minetrone.mnavigation.api.managers.AdventureManager;
import com.minetrone.mnavigation.api.managers.ModulesManager;
import com.minetrone.mnavigation.api.managers.NavigationManager;
import com.minetrone.mnavigation.api.managers.StorageManager;

public class MNavigationAPI {

    /**
     * Returns instance of Main class
     * @return Main instance
     * @see Main
     */
    public static Main getInstance() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Storage manager for config and json files.
     * @see StorageManager
     * @return StorageManager
     */
    public static StorageManager getStorageManager() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Adventure manager for adventure mode.
     * @see AdventureManager
     * @return AdventureManager
     */
    public static AdventureManager getAdventureManager() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Navigation manager for navigation.
     * @see NavigationManager
     * @return NavigationManager
     */
    public static NavigationManager getNavigationManager() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Modules manager for modules.
     * @see ModulesManager
     * @return ModulesManager
     */
    public static ModulesManager getModulesManager() {
        throw new MNavigationNotInstalledExpection();
    }
}