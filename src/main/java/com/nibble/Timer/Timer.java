package com.nibble.Timer;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Dante Pasionek created: com.nibble.Timer on May. 27, 2014 *
 */
public class Timer extends JavaPlugin {

    public void onEnable() {
        print("Enabled!");
    }

    public void onDisable() {
        print("Disabled!");
    }

    protected void print(String message) {
        String prefix = "[Timer] ";
        System.out.println(prefix + message);
    }

}
