package com.nibble.Timer.Handlers;

import com.nibble.Timer.Timer;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * Dante Pasionek created: com.nibble.Timer.Handlers on May. 27, 2014 *
 */
public class LocationHandler {

    Timer plugin;
    Player[] players;
    public LocationHandler(Timer plugin, Player[] players) {
        this.players = players;
        this.plugin = plugin;
    }

    public void teleportAll() {
        Location location = getLocation();
        for(Player p : players) {
            p.teleport(location);
        }
    }

    protected Location getLocation() {
        String w = plugin.getConfig().getString("Timer.Location.World");
        double x = plugin.getConfig().getDouble("Timer.Location.X");
        double y = plugin.getConfig().getDouble("Timer.Location.Y");
        double z = plugin.getConfig().getDouble("Timer.Location.Z");

        World world = Bukkit.getWorld(w);

        Location l = new Location(world, x, y, z);
        return l;
    }

}
