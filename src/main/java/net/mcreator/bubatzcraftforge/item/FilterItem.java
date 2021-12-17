
package net.mcreator.bubatzcraftforge.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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
