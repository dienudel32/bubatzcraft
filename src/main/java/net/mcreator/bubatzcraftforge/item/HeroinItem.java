
package net.mcreator.bubatzcraftforge.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class HeroinItem extends Item {

	public HeroinItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("heroin");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Can be used with a syringe"));
	}

}
