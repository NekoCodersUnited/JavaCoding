package com.nekocraft.nwelcome.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.nekocraft.nwelcome.Center;
import com.nekocraft.nwelcome.JSON.JSONChatClickEventType;
import com.nekocraft.nwelcome.JSON.JSONChatExtra;
import com.nekocraft.nwelcome.JSON.JSONChatHoverEventType;
import com.nekocraft.nwelcome.JSON.JSONChatMessage;

public class cmessage implements CommandExecutor {
	
	private Center plugin;
	public cmessage (Center instance) {
		plugin = instance;
		
	    }

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (cmd.getName().equalsIgnoreCase("nwelcome")){
			Player p = (Player)sender;
			p.sendMessage("§e§m-------------------------------------------");
			p.sendMessage("§f");
			p.sendMessage("§6     Menu de ayuda §4§k!!§9§lNekoWelcome§4§k!!");
	    	p.sendMessage("§f");
	    	p.sendMessage("§e              HELP-ABOUT-FAQ");
	    	p.sendMessage("§f");
	    	p.sendMessage("§b         Creado por: §9NekoCraftYT");
	        p.sendMessage("§f");
	        p.sendMessage("§e                Redes Sociales:");
	        p.sendMessage("§f");
	        JSONChatMessage texto = new JSONChatMessage("   ", null, null);
			JSONChatExtra foro = new JSONChatExtra("  §aWiki");
			foro.setHoverEvent(JSONChatHoverEventType.SHOW_TEXT, "§eDame click");
			foro.setClickEvent(JSONChatClickEventType.OPEN_URL, "https://playluxcraft.enjin.com");
			texto.addExtra(foro);
			
			JSONChatExtra tienda = new JSONChatExtra(" §eWeb");
			tienda.setHoverEvent(JSONChatHoverEventType.SHOW_TEXT, "§eDame click");
			tienda.setClickEvent(JSONChatClickEventType.OPEN_URL, "http://luxcraftienda.buycraft.net/");
			texto.addExtra(tienda);
			
			JSONChatExtra discord = new JSONChatExtra(" §9Discord");
			discord.setHoverEvent(JSONChatHoverEventType.SHOW_TEXT, "§eDame click");
			discord.setClickEvent(JSONChatClickEventType.OPEN_URL, "https://discord.gg/a8hYbK3");
			texto.addExtra(discord);
			
			JSONChatExtra facebook = new JSONChatExtra(" §bFacebook");
			facebook.setHoverEvent(JSONChatHoverEventType.SHOW_TEXT, "§eDame click");
			facebook.setClickEvent(JSONChatClickEventType.OPEN_URL, "https://www.facebook.com/groups/1830131033713289/");
			texto.addExtra(facebook);
			
			texto.sendToPlayer(p);
			p.sendMessage("§f");
	        p.sendMessage("§e§m-------------------------------------------");
	        
		}
		return false;
		
		}
		
	}

