
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BubatzcraftforgeModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CANNABIS = register(new CannabisBlock());
	public static final Block CHEMICALMIXER = register(new ChemicalmixerBlock());
	public static final Block FRESH_WEED_BUD = register(new FreshWeedBudBlock());
	public static final Block DRIED_WEED_BUD = register(new DryedWeedBudBlock());
	public static final Block FLUID_EXTRACTOR = register(new FluidExtractorBlock());
	public static final Block ACETANHYDRIDEORE = register(new AcetanhydrideoreBlock());
	public static final Block MAGICMUSHROOM = register(new MagicmushroomBlock());
	public static final Block COCA = register(new CocaBlock());
	public static final Block COCAINELINE = register(new CocainelineBlock());
	public static final Block COCAINEHAUFEN = register(new CocainehaufenBlock());
	public static final Block BUNDLED_COCA_LEAFS = register(new BundledCocaLeafsBlock());
	public static final Block BONG = register(new BongBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

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
