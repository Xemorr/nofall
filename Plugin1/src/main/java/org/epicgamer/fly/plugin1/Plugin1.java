package org.epicgamer.fly.plugin1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new StopFallDamage(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
