
package net.mcreator.bubatzcraftforge.potion;

public class WeedtripMobEffect extends MobEffect {

	public WeedtripMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13382656);
		setRegistryName("weedtrip");
	}

	@Override
	public String getDescriptionId() {
		return "effect.bubatzcraftforge.weedtrip";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WeedTripOverlayDisplayOverlayIngameProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
