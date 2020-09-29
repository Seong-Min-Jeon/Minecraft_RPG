package testPack;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_16_R1.WorldServer;

public class TPMobSpawn {

	public TPMobSpawn(Player player, Location loc) {

		//System.out.println(loc.toString());

		fairy(player, loc);
		snow(player, loc);
		senmag(player, loc);
		tower(player, loc);
	}

	public void fairy(Player player, Location loc) {
		// Ÿ���� ���� �ձ� �Ա�
		if (loc.getX() == 3745.57 && loc.getY() == 77 && loc.getZ() == 3430.3) {
			player.teleport(new Location(player.getWorld(), 3745.56, 77, 3430.3));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3755 84 3430 3736 74 3461
					if (loc2.getX() <= 3755 && loc2.getY() <= 84 && loc2.getZ() <= 3461 && loc2.getX() >= 3736
							&& loc2.getY() >= 74 && loc2.getZ() >= 3430) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Wither) {
						nearEntity.remove();
					}
					if (nearEntity instanceof Blaze) {
						nearEntity.remove();
					}
					if (nearEntity instanceof Phantom) {
						nearEntity.remove();
					}
				}
			}
			CustomWither cw = new CustomWither(new Location(player.getWorld(), 3745, 77, 3444));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cw);
			for (int i = 0; i < 5; i++) {
				loc.getWorld().spawnEntity(new Location(player.getWorld(), 3740, 80, 3438), EntityType.PHANTOM);
			}
			for (int i = 0; i < 5; i++) {
				loc.getWorld().spawnEntity(new Location(player.getWorld(), 3750, 77, 3453), EntityType.BLAZE);
			}
			return;
		}
		

		// Ÿ���� ���� �ձ� ����
		if (loc.getX() == 3775.61 && loc.getY() == 90.2 && loc.getZ() == 3461.38) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "�� �༮�� �� ������ ��ġ�� �� ���̳�. �׾��.");

			player.teleport(new Location(player.getWorld(), 3775.6, 90.2, 3461.38));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3754 90 3497 3797 75 3456
					if (loc2.getX() <= 3797 && loc2.getY() <= 91 && loc2.getZ() <= 3497 && loc2.getX() >= 3754
							&& loc2.getY() >= 75 && loc2.getZ() >= 3456) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3754 90 3497 3797 75 3456
						if (loc2.getX() <= 3797 && loc2.getY() <= 90 && loc2.getZ() <= 3497 && loc2.getX() >= 3754
								&& loc2.getY() >= 75 && loc2.getZ() >= 3456) {
							nearEntity.remove();
						}
					}
				}
			}

			Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();

			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3776, 77, 3477),
					EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(17);
			head.setHelmet(headItem);

			Skeleton mob2 = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3774, 77, 3477),
					EntityType.SKELETON);
			EntityEquipment head2 = mob2.getEquipment();
			ItemStack headItem2 = chest.getInventory().getItem(16);
			head2.setHelmet(headItem2);
			return;
		}
	}
	
	public void snow(Player player, Location loc) {
		// ī�� ���� �Ա�
		if (loc.getX() == 3826.7 && loc.getY() == 16 && loc.getZ() == 3211.44) {
			player.teleport(new Location(player.getWorld(), 3826.71, 16, 3211.43));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3832 42 3179  3769 9 3242
					if (loc2.getX() <= 3832 && loc2.getY() <= 42 && loc2.getZ() <= 3242 && 
							loc2.getX() >= 3769 && loc2.getY() >= 8 && loc2.getZ() >= 3179) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3832 42 3179  3769 9 3242
						if (loc2.getX() <= 3832 && loc2.getY() <= 42 && loc2.getZ() <= 3242 && 
								loc2.getX() >= 3769 && loc2.getY() >= 8 && loc2.getZ() >= 3179) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3815, 14, 3211), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3812, 14, 3218), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3221), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3798, 14, 3218), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3795, 14, 3211), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3798, 14, 3204), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3201), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3812, 14, 3204), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
//			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3773, 25, 3228), EntityType.WITHER_SKELETON);
//			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3773, 25, 3228), EntityType.SKELETON);
//			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3773, 25, 3228), EntityType.SKELETON);
//			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3773, 25, 3228), EntityType.SKELETON);
//			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3775, 24, 3220), EntityType.SKELETON);
//			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3774, 23, 3215), EntityType.SKELETON);
//			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3775, 22, 3211), EntityType.SKELETON);
//			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3774, 21, 3207), EntityType.SKELETON);
			return;
		}
		
		
		// ī�� ���� �߰�����
		if (loc.getX() == 3808.5 && loc.getY() == 69.5 && loc.getZ() == 3215.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "�� �𿡰� ������ �����ֵ��� ����.");

			player.teleport(new Location(player.getWorld(), 3808, 69, 3215));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3807 93 3201  3783 63 3227
					if (loc2.getX() <= 3807 && loc2.getY() <= 93 && loc2.getZ() <= 3227 && loc2.getX() >= 3783
							&& loc2.getY() >= 63 && loc2.getZ() >= 3201) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3807 93 3201  3783 63 3227
						if (loc2.getX() <= 3807 && loc2.getY() <= 93 && loc2.getZ() <= 3227 && loc2.getX() >= 3783
								&& loc2.getY() >= 63 && loc2.getZ() >= 3201) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3791, 69, 3215),EntityType.WITHER_SKELETON);
			return;
		}
		

		// ī�� ���� ����
		if (loc.getX() == 3730 && loc.getY() == 179 && loc.getZ() == 3236) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "���� ������ �Ǿ��. �ּ���.");

			player.teleport(new Location(player.getWorld(), 3730.1, 179, 3236));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3711 163 3254  3769 133 3217
					if (loc2.getX() <= 3769 && loc2.getY() <= 163 && loc2.getZ() <= 3254 && loc2.getX() >= 3711
							&& loc2.getY() >= 133 && loc2.getZ() >= 3217) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3711 163 3254  3769 133 3217
						if (loc2.getX() <= 3769 && loc2.getY() <= 163 && loc2.getZ() <= 3254 && loc2.getX() >= 3711
								&& loc2.getY() >= 133 && loc2.getZ() >= 3217) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3740, 140, 3236), EntityType.ZOMBIE);
			return;
		}
	}
	
	public void senmag(Player player, Location loc) {
		// �� ���� ���� �Ա�
		if (loc.getX() == 3407.63 && loc.getY() == 16 && loc.getZ() == 3823.35) {
			player.teleport(new Location(player.getWorld(), 3407.62, 16, 3823.34));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3390 40 3826  3424 11 3783
					if (loc2.getX() <= 3424 && loc2.getY() <= 40 && loc2.getZ() <= 3826 && 
							loc2.getX() >= 3390 && loc2.getY() >= 11 && loc2.getZ() >= 3783) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3390 40 3826  3424 11 3783
						if (loc2.getX() <= 3424 && loc2.getY() <= 40 && loc2.getZ() <= 3826 && 
								loc2.getX() >= 3390 && loc2.getY() >= 11 && loc2.getZ() >= 3783) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs1 = new CustomSkeleton(new Location(player.getWorld(), 3394, 16, 3823));
			CustomSkeleton cs2 = new CustomSkeleton(new Location(player.getWorld(), 3394, 16, 3819));
			CustomSkeleton cs3 = new CustomSkeleton(new Location(player.getWorld(), 3394, 16, 3815));
			CustomSkeleton cs4 = new CustomSkeleton(new Location(player.getWorld(), 3420, 16, 3823));
			CustomSkeleton cs5 = new CustomSkeleton(new Location(player.getWorld(), 3420, 16, 3819));
			CustomSkeleton cs6 = new CustomSkeleton(new Location(player.getWorld(), 3420, 16, 3815));
			CustomZombie cz1 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			CustomZombie cz2 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			CustomZombie cz3 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			CustomZombie cz4 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			CustomZombie cz5 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs1);
			world.addEntity(cs2);
			world.addEntity(cs3);
			world.addEntity(cs4);
			world.addEntity(cs5);
			world.addEntity(cs6);
			world.addEntity(cz1);
			world.addEntity(cz2);
			world.addEntity(cz3);
			world.addEntity(cz4);
			world.addEntity(cz5);
			return;
		}
		
		// ������
		if (loc.getX() == 3405.5 && loc.getY() == 13 && loc.getZ() == 3766.5) {
			player.teleport(new Location(player.getWorld(), 3405.6, 13, 3766.4));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3415 25 3769  3395 9 3712
					if (loc2.getX() <= 3415 && loc2.getY() <= 25 && loc2.getZ() <= 3769 && loc2.getX() >= 3395
							&& loc2.getY() >= 9 && loc2.getZ() >= 3712) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3415 25 3769  3395 9 3712
						if (loc2.getX() <= 3415 && loc2.getY() <= 25 && loc2.getZ() <= 3769 && loc2.getX() >= 3395
								&& loc2.getY() >= 9 && loc2.getZ() >= 3712) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomWitherSkeleton cw1 = new CustomWitherSkeleton(new Location(player.getWorld(), 3405, 13, 3753));
			CustomSkeleton cs1 = new CustomSkeleton(new Location(player.getWorld(), 3400, 13, 3741));
			CustomZombie cz1 = new CustomZombie(new Location(player.getWorld(), 3410, 13, 3741));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs1);
			world.addEntity(cz1);
			world.addEntity(cw1);
			return;
		}
		
		
		// ����
		if (loc.getX() == 3317.46 && loc.getY() == 13 && loc.getZ() == 3725.51) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "�� �� �� �ϳ��� �� �ǵ帱��.");

			player.teleport(new Location(player.getWorld(), 3317.45, 13, 3725.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3336 10 3725  3299 45 3762
					if (loc2.getX() <= 3336 && loc2.getY() <= 45 && loc2.getZ() <= 3762 && loc2.getX() >= 3299
							&& loc2.getY() >= 10 && loc2.getZ() >= 3725) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3336 10 3725  3299 45 3762
						if (loc2.getX() <= 3336 && loc2.getY() <= 45 && loc2.getZ() <= 3762 && loc2.getX() >= 3299
								&& loc2.getY() >= 10 && loc2.getZ() >= 3725) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3317, 15, 3744),EntityType.WITHER_SKELETON);
			return;
		}
		

		// ���� ����
		if (loc.getX() == 3369.59 && loc.getY() == 14 && loc.getZ() == 3803.7) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "���� ����ᰡ �� �߷� ã�ƿԱ�.");

			player.teleport(new Location(player.getWorld(), 3369.6, 14, 3803.71));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3355 32 3803  3383 11 3766
					if (loc2.getX() <= 3383 && loc2.getY() <= 32 && loc2.getZ() <= 3803 && loc2.getX() >= 3355
							&& loc2.getY() >= 11 && loc2.getZ() >= 3766) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3355 32 3803  3383 11 3766
						if (loc2.getX() <= 3383 && loc2.getY() <= 32 && loc2.getZ() <= 3803 && loc2.getX() >= 3355
								&& loc2.getY() >= 11 && loc2.getZ() >= 3766) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3369, 14, 3783), EntityType.ZOMBIE);
			return;
		}
	}
	
	public void tower(Player player, Location loc) {
		// ������ ž 1��
		if (loc.getX() == 72.5 && loc.getY() == 75 && loc.getZ() == -3.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 75, -3.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 54 75 -5  90 86 -41
					if (loc2.getX() <= 90 && loc2.getY() <= 87 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 75 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 54 75 -5  90 86 -41
						if (loc2.getX() <= 90 && loc2.getY() <= 87 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 75 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 75, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 2��
		if (loc.getX() == 72.5 && loc.getY() == 88 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 88, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 100 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 88 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 100 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 88 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 88, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 3��
		if (loc.getX() == 72.5 && loc.getY() == 101 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 101, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 115 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 101 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 115 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 101 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 101, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 4��
		if (loc.getX() == 72.5 && loc.getY() == 116 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 116, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 116, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 5��
		if (loc.getX() == 72.5 && loc.getY() == 129 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 129, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 141 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 129 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 141 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 129 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 129, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 6��
		if (loc.getX() == 72.5 && loc.getY() == 142 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 142, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 156 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 142 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 156 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 142 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 142, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 7��
		if (loc.getX() == 72.5 && loc.getY() == 157 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 157, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 157, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 8��
		if (loc.getX() == 72.5 && loc.getY() == 170 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 170, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 170, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 9��
		if (loc.getX() == 72.5 && loc.getY() == 183 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 183, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 197 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 183 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 197 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 183 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 183, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 10��
		if (loc.getX() == 72.5 && loc.getY() == 198 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 198, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 210 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 198 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 210 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 198 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 198, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 11��
		if (loc.getX() == 72.5 && loc.getY() == 211 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 211, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 223 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 211 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 223 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 211 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 211, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		// ������ ž 12��
		if (loc.getX() == 72.5 && loc.getY() == 224 && loc.getZ() == -7.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 224, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 238 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 224 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 238 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 224 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs = new CustomSkeleton(new Location(player.getWorld(), 72, 224, -22));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
			return;
		}
		
		
	}
	
}