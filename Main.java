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
    			  		Player player = (Player) sender;
    		            PlayerInventory inventory = player.getInventory();
     		            inventory.addItem(new ItemStack(Material.IRON_SWORD));
    		            inventory.addItem(new ItemStack(Material.DIAMOND_HELMET));
    		            inventory.addItem(new ItemStack(Material.DIAMOND_BOOTS));
    		            inventory.addItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
    		            inventory.addItem(new ItemStack(Material.DIAMOND_LEGGINGS));
    		            inventory.addItem(new ItemStack(Material.GOLDEN_APPLE, 4));
    		            return true;
    		    }
    		 
    		  if (args[0].equalsIgnoreCase("bard")){
    		    	 Player player = (Player) sender;
 		            PlayerInventory inventory = player.getInventory();
 		            inventory.addItem(new ItemStack(Material.DIAMOND_SWORD));
		            inventory.addItem(new ItemStack(Material.LEATHER_HELMET));
		            inventory.addItem(new ItemStack(Material.LEATHER_BOOTS));
		            inventory.addItem(new ItemStack(Material.LEATHER_CHESTPLATE));
		            inventory.addItem(new ItemStack(Material.LEATHER_LEGGINGS));
		            inventory.addItem(new ItemStack(Material.GOLDEN_APPLE, 16));
 		            return true;
    		    }
    		  if (args[0].equalsIgnoreCase("archer")){
   		    	 Player player = (Player) sender;
		            PlayerInventory inventory = player.getInventory();
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
    	 
    	  if(command.getName().equalsIgnoreCase("kits")) {
    		  sender.sendMessage("Available kits: " + archer + bard + diamond);
    		  return true;
    	  } 
    	  
    	  return false;
    	 
    	}
    
    	
    	}

    	

    

    
    







    	
    	
    	
