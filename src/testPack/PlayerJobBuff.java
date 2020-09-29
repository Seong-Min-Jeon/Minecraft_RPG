package testPack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerJobBuff {

	public void playerBuff(Player player) {
		// 본 파이터
		if (player.getInventory().contains(Material.RED_DYE)) {
			
		}
		// 기사
		if (player.getInventory().contains(Material.GREEN_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 0,true,false,false));
		}
		// 프리스트
		if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
			
		}
		// 광전사
		if (player.getInventory().contains(Material.CYAN_DYE)) {
			
		}
		// 데빌
		if (player.getInventory().contains(Material.GRAY_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 0,true,false,false));
		}
		// 엔젤
		if (player.getInventory().contains(Material.PINK_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2,true,false,false));
		}
		// 대행자
		if (player.getInventory().contains(Material.LIME_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
		}
		// 그림자 무사
		if (player.getInventory().contains(Material.YELLOW_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1,true,false,false));
		}
		// 버서커
		if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
		}
		// 군인
		if (player.getInventory().contains(Material.MAGENTA_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, Integer.MAX_VALUE, 2,true,false,false));
		}
		// 그림 리퍼		
		if (player.getInventory().contains(Material.ORANGE_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0,true,false,false));
		}
		// 마인
		if (player.getInventory().contains(Material.BLUE_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1,true,false,false));
		}
		// 팔라딘		
		if (player.getInventory().contains(Material.BROWN_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 2,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 3,true,false,false));
		}
		// 용기사
		if (player.getInventory().contains(Material.BLACK_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2,true,false,false));
		}
		// 대대장
		if (player.getInventory().contains(Material.INK_SAC)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Integer.MAX_VALUE, 1,true,false,false));
		}
	}
	
}
