
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bubatzcraftforge.item.WeedbudsItem;
import net.mcreator.bubatzcraftforge.item.SyringeItem;
import net.mcreator.bubatzcraftforge.item.RazorbladeItem;
import net.mcreator.bubatzcraftforge.item.OpiumItem;
import net.mcreator.bubatzcraftforge.item.MagicMushroomfoodItem;
import net.mcreator.bubatzcraftforge.item.HeroineinjectionItem;
import net.mcreator.bubatzcraftforge.item.HeroinItem;
import net.mcreator.bubatzcraftforge.item.FilterItem;
import net.mcreator.bubatzcraftforge.item.CocaleafsItem;
import net.mcreator.bubatzcraftforge.item.CocaextractItem;
import net.mcreator.bubatzcraftforge.item.CocaSeedsItem;
import net.mcreator.bubatzcraftforge.item.CannabisSeedsItem;
import net.mcreator.bubatzcraftforge.item.BubatzItem;
import net.mcreator.bubatzcraftforge.item.AcetanhydridepowderItem;
import net.mcreator.bubatzcraftforge.item.AcetanhydrideItem;
import net.mcreator.bubatzcraftforge.BubatzcraftforgeMod;

public class BubatzcraftforgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BubatzcraftforgeMod.MODID);
	public static final RegistryObject<Item> JOINT = REGISTRY.register("joint", () -> new BubatzItem());
	public static final RegistryObject<Item> CANNABIS = block(BubatzcraftforgeModBlocks.CANNABIS, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> FILTER = REGISTRY.register("filter", () -> new FilterItem());
	public static final RegistryObject<Item> WEEDBUDS = REGISTRY.register("weedbuds", () -> new WeedbudsItem());
	public static final RegistryObject<Item> CHEMICALMIXER = block(BubatzcraftforgeModBlocks.CHEMICALMIXER, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> FRESH_WEED_BUD = block(BubatzcraftforgeModBlocks.FRESH_WEED_BUD, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> DRIED_WEED_BUD = block(BubatzcraftforgeModBlocks.DRIED_WEED_BUD, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> FLUID_EXTRACTOR = block(BubatzcraftforgeModBlocks.FLUID_EXTRACTOR, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> OPIUM = REGISTRY.register("opium", () -> new OpiumItem());
	public static final RegistryObject<Item> ACETANHYDRIDE = REGISTRY.register("acetanhydride", () -> new AcetanhydrideItem());
	public static final RegistryObject<Item> ACETANHYDRIDEPOWDER = REGISTRY.register("acetanhydridepowder", () -> new AcetanhydridepowderItem());
	public static final RegistryObject<Item> ACETANHYDRIDEORE = block(BubatzcraftforgeModBlocks.ACETANHYDRIDEORE, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> HEROINEINJECTION = REGISTRY.register("heroineinjection", () -> new HeroineinjectionItem());
	public static final RegistryObject<Item> HEROIN = REGISTRY.register("heroin", () -> new HeroinItem());
	public static final RegistryObject<Item> SYRINGE = REGISTRY.register("syringe", () -> new SyringeItem());
	public static final RegistryObject<Item> MAGICMUSHROOM = block(BubatzcraftforgeModBlocks.MAGICMUSHROOM, null);
	public static final RegistryObject<Item> MAGIC_MUSHROOMFOOD = REGISTRY.register("magic_mushroomfood", () -> new MagicMushroomfoodItem());
	public static final RegistryObject<Item> COCA = block(BubatzcraftforgeModBlocks.COCA, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> COCAINELINE = block(BubatzcraftforgeModBlocks.COCAINELINE, null);
	public static final RegistryObject<Item> COCAINEHAUFEN = block(BubatzcraftforgeModBlocks.COCAINEHAUFEN, BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> RAZORBLADE = REGISTRY.register("razorblade", () -> new RazorbladeItem());
	public static final RegistryObject<Item> COCALEAFS = REGISTRY.register("cocaleafs", () -> new CocaleafsItem());
	public static final RegistryObject<Item> BUNDLED_COCA_LEAFS = block(BubatzcraftforgeModBlocks.BUNDLED_COCA_LEAFS,
			BubatzcraftforgeModTabs.TAB_DRUGS);
	public static final RegistryObject<Item> COCA_SEEDS = REGISTRY.register("coca_seeds", () -> new CocaSeedsItem());
	public static final RegistryObject<Item> COCAEXTRACT = REGISTRY.register("cocaextract", () -> new CocaextractItem());
	public static final RegistryObject<Item> CANNABIS_SEEDS = REGISTRY.register("cannabis_seeds", () -> new CannabisSeedsItem());
	public static final RegistryObject<Item> BONG = block(BubatzcraftforgeModBlocks.BONG, BubatzcraftforgeModTabs.TAB_DRUGS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
