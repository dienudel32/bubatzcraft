
package net.mcreator.bubatzcraftforge.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.mcreator.bubatzcraftforge.init.BubatzcraftforgeModBlocks;

import java.util.Set;
import java.util.List;

public class MagicmushroomFeature extends RandomPatchFeature {
	public static MagicmushroomFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new MagicmushroomFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("bubatzcraftforge:magicmushroom", FEATURE,
				FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
						new SimpleBlockConfiguration(BlockStateProvider.simple(BubatzcraftforgeModBlocks.MAGICMUSHROOM.get().defaultBlockState())),
						List.of(), 16));
		PLACED_FEATURE = PlacementUtils.register("bubatzcraftforge:magicmushroom", CONFIGURED_FEATURE,
				List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(1)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("mushroom_fields"), new ResourceLocation("dark_forest"),
			new ResourceLocation("taiga"), new ResourceLocation("the_void"), new ResourceLocation("jungle"), new ResourceLocation("the_end"),
			new ResourceLocation("swamp"), new ResourceLocation("old_growth_spruce_taiga"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD, Level.END);

	public MagicmushroomFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
