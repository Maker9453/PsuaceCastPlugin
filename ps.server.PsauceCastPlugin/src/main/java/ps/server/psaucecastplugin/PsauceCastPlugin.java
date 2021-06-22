package ps.server.psaucecastplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class PsauceCastPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("bc")).setExecutor(new bcCommand(this));
        getServer().getPluginManager().registerEvents(new EventListener(),this);
    }

    @Override
    public void onDisable() {
    }
}
