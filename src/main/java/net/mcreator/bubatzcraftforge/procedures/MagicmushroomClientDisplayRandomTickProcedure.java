package net.mcreator.bubatzcraftforge.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.bubatzcraftforge.init.BubatzcraftforgeModParticles;

public class MagicmushroomClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.75) {
			if (Math.random() < 0.25) {
				world.addParticle(BubatzcraftforgeModParticles.MAGICMUSHROOMPARTICLE, (x + Math.random() * 10), (y + Math.random()),
						(z + Math.random() * 10), 0, (-0.01), 0);
			} else if (Math.random() < 0.5 && Math.random() > 0.25) {
				world.addParticle(BubatzcraftforgeModParticles.MAGICMUSHROOMPARTICLE, (x - Math.random() * 10), (y + Math.random()),
						(z + Math.random() * 10), 0, (-0.01), 0);
			} else if (Math.random() < 0.75 && Math.random() > 0.5) {
				world.addParticle(BubatzcraftforgeModParticles.MAGICMUSHROOMPARTICLE, (x + Math.random() * 10), (y + Math.random()),
						(z - Math.random() * 10), 0, (-0.01), 0);
			} else {
				world.addParticle(BubatzcraftforgeModParticles.MAGICMUSHROOMPARTICLE, (x - Math.random() * 10), (y + Math.random()),
						(z - Math.random() * 10), 0, (-0.01), 0);
			}
		}
	}
}
