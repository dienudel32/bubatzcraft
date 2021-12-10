package net.mcreator.bubatzcraftforge.procedures;

import net.minecraftforge.eventbus.api.Event;

public class HeroineinjectionRightClickedOnBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.1) {
			entity.hurt(DamageSource.GENERIC, 10000);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 50000, 15, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10000, 2, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 6000, 0, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 6000, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 6000, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(BubatzcraftforgeModItems.SYRINGE);
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
	}
}
