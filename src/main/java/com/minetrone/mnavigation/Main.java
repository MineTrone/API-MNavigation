package com.minetrone.mnavigation;

public class Main {

    public static Main getInstance() {
        throw new MNavigationNotInstalledExpection();
    }
}