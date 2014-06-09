package com.nibble.Timer.Listeners;

import com.nibble.Timer.Timer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;


/**
 * Dante Pasionek created: com.nibble.Timer.Listeners on May. 27, 2014 *
 */
public class PlayerListener implements Listener {

    Timer plugin;
    public PlayerListener(Timer plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerLoginEvent e) {
        if(plugin.getServer().getOnlinePlayers().length == 2 || plugin.getServer().getOnlinePlayers().length > 2) {

        }
    }
}
