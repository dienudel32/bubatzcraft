
package net.mcreator.bubatzcraftforge.world.features.plants;

import com.mojang.serialization.Codec;

public class CannabisFeature extends RandomPatchFeature {
	public static final CannabisFeature FEATURE = (CannabisFeature) new CannabisFeature().setRegistryName("bubatzcraftforge:cannabis");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(BubatzcraftforgeModBlocks.CANNABIS.defaultBlockState()), new ColumnPlacer(BiasedToBottomInt.of(2, 4)))
							.tries(32).xspread(4).yspread(0).zspread(4).noProjection()

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP_SPREAD_DOUBLE.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared()

			.count(5);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("shattered_savanna"), new ResourceLocation("jungle_edge"),
			new ResourceLocation("savanna"), new ResourceLocation("jungle"));

	public CannabisFeature() {
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
