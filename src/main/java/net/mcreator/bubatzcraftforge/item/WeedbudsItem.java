
package net.mcreator.bubatzcraftforge.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class WeedbudsItem extends Item {

	public WeedbudsItem() {
		super(new Item.Properties().tab(BubatzcraftforgeModTabs.TAB_DRUGS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("weedbuds");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
