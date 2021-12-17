
package net.mcreator.bubatzcraftforge.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bubatzcraftforge.init.BubatzcraftforgeModTabs;

public class FilterItem extends Item {
	public FilterItem() {
		super(new Item.Properties().tab(BubatzcraftforgeModTabs.TAB_DRUGS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("filter");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
