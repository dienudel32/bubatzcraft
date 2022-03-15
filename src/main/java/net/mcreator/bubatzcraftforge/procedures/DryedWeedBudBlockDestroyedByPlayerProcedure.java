package net.mcreator.bubatzcraftforge.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DryedWeedBudBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(BubatzcraftforgeModItems.WEEDBUDS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(BubatzcraftforgeModItems.WEEDBUDS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
