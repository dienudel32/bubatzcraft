
package net.mcreator.bubatzcraftforge.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MagicmushroomtrioMobEffect extends MobEffect {
	public MagicmushroomtrioMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.bubatzcraftforge.magicmushroomtrip";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
