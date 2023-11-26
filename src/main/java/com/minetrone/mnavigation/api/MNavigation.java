package com.minetrone.mnavigation.api;

import com.minetrone.mnavigation.api.managers.ModulesManager;
import org.bukkit.plugin.Plugin;

public interface MNavigation extends Plugin {

    /**
     * Get the modules manager of the plugin.
     */
    ModulesManager getModules();
}