
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.bubatzcraftforge.world.features.plants.MagicmushroomFeature;
import net.mcreator.bubatzcraftforge.world.features.plants.CocaFeature;
import net.mcreator.bubatzcraftforge.world.features.plants.CannabisFeature;
import net.mcreator.bubatzcraftforge.world.features.ores.AcetanhydrideoreFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BubatzcraftforgeModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(CannabisFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CannabisFeature.GENERATE_BIOMES,
				CannabisFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AcetanhydrideoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AcetanhydrideoreFeature.GENERATE_BIOMES, AcetanhydrideoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagicmushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MagicmushroomFeature.GENERATE_BIOMES, MagicmushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CocaFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CocaFeature.GENERATE_BIOMES, CocaFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
