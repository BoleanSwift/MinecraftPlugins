package bryto.main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BoleanSwiftPlugin extends JavaPlugin {
	
	Logger ConsoleLog = Logger.getLogger("Mr Minecraft");
	
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(new Handler(), this);
		
		getLogger().info("System is now enabled!");
		
	}
	
	public void onDisable() {
		
		getLogger().info("System is now disabled!");
		
	}
}
	