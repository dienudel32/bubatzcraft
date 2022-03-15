
package net.mcreator.bubatzcraftforge.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.mcreator.bubatzcraftforge.init.BubatzcraftforgeModBlocks;

import java.util.Set;
import java.util.List;

public class CocaFeature extends RandomPatchFeature {
	public static CocaFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new CocaFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("bubatzcraftforge:coca", FEATURE,
				FeatureUtils.simpleRandomPatchConfiguration(24,
						PlacementUtils.filtered(Feature.BLOCK_COLUMN,
								BlockColumnConfiguration.simple(BiasedToBottomInt.of(2, 4),
										BlockStateProvider.simple(BubatzcraftforgeModBlocks.COCA.get().defaultBlockState())),
								BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE,
										BlockPredicate.wouldSurvive(BubatzcraftforgeModBlocks.COCA.get().defaultBlockState(), BlockPos.ZERO)))));
		PLACED_FEATURE = PlacementUtils.register("bubatzcraftforge:coca", CONFIGURED_FEATURE, List.of(RarityFilter.onAverageOnceEvery(32),
				InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, CountPlacement.of(1)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("sparse_jungle"), new ResourceLocation("jungle"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public CocaFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
