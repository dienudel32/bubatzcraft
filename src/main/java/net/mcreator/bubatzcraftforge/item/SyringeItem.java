
package net.mcreator.bubatzcraftforge.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SyringeItem extends Item {

	public SyringeItem() {
		super(new Item.Properties().tab(BubatzcraftforgeModTabs.TAB_DRUGS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("syringe");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Fluids can be injected"));
	}

}
