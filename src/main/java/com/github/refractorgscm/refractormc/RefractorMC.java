package com.github.refractorgscm.refractormc;

import com.github.refractorgscm.refractormc.commands.PlayerListCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class RefractorMC extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("playerlist").setExecutor(new PlayerListCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
