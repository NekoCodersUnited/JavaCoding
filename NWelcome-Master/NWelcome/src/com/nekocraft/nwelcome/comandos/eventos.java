package com.nekocraft.nwelcome.comandos;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.nekocraft.nwelcome.Center;
import com.nekocraft.nwelcome.JSON.JSONChatClickEventType;
import com.nekocraft.nwelcome.JSON.JSONChatExtra;
import com.nekocraft.nwelcome.JSON.JSONChatHoverEventType;
import com.nekocraft.nwelcome.JSON.JSONChatMessage;

public class eventos implements Listener {
	
	private Center plugin;
	public eventos (Center instance) {
		plugin = instance;
		
	    }
		@EventHandler
	    public void onJoin(PlayerJoinEvent event) {
	        Bienvenidac(event.getPlayer());
	        Player player = event.getPlayer();
	        
	        Bukkit.broadcastMessage("§7[§a+§7] "+ player.getName());
	    	player.sendMessage("§f");
	    	player.sendMessage("§f");
	    	player.sendMessage("§f");
	    	player.sendMessage("§f");
	    	player.sendMessage("§f");
	    	player.sendMessage("§6          Bienvenido a §4§k!!§9§lLuxCraft§4§k!!");
	        player.sendMessage("§f");
	        player.sendMessage("§e                Redes Sociales:");
	        player.sendMessage("§f");
	  
			JSONChatMessage texto = new JSONChatMessage("   ", null, null);
			JSONChatExtra foro = new JSONChatExtra("  §aForo§7,");
			foro.setHoverEvent(JSONChatHoverEventType.SHOW_TEXT, "§eDame click");
			foro.setClickEvent(JSONChatClickEventType.OPEN_URL, "https://playluxcraft.enjin.com");
			texto.addExtra(foro);
			
			JSONChatExtra tienda = new JSONChatExtra(" §eTienda§7,");
			tienda.setHoverEvent(JSONChatHoverEventType.SHOW_TEXT, "§eDame click");
			tienda.setClickEvent(JSONChatClickEventType.OPEN_URL, "http://luxcraftienda.buycraft.net/");
			texto.addExtra(tienda);
			
			JSONChatExtra discord = new JSONChatExtra(" §9Discord§7,");
			discord.setHoverEvent(JSONChatHoverEventType.SHOW_TEXT, "§eDame click");
			discord.setClickEvent(JSONChatClickEventType.OPEN_URL, "https://discord.gg/a8hYbK3");
			texto.addExtra(discord);
			
			JSONChatExtra facebook = new JSONChatExtra(" §bFacebook");
			facebook.setHoverEvent(JSONChatHoverEventType.SHOW_TEXT, "§eDame click");
			facebook.setClickEvent(JSONChatClickEventType.OPEN_URL, "https://www.facebook.com/groups/1830131033713289/");
			texto.addExtra(facebook);
			
			texto.sendToPlayer(player);
			
			player.sendMessage("§f");
	    	player.sendMessage("§f");
	    	player.sendMessage("§f");
	    	player.sendMessage("§f");
	    	player.sendMessage("§f");
//			   Foro Tienda Discord Facebook
	        
			
	    }
	    
	    public void QuitPlayer(PlayerQuitEvent e) {
	        Bienvenidac(e.getPlayer());
	        Player player = e.getPlayer();
	        
	        Bukkit.broadcastMessage("§7[§c-§7]&7"+ player.getName());
	   
			
	    	
	    }
		private void Bienvenidac(Player player) {
			// TODO Auto-generated method stub
			
		}
	    
	}