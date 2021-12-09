
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

import net.mcreator.bubatzcraftforge.block.FreshWeedBudBlock;
import net.mcreator.bubatzcraftforge.block.DryedWeedBudBlock;
import net.mcreator.bubatzcraftforge.block.ChemicalmixerBlock;
import net.mcreator.bubatzcraftforge.block.CannabisBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BubatzcraftforgeModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CANNABIS = register(new CannabisBlock());
	public static final Block CHEMICALMIXER = register(new ChemicalmixerBlock());
	public static final Block FRESH_WEED_BUD = register(new FreshWeedBudBlock());
	public static final Block DRYED_WEED_BUD = register(new DryedWeedBudBlock());

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
		}
	}
}
