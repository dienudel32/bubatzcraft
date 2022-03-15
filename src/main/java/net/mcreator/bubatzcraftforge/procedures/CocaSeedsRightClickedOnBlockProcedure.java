package net.mcreator.bubatzcraftforge.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CocaSeedsRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.PODZOL
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.ROOTED_DIRT
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.COARSE_DIRT
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.DIRT) {
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), BubatzcraftforgeModBlocks.COCA.get().defaultBlockState(), 3);
				((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
			}
		}
	}
}
