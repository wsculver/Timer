package com.nibble.Timer.Handlers;

import com.nibble.Timer.Timer;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

/**
 * Dante Pasionek created: com.nibble.Timer.Handlers on May. 27, 2014 *
 */
public class TimerHandler extends BukkitRunnable {

    Timer plugin;
    int count;
    LocationHandler lh;
    public TimerHandler(Timer plugin, int count) {
        this.plugin = plugin;
        lh = new LocationHandler(plugin, Bukkit.getOnlinePlayers());
        this.count = count;
        BukkitTask task = new TimerHandler(plugin, 3).runTaskTimer(plugin, 0, 3600);
    }

    public void startTimer() {
        run();
    }

    public void endTimer() {
        this.cancel();
    }

    public int getTaskID() {
        return this.getTaskId();
    }

    @Override
    public void run() {
        if(count > 0)
            count --;
        else {
            lh.teleportAll();
            endTimer();
        }

    }
}
