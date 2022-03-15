
package net.mcreator.bubatzcraftforge.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.bubatzcraftforge.procedures.WeedTripOverlayDisplayOverlayIngameProcedure;

public class WeedtripMobEffect extends MobEffect {
	public WeedtripMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13382656);
	}

	@Override
	public String getDescriptionId() {
		return "effect.bubatzcraftforge.weedtrip";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		WeedTripOverlayDisplayOverlayIngameProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
