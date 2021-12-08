
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bubatzcraftforge.item.WeedbudsItem;
import net.mcreator.bubatzcraftforge.item.FilterItem;
import net.mcreator.bubatzcraftforge.item.BubatzItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BubatzcraftforgeModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item JOINT = register(new BubatzItem());
	public static final Item CANNABIS = register(BubatzcraftforgeModBlocks.CANNABIS, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final Item FILTER = register(new FilterItem());
	public static final Item WEEDBUDS = register(new WeedbudsItem());
	public static final Item CHEMICALMIXER = register(BubatzcraftforgeModBlocks.CHEMICALMIXER, BubatzcraftforgeModTabs.TAB_DRUGS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
