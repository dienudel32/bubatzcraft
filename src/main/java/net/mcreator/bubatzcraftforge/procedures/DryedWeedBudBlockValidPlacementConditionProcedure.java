package net.mcreator.bubatzcraftforge.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DryedWeedBudBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR) {
			return false;
		}
		return true;
	}
}
