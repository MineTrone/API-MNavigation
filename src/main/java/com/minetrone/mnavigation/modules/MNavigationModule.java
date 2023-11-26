package com.minetrone.mnavigation.modules;

import com.minetrone.mnavigation.MNavigationNotInstalledExpection;
import com.minetrone.mnavigation.api.MNavigation;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.InputStream;
import java.util.logging.Logger;

public abstract class MNavigationModule {

    protected MNavigationModule(String moduleName, String authorName) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Called when the module is enabled.
     *
     * @param plugin Instance of the plugin.
     */
    public abstract void onEnable(MNavigation plugin);

    /**
     * Called when the module is reloaded.
     *
     * @param plugin Instance of the plugin.
     */
    public abstract void onReload(MNavigation plugin);

    /**
     * Called when the module is disabled.
     *
     * @param plugin Instance of the plugin.
     */
    public abstract void onDisable(MNavigation plugin);

    /**
     * Called when the module can load data about players.
     * It's called after the plugin's data is loaded.
     * <p>
     *
     * @param plugin Instance of the plugin.
     */
    public void loadData(MNavigation plugin) {}

    /**
     * Called when the module initialized for the first time.
     *
     * @param plugin Instance of the plugin.
     */
    protected void onPluginInit(MNavigation plugin) {
        // Can be overridden by custom modules.
    }

    /**
     * List of listeners to register for the module.
     * The plugin will handle the registers for the module - register them when the module is enabled,
     * and unregister them when it is disabled.
     *
     * @param plugin Instance of the plugin.
     * @return Array of listeners for the module. May be null for no listeners.
     */
    @Nullable
    public abstract Listener[] getModuleListeners(MNavigation plugin);

    /**
     * Get when the module should be enabled.
     * There are 3 loading stages for modules:
     * {@link ModuleLoadTime#AFTER_HANDLERS_LOADING} - modules that should be loaded before the worlds are created.
     * Should be used if the module needs to override the WorldsProvider.
     * {@link ModuleLoadTime#NORMAL} - modules that should be loaded without any specifications.
     * Default for all the modules.
     * {@link ModuleLoadTime#AFTER_HANDLERS_LOADING} - modules that should be loaded after all the plugin handlers.
     * Should be used if the module is interacting with the built-in handlers on its {@link #onEnable} method.
     */
    public ModuleLoadTime getLoadTime() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the name of the module.
     */
    public final String getName() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the author of the module.
     */
    public final String getAuthor() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the data folder of the module.
     * The path for the folder is always plugins/MNavigation/modules/{module-name}/
     *
     * @deprecated Misleading name; check out {@link #getModuleFolder()}
     */
    @Deprecated
    public final File getDataFolder() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the folder of the module.
     * The path for the folder is always plugins/MNavigation/modules/{module-name}/
     */
    public final File getModuleFolder() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the jar file of the module.
     * May be null if the module was registered without calling {@link #initModuleLoader(File, ClassLoader)}
     * This is not an expected behavior, and the plugin will never initialize the module with a null file!
     */
    @Nullable
    public final File getModuleFile() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the folder where data of the module can be stored at.
     * The path for the folder is always plugins/MNavigation/datastore/modules/{module-name}/
     */
    public final File getDataStoreFolder() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the class loader of the module.
     * May be null if the module was registered without calling {@link #initModuleLoader(File, ClassLoader)}
     * This is not an expected behavior, and the plugin will never initialize the module with a null class loader!
     */
    @Nullable
    public final ClassLoader getClassLoader() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the logger of the module {@link ModuleLogger}
     */
    public final Logger getLogger() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Check whether the module was initialized or not.
     * Modules will be initialized after calling to {@link #initModule(MNavigation, File, File)}
     */
    public final boolean isInitialized() {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Saves the raw contents of an embedded resource within the module.
     *
     * @param resourceName The name of the resource to save.
     */
    public final void saveResource(String resourceName) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Get the raw contents of an embedded resource within the module.
     *
     * @param resourceName The name of the resource to get contents of.
     */
    public final InputStream getResource(String resourceName) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Initialize the module.
     * This method cannot be called twice - do not call it unless you know what you are doing.
     *
     * @param plugin     An instance to the plugin.
     * @param dataFolder The database folder of the module.
     */
    @Deprecated
    public final void initModule(MNavigation plugin, File dataFolder) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Initialize the module.
     * This method cannot be called twice - do not call it unless you know what you are doing.
     *
     * @param plugin       An instance to the plugin.
     * @param dataFolder   The database folder of the module.
     * @param moduleFolder The folder of the module.
     */
    public final void initModule(MNavigation plugin, File moduleFolder, File dataFolder) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Initialize the module's loaders settings.
     *
     * @param moduleFile  The file of the module jar.
     * @param classLoader The class loader used to load the module.
     */
    public final void initModuleLoader(File moduleFile, ClassLoader classLoader) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Disable the module.
     */
    public final void disableModule() {
        throw new MNavigationNotInstalledExpection();
    }
}