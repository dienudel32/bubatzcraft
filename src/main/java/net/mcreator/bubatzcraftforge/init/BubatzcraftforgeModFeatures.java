
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.bubatzcraftforge.world.features.plants.MagicmushroomFeature;
import net.mcreator.bubatzcraftforge.world.features.plants.CocaFeature;
import net.mcreator.bubatzcraftforge.world.features.plants.CannabisFeature;
import net.mcreator.bubatzcraftforge.world.features.ores.AcetanhydrideoreFeature;
import net.mcreator.bubatzcraftforge.world.features.DrugStoreFeature;
import net.mcreator.bubatzcraftforge.BubatzcraftforgeMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class BubatzcraftforgeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BubatzcraftforgeMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CANNABIS = register("cannabis", CannabisFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CannabisFeature.GENERATE_BIOMES, CannabisFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ACETANHYDRIDEORE = register("acetanhydrideore", AcetanhydrideoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AcetanhydrideoreFeature.GENERATE_BIOMES,
					AcetanhydrideoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGICMUSHROOM = register("magicmushroom", MagicmushroomFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, MagicmushroomFeature.GENERATE_BIOMES, MagicmushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COCA = register("coca", CocaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CocaFeature.GENERATE_BIOMES, CocaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DRUG_STORE = register("drug_store", DrugStoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, DrugStoreFeature.GENERATE_BIOMES, DrugStoreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
