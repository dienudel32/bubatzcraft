package net.mcreator.bubatzcraftforge.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MagicmushroomoverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BubatzcraftforgeModMobEffects.MAGICMUSHROOMTRIP) : false) {
			return true;
		}
		return false;
	}
}
