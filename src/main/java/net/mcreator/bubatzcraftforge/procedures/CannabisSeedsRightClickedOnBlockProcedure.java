package net.mcreator.bubatzcraftforge.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.bubatzcraftforge.init.BubatzcraftforgeModBlocks;

public class CannabisSeedsRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.COARSE_DIRT) {
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), BubatzcraftforgeModBlocks.CANNABIS.get().defaultBlockState(), 3);
				((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
			}
		}
	}
}
