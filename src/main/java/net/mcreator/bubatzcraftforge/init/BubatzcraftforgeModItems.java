
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
import net.mcreator.bubatzcraftforge.item.SyringeItem;
import net.mcreator.bubatzcraftforge.item.OpiumItem;
import net.mcreator.bubatzcraftforge.item.MagicMushroomfoodItem;
import net.mcreator.bubatzcraftforge.item.HeroineinjectionItem;
import net.mcreator.bubatzcraftforge.item.HeroinItem;
import net.mcreator.bubatzcraftforge.item.FilterItem;
import net.mcreator.bubatzcraftforge.item.BubatzItem;
import net.mcreator.bubatzcraftforge.item.AcetanhydridepowderItem;
import net.mcreator.bubatzcraftforge.item.AcetanhydrideItem;

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
	public static final Item FRESH_WEED_BUD = register(BubatzcraftforgeModBlocks.FRESH_WEED_BUD, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final Item DRIED_WEED_BUD = register(BubatzcraftforgeModBlocks.DRIED_WEED_BUD, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final Item FLUID_EXTRACTOR = register(BubatzcraftforgeModBlocks.FLUID_EXTRACTOR, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final Item OPIUM = register(new OpiumItem());
	public static final Item ACETANHYDRIDE = register(new AcetanhydrideItem());
	public static final Item ACETANHYDRIDEPOWDER = register(new AcetanhydridepowderItem());
	public static final Item ACETANHYDRIDEORE = register(BubatzcraftforgeModBlocks.ACETANHYDRIDEORE, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final Item HEROINEINJECTION = register(new HeroineinjectionItem());
	public static final Item HEROIN = register(new HeroinItem());
	public static final Item SYRINGE = register(new SyringeItem());
	public static final Item MAGICMUSHROOM = register(BubatzcraftforgeModBlocks.MAGICMUSHROOM, null);
	public static final Item MAGIC_MUSHROOMFOOD = register(new MagicMushroomfoodItem());
	public static final Item COCA = register(BubatzcraftforgeModBlocks.COCA, BubatzcraftforgeModTabs.TAB_DRUGS);

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
