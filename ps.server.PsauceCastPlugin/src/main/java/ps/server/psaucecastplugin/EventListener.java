package ps.server.psaucecastplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent jEvent) {
        jEvent.getPlayer().sendMessage("§b 歡迎加入調味王國");
    }
}
