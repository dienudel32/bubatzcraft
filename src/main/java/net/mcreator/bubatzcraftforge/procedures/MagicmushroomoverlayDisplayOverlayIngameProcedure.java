package net.mcreator.bubatzcraftforge.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bubatzcraftforge.init.BubatzcraftforgeModMobEffects;

public class MagicmushroomoverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BubatzcraftforgeModMobEffects.MAGICMUSHROOMTRIP.get()) : false) {
			return true;
		}
		return false;
	}
}
