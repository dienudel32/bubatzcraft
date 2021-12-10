
package net.mcreator.bubatzcraftforge.world.features.ores;

public class AcetanhydrideoreFeature extends OreFeature {

	public static final AcetanhydrideoreFeature FEATURE = (AcetanhydrideoreFeature) new AcetanhydrideoreFeature()
			.setRegistryName("bubatzcraftforge:acetanhydrideore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(
					new OreConfiguration(AcetanhydrideoreFeatureRuleTest.INSTANCE, BubatzcraftforgeModBlocks.ACETANHYDRIDEORE.defaultBlockState(), 5))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(20)))).squared().count(3);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public AcetanhydrideoreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class AcetanhydrideoreFeatureRuleTest extends RuleTest {

		static final AcetanhydrideoreFeatureRuleTest INSTANCE = new AcetanhydrideoreFeatureRuleTest();
		static final com.mojang.serialization.Codec<AcetanhydrideoreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<AcetanhydrideoreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("bubatzcraftforge:acetanhydrideore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
