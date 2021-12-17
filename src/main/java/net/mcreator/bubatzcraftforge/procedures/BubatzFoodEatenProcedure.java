package net.mcreator.bubatzcraftforge.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.bubatzcraftforge.network.BubatzcraftforgeModVariables;
import net.mcreator.bubatzcraftforge.init.BubatzcraftforgeModMobEffects;
import net.mcreator.bubatzcraftforge.BubatzcraftforgeMod;

import java.util.Iterator;

public class BubatzFoodEatenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(BubatzcraftforgeModMobEffects.WEEDTRIP, 5200, 0, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 0, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 1, (false), (false)));
		BubatzcraftforgeModVariables.WorldVariables.get(world).joint_count = BubatzcraftforgeModVariables.WorldVariables.get(world).joint_count + 1;
		BubatzcraftforgeModVariables.WorldVariables.get(world).syncData(world);
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0, (false), (false)));
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 2400);
		if (BubatzcraftforgeModVariables.WorldVariables.get(world).joint_count == 100) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("bubatzcraftforge:addict"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
		BubatzcraftforgeMod.LOGGER.debug(("Joint Count is now: " + BubatzcraftforgeModVariables.WorldVariables.get(world).joint_count));
	}
}
