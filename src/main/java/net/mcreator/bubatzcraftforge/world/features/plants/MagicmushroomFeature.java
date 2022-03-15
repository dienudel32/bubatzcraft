
package net.mcreator.bubatzcraftforge.world.features.plants;

import com.mojang.serialization.Codec;

public class MagicmushroomFeature extends DefaultFlowerFeature {
	public static final MagicmushroomFeature FEATURE = (MagicmushroomFeature) new MagicmushroomFeature()
			.setRegistryName("bubatzcraftforge:magicmushroom");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(BubatzcraftforgeModBlocks.MAGICMUSHROOM.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(16)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(1);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("mushroom_fields"), new ResourceLocation("dark_forest"),
			new ResourceLocation("taiga"), new ResourceLocation("the_void"), new ResourceLocation("jungle"), new ResourceLocation("the_end"),
			new ResourceLocation("swamp"), new ResourceLocation("old_growth_spruce_taiga"));

	public MagicmushroomFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (dimensionType == Level.END)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}
}
