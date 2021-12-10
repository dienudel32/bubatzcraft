
package net.mcreator.bubatzcraftforge.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.bubatzcraftforge.procedures.MagicmushroomClientDisplayRandomTickProcedure;
import net.mcreator.bubatzcraftforge.init.BubatzcraftforgeModBlocks;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class MagicmushroomBlock extends FlowerBlock {
	public MagicmushroomBlock() {
		super(MobEffects.CONFUSION, 100, BlockBehaviour.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS).instabreak()
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 2));
		setRegistryName("magicmushroom");
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
		return useContext.getItemInHand().getItem() != this.asItem();
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		MagicmushroomClientDisplayRandomTickProcedure.execute(

		);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(BubatzcraftforgeModBlocks.MAGICMUSHROOM, renderType -> renderType == RenderType.cutout());
	}
}
