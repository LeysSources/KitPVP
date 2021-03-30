package me.Plugin.Plugin;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
public class Main extends JavaPlugin {
	String archer = " Archer";
	String bard = " Bard";
	String diamond = " Diamond";
	
	

	
	
	
    @Override
    public void onEnable() {
    	
    }
    @Override
    public void onDisable() {
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
     
    	
    	  if(command.getName().equalsIgnoreCase("kit")) {
    		   
    		  
    		  if (args[0].equalsIgnoreCase("diamond")){
    			    if(!sender.hasPermission("kit.diamond")){
    			    	 sender.sendMessage("You do not own kit diamond");
    			    	 return true;
    			    	
    			    } if(sender.hasPermission("kit.diamond")) {
    			    	Player player = (Player) sender;
    			    	sender.sendMessage("Gave Kit diamond");
    		            PlayerInventory inventory = player.getInventory();
    		            
     		            inventory.addItem(new ItemStack(Material.IRON_SWORD));
    		            inventory.addItem(new ItemStack(Material.DIAMOND_HELMET));
    		            inventory.addItem(new ItemStack(Material.DIAMOND_BOOTS));
    		            inventory.addItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
    		            inventory.addItem(new ItemStack(Material.DIAMOND_LEGGINGS));
    		            inventory.addItem(new ItemStack(Material.GOLDEN_APPLE, 4));
    		            return true;
    			    }
    			  		
    			  
    		    }
    		 
    		  
    		  if (args[0].equalsIgnoreCase("bard")){
    			  if(!sender.hasPermission("kit.bard")){
 			    	 sender.sendMessage("You do not own kit bard");
 			    	 return true;
 			    } if (sender.hasPermission("kit.bard")) {
    		    	 Player player = (Player) sender;
 		            PlayerInventory inventory = player.getInventory();
 		           sender.sendMessage("Gave Kit Bard");
 		            inventory.addItem(new ItemStack(Material.DIAMOND_SWORD));
		            inventory.addItem(new ItemStack(Material.LEATHER_HELMET));
		            inventory.addItem(new ItemStack(Material.LEATHER_BOOTS));
		            inventory.addItem(new ItemStack(Material.LEATHER_CHESTPLATE));
		            inventory.addItem(new ItemStack(Material.LEATHER_LEGGINGS));
		            inventory.addItem(new ItemStack(Material.GOLDEN_APPLE, 16));
 		            return true;
 			    }
    		    }
    		  if (args[0].equalsIgnoreCase("archer")){
    			  if(!sender.hasPermission("kit.archer")){
  			    	 sender.sendMessage("You do not own kit archer");
  			    	 return true;
  			    } if (sender.hasPermission("kit.archer")) {
   		    	 Player player = (Player) sender;
		            PlayerInventory inventory = player.getInventory();
		            sender.sendMessage("Gave Kit Archer");
		            inventory.addItem(new ItemStack(Material.BOW));
		            inventory.addItem(new ItemStack(Material.ARROW, 64));
		            inventory.addItem(new ItemStack(Material.CHAINMAIL_HELMET));
		            inventory.addItem(new ItemStack(Material.CHAINMAIL_BOOTS));
		            inventory.addItem(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		            inventory.addItem(new ItemStack(Material.CHAINMAIL_LEGGINGS));
		            inventory.addItem(new ItemStack(Material.WOODEN_SWORD));
		            return true;
  			    }
   		    }

    		  }
    	 
    	  if(command.getName().equalsIgnoreCase("kits")) {
    		  sender.sendMessage("Available kits: " );
    		  if (sender.hasPermission("kit.diamond")) {
    			  sender.sendMessage("Diamond");
    			  
    		  } if (sender.hasPermission("kit.bard")) {
    			  sender.sendMessage("Bard");
    			 
    		  } if (sender.hasPermission("kit.archer")) {
    			  sender.sendMessage("Archer");
    			 
    		  }
    		  
    		  
    		  
    		  return true;
    	  } 
    	  
    	  return false;
    	 
    	}
    
    	
    	}

    	

    

    
    







    	
    	
    	
