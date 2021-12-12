
package net.mcreator.bubatzcraftforge.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CocainehaufenBlock extends Block {

	public CocainehaufenBlock() {
		super(BlockBehaviour.Properties.of(Material.TOP_SNOW).sound(SoundType.SNOW).strength(0f, 10f).noCollission().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));

		setRegistryName("cocainehaufen");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(BubatzcraftforgeModBlocks.COCAINEHAUFEN, renderType -> renderType == RenderType.cutoutMipped());
	}

}
