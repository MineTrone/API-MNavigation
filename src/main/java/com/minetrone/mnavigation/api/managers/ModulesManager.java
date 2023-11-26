package com.minetrone.mnavigation.api.managers;

import com.minetrone.mnavigation.modules.MNavigationModule;
import com.minetrone.mnavigation.modules.ModuleLoadTime;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public interface ModulesManager {

    /**
     * Register a new module to the plugin.
     *
     * @param mnavigationModule The module to register.
     */
    void registerModule(MNavigationModule mnavigationModule);

    /**
     * Register a new module to the plugin from a file.
     *
     * @param moduleFile The module to register.
     */
    MNavigationModule registerModule(File moduleFile) throws IOException, ReflectiveOperationException;

    /**
     * Unregister a module from the plugin.
     *
     * @param mnavigationModule The module to unregister.
     */
    void unregisterModule(MNavigationModule mnavigationModule);

    /**
     * Get a module by its name.
     *
     * @param name The name of the module.
     */
    @Nullable
    MNavigationModule getModule(String name);

    /**
     * Get all the active modules currently running.
     */
    Collection<MNavigationModule> getModules();

    /**
     * Enable a specific module.
     *
     * @param mnavigationModule The module to load.
     */
    void enableModule(MNavigationModule mnavigationModule);

    /**
     * Enable all modules with a specific module load time.
     *
     * @param moduleLoadTime The module load time to load modules with.
     */
    void enableModules(ModuleLoadTime moduleLoadTime);
}