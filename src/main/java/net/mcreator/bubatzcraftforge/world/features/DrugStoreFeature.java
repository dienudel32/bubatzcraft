
package net.mcreator.bubatzcraftforge.world.features;

public class DrugStoreFeature extends Feature<NoneFeatureConfiguration> {

	public static final DrugStoreFeature FEATURE = (DrugStoreFeature) new DrugStoreFeature().setRegistryName("bubatzcraftforge:drug_store");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE.configured(FeatureConfiguration.NONE);

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("savanna_plateau"),
			new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"),
			new ResourceLocation("dark_forest"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("taiga"),
			new ResourceLocation("savanna"), new ResourceLocation("plains"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"),
			new ResourceLocation("old_growth_spruce_taiga"));

	private StructureTemplate template = null;

	public DrugStoreFeature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		boolean dimensionCriteria = false;
		ResourceKey<Level> dimensionType = context.level().getLevel().dimension();
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("bubatzcraftforge", "drug_shop"));

		if (template == null)
			return false;

		if ((context.random().nextInt(1000000) + 1) <= 250) {
			boolean anyPlaced = false;
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);

				int j = context.level().getHeight(Heightmap.Types.WORLD_SURFACE_WG, i, k);
				j -= 1;

				BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 4);

				if (template.placeInWorld(
						context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE)
								.setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false),
						context.random(), 2)) {

					anyPlaced = true;
				}
			}

			return anyPlaced;
		}

		return false;
	}

}
