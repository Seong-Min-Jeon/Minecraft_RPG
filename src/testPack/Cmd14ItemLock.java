package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_16_R1.CraftServer;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.google.common.graph.ElementOrder.Type;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import net.minecraft.server.v1_16_R1.EntityPlayer;
import net.minecraft.server.v1_16_R1.MinecraftServer;
import net.minecraft.server.v1_16_R1.PacketPlayOutEntityHeadRotation;
import net.minecraft.server.v1_16_R1.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_16_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_16_R1.PlayerConnection;
import net.minecraft.server.v1_16_R1.PlayerInteractManager;
import net.minecraft.server.v1_16_R1.WorldServer;

public class Cmd14ItemLock implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			ItemStack item = player.getInventory().getItemInMainHand();
			if(cmd.getName().equalsIgnoreCase("ItemLock")) {
				try {
					if((item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
							|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
							|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
							|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
							|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
							|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
							|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
							|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
							|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
							|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
							|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
							|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
							|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
							|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
							|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
							|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
							|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
							|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
							|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
							|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS
							
							|| item.getType() == Material.MUSIC_DISC_11 || item.getType() == Material.MUSIC_DISC_13 || item.getType() == Material.MUSIC_DISC_BLOCKS 
							|| item.getType() == Material.MUSIC_DISC_CAT || item.getType() == Material.MUSIC_DISC_CHIRP || item.getType() == Material.MUSIC_DISC_FAR 
							|| item.getType() == Material.MUSIC_DISC_MALL || item.getType() == Material.MUSIC_DISC_MELLOHI || item.getType() == Material.MUSIC_DISC_PIGSTEP 
							|| item.getType() == Material.MUSIC_DISC_STAL || item.getType() == Material.MUSIC_DISC_STRAD || item.getType() == Material.MUSIC_DISC_WAIT 
							|| item.getType() == Material.MUSIC_DISC_WARD
							
							|| item.getType() == Material.DEAD_BRAIN_CORAL_BLOCK || item.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || item.getType() == Material.DEAD_FIRE_CORAL_BLOCK
							|| item.getType() == Material.DEAD_HORN_CORAL_BLOCK || item.getType() == Material.DEAD_TUBE_CORAL_BLOCK
							
							|| item.getType() == Material.BRAIN_CORAL_BLOCK || item.getType() == Material.HORN_CORAL_BLOCK || item.getType() == Material.TUBE_CORAL_BLOCK 
							|| item.getType() == Material.BUBBLE_CORAL_BLOCK || item.getType() == Material.FIRE_CORAL_BLOCK
							
							|| item.getType() == Material.LEATHER_HELMET || item.getType() == Material.LEATHER_CHESTPLATE || item.getType() == Material.LEATHER_LEGGINGS 
							|| item.getType() == Material.LEATHER_BOOTS || item.getType() == Material.CHAINMAIL_HELMET || item.getType() == Material.CHAINMAIL_CHESTPLATE 
							|| item.getType() == Material.CHAINMAIL_LEGGINGS || item.getType() == Material.CHAINMAIL_BOOTS || item.getType() == Material.IRON_HELMET 
							|| item.getType() == Material.IRON_CHESTPLATE || item.getType() == Material.IRON_LEGGINGS || item.getType() == Material.IRON_BOOTS 
							|| item.getType() == Material.GOLDEN_HELMET || item.getType() == Material.GOLDEN_CHESTPLATE || item.getType() == Material.GOLDEN_LEGGINGS 
							|| item.getType() == Material.GOLDEN_BOOTS || item.getType() == Material.DIAMOND_HELMET || item.getType() == Material.DIAMOND_CHESTPLATE 
							|| item.getType() == Material.DIAMOND_LEGGINGS || item.getType() == Material.DIAMOND_BOOTS || item.getType() == Material.NETHERITE_HELMET
							|| item.getType() == Material.NETHERITE_CHESTPLATE || item.getType() == Material.NETHERITE_LEGGINGS || item.getType() == Material.NETHERITE_BOOTS
							
							|| item.getType() == Material.POLISHED_GRANITE_STAIRS || item.getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS || item.getType() == Material.MOSSY_STONE_BRICK_STAIRS 
							|| item.getType() == Material.POLISHED_DIORITE_STAIRS || item.getType() == Material.MOSSY_COBBLESTONE_STAIRS || item.getType() == Material.END_STONE_BRICK_STAIRS 
							|| item.getType() == Material.SMOOTH_SANDSTONE_STAIRS || item.getType() == Material.SMOOTH_QUARTZ_STAIRS || item.getType() == Material.GRANITE_STAIRS)) {
						if(item.hasItemMeta()) {
							ItemMeta im = item.getItemMeta();
							if(im.hasCustomModelData()) {
								if(im.getCustomModelData() == 0) {
									im.setCustomModelData(1);
									item.setItemMeta(im);
									player.sendMessage(ChatColor.GREEN + "Lock Complete!");
									return true;
								}
								if(im.getCustomModelData() == 1) {
									im.setCustomModelData(0);
									item.setItemMeta(im);
									player.sendMessage(ChatColor.GREEN + "Unlock Complete!");
									return true;
								}
							} else {
								im.setCustomModelData(1);
								item.setItemMeta(im);
								player.sendMessage(ChatColor.GREEN + "Lock Complete!");
								return true;
							}
						} else {
							player.sendMessage(ChatColor.RED + "Unlockable Item");
							return true;
						}
					} else {
						player.sendMessage(ChatColor.RED + "Unlockable Item");
						return true;
					}
					
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "Undefined Error");
					return true;
				}
				return true;
			}
		}	
		return true;
	}


}
