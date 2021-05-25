package ps.server.psaucecastplugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class bcCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("I am So Dab");
            sender.sendMessage("我是" + sender.getName());
            String version = sender.getServer().getVersion();
            sender.sendMessage(version);
            return true;
        } else {
            sender.sendMessage("I am Not So Dab");
            return false;
        }
    }
}
