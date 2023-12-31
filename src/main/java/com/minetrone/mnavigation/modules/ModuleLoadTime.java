package com.minetrone.mnavigation.modules;

public enum ModuleLoadTime {

    /**
     * When used, the module will be enabled after the worlds are loaded into the game.
     * Please note that all the managers of the plugin are not loaded at this time, and you cannot use them
     * inside your {@link MNavigationModule#onEnable(Main)} method. Furthermore, the data of your module
     * was not yet loaded at this time. If you want to use your data in the {@link MNavigationModule#onEnable(Main)}
     * method, check out {@link #AFTER_MODULE_DATA_LOAD}.
     */
    NORMAL,

    /**
     * When used, the module will be enabled after its data was loaded by calling the
     * {@link MNavigationModule#loadData(Main)} method. Please note that not all the managers of the plugin
     * are loaded at this time, and using them inside your {@link MNavigationModule#onEnable(Main)} may
     * lead to undefined behavior; access them at your own risk.
     */
    AFTER_MODULE_DATA_LOAD,

    /**
     * When used, the module will be enabled after all the managers were completely loaded.
     */
    AFTER_HANDLERS_LOADING
}