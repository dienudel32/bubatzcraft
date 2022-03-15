package net.mcreator.bubatzcraftforge.procedures;

import net.minecraftforge.eventbus.api.Event;

public class WeedTripOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BubatzcraftforgeModMobEffects.WEEDTRIP.get()) : false) {
			return true;
		}
		return false;
	}
}
