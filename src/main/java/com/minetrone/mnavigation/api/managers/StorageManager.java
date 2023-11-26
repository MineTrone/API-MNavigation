package com.minetrone.mnavigation.api.managers;

import com.minetrone.mnavigation.MNavigationNotInstalledExpection;
import de.leonhard.storage.Config;
import de.leonhard.storage.Json;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.io.InputStream;

public class StorageManager {

    /**
     * Initiating config file
     *
     * @param fileName name of the file
     * @return Config
     * @see Config
     */
    public Config initConfig(String fileName) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Initiating lang file into lang folder
     *
     * @param fileName name of the file
     * @return Config
     * @see Config
     */
    public Config initLangFile(String fileName) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Initiating config file for modules
     *
     * @param moduleName name of the module
     * @return Config
     * @see Config
     */
    public Config initModuleConfigFile(String moduleName, String fileName, Plugin plugin, InputStream inputStream) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Initiating config file for addons
     *
     * @param fileName name of the file
     * @param plugin  plugin instance
     * @return Config
     * @see Config
     */
    public Config initConfig(String fileName, @NotNull JavaPlugin plugin) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Initiating json file
     *
     * @param fileName name of the file
     * @return Json
     * @see Json
     */
    public Json initJson(String fileName) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Initiating json file
     *
     * @param fileName name of the file
     * @param plugin main class of project
     * @return Json
     * @see Json
     */
    public Json initJson(String fileName, @NotNull JavaPlugin plugin) {
        throw new MNavigationNotInstalledExpection();
    }
}