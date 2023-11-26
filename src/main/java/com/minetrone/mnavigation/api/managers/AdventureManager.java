package com.minetrone.mnavigation.api.managers;

import com.minetrone.mnavigation.MNavigationNotInstalledExpection;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.sound.Sound;
import net.kyori.adventure.text.Component;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdventureManager {

    public Component getComponentFromMiniMessage(String text) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Send a message to a command sender
     * @param sender sender
     * @param s message
     */
    public void sendMessage(CommandSender sender, String s) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Send a message to console
     * @param s message
     */
    public void consoleMessage(String s) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Send a message to a player
     * @param player player
     * @param s message
     */
    public void playerMessage(Player player, String s) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Send a title to a player
     * @param player player
     * @param s1 title
     * @param s2 subtitle
     * @param in in (ms)
     * @param duration duration (ms)
     * @param out out (ms)
     */
    public void playerTitle(Player player, String s1, String s2, int in, int duration, int out) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Send a title to a player
     * @param player player
     * @param s1 title
     * @param s2 subtitle
     * @param in in (ms)
     * @param duration duration (ms)
     * @param out out (ms)
     */
    public void playerTitle(Player player, Component s1, Component s2, int in, int duration, int out) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Send an actionbar to a player
     * @param player player
     * @param s actionbar
     */
    public void playerActionbar(Player player, String s) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Play a sound to a player
     * @param player player
     * @param source sound source
     * @param key sound key
     * @param volume volume
     * @param pitch pitch
     */
    public void playerSound(Player player, Sound.Source source, Key key, float volume, float pitch) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Play a sound to a player
     * @param player player
     * @param sound sound
     */
    public void playerSound(Player player, Sound sound) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Replace legacy color codes
     * @param legacy legacy
     * @return string
     */
    public String replaceLegacy(String legacy) {
        throw new MNavigationNotInstalledExpection();
    }

    /**
     * Check if char is a color code
     * @param c char
     * @return boolean
     */
    private static boolean isColorCode(char c) {
        return c == '\u00a7' || c == '&';
    }
}