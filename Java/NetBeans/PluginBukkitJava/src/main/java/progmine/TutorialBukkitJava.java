package progmine;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class TutorialBukkitJava extends JavaPlugin {

    PlayerListener listener = new PlayerListener();

    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("O plugin foi carregado com sucesso!");
        getServer().getPluginManager().registerEvents(listener, this);
    }



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
