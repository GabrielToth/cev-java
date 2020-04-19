package progmine;

import org.bukkit.ChatColor;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        /**
         * if u want all players see this mensage.
         * event.setJoinMessage("Welcome: " + event.getPlayer().getDisplayName());
         */
        event.setJoinMessage(null);
        event.getPlayer().sendMessage(ChatColor.GREEN+""+ChatColor.BOLD+"Welcome: " +event.getPlayer().getDisplayName());
    }

    @EventHandler
    public void qualquerNome(PlayerQuitEvent event) {
        event.setQuitMessage(event.getPlayer().getDisplayName()+" leave.");
    }

    @EventHandler(ignoreCancelled = true)
    public void quandoAbrirPorta2(PlayerInteractEvent event) {
        if(event.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }
        if(event.getClickedBlock().getType().name().contains("DOOR")){
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED+"You can't open DOORS! (2)");
        }
    }

    @EventHandler(priority = EventPriority.LOW)
    public void quandoAbrirPorta(PlayerInteractEvent event) {
        if(event.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }
        if(event.getClickedBlock().getType().name().contains("DOOR")){
            event.setUseInteractedBlock(Event.Result.DENY);
            event.getPlayer().sendMessage(ChatColor.RED+"You can't open DOORS!");
        }
    }
}
