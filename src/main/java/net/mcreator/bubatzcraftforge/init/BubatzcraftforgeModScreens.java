
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.bubatzcraftforge.client.gui.FluidExtractorGUIScreen;
import net.mcreator.bubatzcraftforge.client.gui.ChemicalmixerGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BubatzcraftforgeModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BubatzcraftforgeModMenus.CHEMICALMIXER_GUI, ChemicalmixerGUIScreen::new);
			MenuScreens.register(BubatzcraftforgeModMenus.FLUID_EXTRACTOR_GUI, FluidExtractorGUIScreen::new);
		});
	}
}
