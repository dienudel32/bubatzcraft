
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BubatzcraftforgeModTabs {
	public static CreativeModeTab TAB_DRUGS;

	public static void load() {
		TAB_DRUGS = new CreativeModeTab("tabdrugs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BubatzcraftforgeModItems.JOINT);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
