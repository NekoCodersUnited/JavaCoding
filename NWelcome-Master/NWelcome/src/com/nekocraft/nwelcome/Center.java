package com.nekocraft.nwelcome;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.nekocraft.nwelcome.comandos.cmessage;
import com.nekocraft.nwelcome.comandos.eventos;

public class Center extends JavaPlugin {
	
	public static Center instance;
	
	PluginDescriptionFile pdffile = getDescription();
	public String version = pdffile.getVersion();
	public String nombre = ChatColor.YELLOW+ pdffile.getName()+ChatColor.AQUA+"»";
	
	public void onEnable() {
		instance = this;
		
		this.getServer().getPluginManager().registerEvents(new eventos(instance), instance);
		Bukkit.getConsoleSender().sendMessage("§9§m---------------------------------------");
		Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.GREEN+" El plugin esta activado "+ChatColor.GRAY+"["+ChatColor.AQUA+"V"+version+ChatColor.GRAY+"]");
		Bukkit.getConsoleSender().sendMessage("§9§m---------------------------------------");
		registrarMensaje();
		
		
	}
	
    public void onDisable() {
		
    	Bukkit.getConsoleSender().sendMessage("§9§m---------------------------------------");
		Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.RED+" El plugin esta desactivado "+ChatColor.GRAY+"["+ChatColor.AQUA+"V"+version+ChatColor.GRAY+"]");
		Bukkit.getConsoleSender().sendMessage("§9§m---------------------------------------");
		
		
		
	}
    
    public void registrarMensaje() {
    	
    	this.getCommand("nwelcome").setExecutor(new cmessage(this));
    }
    
    public void registrarEvento() {
    	
    	this.getClass();
    }
	

}
