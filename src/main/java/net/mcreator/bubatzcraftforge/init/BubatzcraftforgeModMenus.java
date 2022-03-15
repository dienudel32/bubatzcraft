
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.bubatzcraftforge.world.inventory.FluidExtractorGUIMenu;
import net.mcreator.bubatzcraftforge.world.inventory.ChemicalmixerGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BubatzcraftforgeModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<ChemicalmixerGUIMenu> CHEMICALMIXER_GUI = register("chemicalmixer_gui",
			(id, inv, extraData) -> new ChemicalmixerGUIMenu(id, inv, extraData));
	public static final MenuType<FluidExtractorGUIMenu> FLUID_EXTRACTOR_GUI = register("fluid_extractor_gui",
			(id, inv, extraData) -> new FluidExtractorGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
