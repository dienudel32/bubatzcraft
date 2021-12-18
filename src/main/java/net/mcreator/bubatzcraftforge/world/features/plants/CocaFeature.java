
package net.mcreator.bubatzcraftforge.world.features.plants;

import com.mojang.serialization.Codec;

public class CocaFeature extends RandomPatchFeature {
	public static final CocaFeature FEATURE = (CocaFeature) new CocaFeature().setRegistryName("bubatzcraftforge:coca");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(BubatzcraftforgeModBlocks.COCA.defaultBlockState()), new ColumnPlacer(BiasedToBottomInt.of(2, 4)))
							.tries(24).xspread(4).yspread(0).zspread(4).noProjection()

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP_SPREAD_DOUBLE.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared()

			.count(1);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("jungle_edge"), new ResourceLocation("jungle_hills"),
			new ResourceLocation("jungle"));

	public CocaFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}
}
