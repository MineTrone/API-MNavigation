package com.minetrone.mnavigation;

public class MNavigationNotInstalledExpection extends UnsupportedOperationException {

    public MNavigationNotInstalledExpection() {
        super("ERROR: MNavigation is not installed! Please install it first to use this API!");
    }

}