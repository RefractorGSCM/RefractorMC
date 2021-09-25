package com.github.refractorgscm.refractormc.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.Player;

public class PlayerListCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof RemoteConsoleCommandSender)) {
            sender.sendMessage("Unknown command. Type \"/help\" for help.");
            return true;
        }

        StringBuilder sb = new StringBuilder();

        for (Player player : Bukkit.getOnlinePlayers()) {
            sb.append(String.format("%s,%s", player.getUniqueId(), player.getName()));
        }

        sender.sendMessage(sb.toString());

        return false;
    }
}
