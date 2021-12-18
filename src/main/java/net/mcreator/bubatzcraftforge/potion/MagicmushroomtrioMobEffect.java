
package net.mcreator.bubatzcraftforge.potion;

public class MagicmushroomtrioMobEffect extends MobEffect {

	public MagicmushroomtrioMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
		setRegistryName("magicmushroomtrip");
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
