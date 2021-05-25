package ps.server.psaucecastplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class PsauceCastPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("bc").setExecutor(new bcCommand());
        getServer().getPluginManager().registerEvents(new EventListener(),this);
    }

    @Override
    public void onDisable() {
    }
}
