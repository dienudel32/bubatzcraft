
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.bubatzcraftforge.block.MagicmushroomBlock;
import net.mcreator.bubatzcraftforge.block.FreshWeedBudBlock;
import net.mcreator.bubatzcraftforge.block.FluidExtractorBlock;
import net.mcreator.bubatzcraftforge.block.DryedWeedBudBlock;
import net.mcreator.bubatzcraftforge.block.CocainelineBlock;
import net.mcreator.bubatzcraftforge.block.CocainehaufenBlock;
import net.mcreator.bubatzcraftforge.block.CocaBlock;
import net.mcreator.bubatzcraftforge.block.ChemicalmixerBlock;
import net.mcreator.bubatzcraftforge.block.CannabisBlock;
import net.mcreator.bubatzcraftforge.block.BundledCocaLeafsBlock;
import net.mcreator.bubatzcraftforge.block.BongBlock;
import net.mcreator.bubatzcraftforge.block.AcetanhydrideoreBlock;
import net.mcreator.bubatzcraftforge.BubatzcraftforgeMod;

public class BubatzcraftforgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BubatzcraftforgeMod.MODID);
	public static final RegistryObject<Block> CANNABIS = REGISTRY.register("cannabis", () -> new CannabisBlock());
	public static final RegistryObject<Block> CHEMICALMIXER = REGISTRY.register("chemicalmixer", () -> new ChemicalmixerBlock());
	public static final RegistryObject<Block> FRESH_WEED_BUD = REGISTRY.register("fresh_weed_bud", () -> new FreshWeedBudBlock());
	public static final RegistryObject<Block> DRIED_WEED_BUD = REGISTRY.register("dried_weed_bud", () -> new DryedWeedBudBlock());
	public static final RegistryObject<Block> FLUID_EXTRACTOR = REGISTRY.register("fluid_extractor", () -> new FluidExtractorBlock());
	public static final RegistryObject<Block> ACETANHYDRIDEORE = REGISTRY.register("acetanhydrideore", () -> new AcetanhydrideoreBlock());
	public static final RegistryObject<Block> MAGICMUSHROOM = REGISTRY.register("magicmushroom", () -> new MagicmushroomBlock());
	public static final RegistryObject<Block> COCA = REGISTRY.register("coca", () -> new CocaBlock());
	public static final RegistryObject<Block> COCAINELINE = REGISTRY.register("cocaineline", () -> new CocainelineBlock());
	public static final RegistryObject<Block> COCAINEHAUFEN = REGISTRY.register("cocainehaufen", () -> new CocainehaufenBlock());
	public static final RegistryObject<Block> BUNDLED_COCA_LEAFS = REGISTRY.register("bundled_coca_leafs", () -> new BundledCocaLeafsBlock());
	public static final RegistryObject<Block> BONG = REGISTRY.register("bong", () -> new BongBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CannabisBlock.registerRenderLayer();
			ChemicalmixerBlock.registerRenderLayer();
			FreshWeedBudBlock.registerRenderLayer();
			DryedWeedBudBlock.registerRenderLayer();
			FluidExtractorBlock.registerRenderLayer();
			MagicmushroomBlock.registerRenderLayer();
			CocaBlock.registerRenderLayer();
			CocainelineBlock.registerRenderLayer();
			CocainehaufenBlock.registerRenderLayer();
			BongBlock.registerRenderLayer();
		}
	}
}
