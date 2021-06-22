package ps.server.psaucecastplugin;

import com.sun.tools.javac.util.List;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.io.File;


public class bcCommand implements CommandExecutor {
    private final Plugin plugin;
    public bcCommand(Plugin p) {
        plugin = p;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args){
        YamlConfiguration BoardCasts = YamlConfiguration.loadConfiguration(
                new File(plugin.getDataFolder(), "BroadCasts.yml"));
        List<?> Posts = (List<?>) BoardCasts.getList("BroadCasts");
        if (args.length == 0) {
            sender.sendMessage("< PsaucePlugin > 請輸入需要公告的訊息!");
            return false;
        }else{
            for (int i = 1; i < args.length; i++) {

            }
            return true;
        }
    }

}
