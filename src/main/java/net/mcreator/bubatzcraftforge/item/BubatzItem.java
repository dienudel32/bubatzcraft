
package net.mcreator.bubatzcraftforge.item;

public class BubatzItem extends Item {

	public BubatzItem() {
		super(new Item.Properties().tab(BubatzcraftforgeModTabs.TAB_DRUGS).stacksTo(16).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(-6).saturationMod(0f).alwaysEat()

						.build()));
		setRegistryName("joint");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 60;
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("420"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);

		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BubatzFoodEatenProcedure.execute(world, x, y, z, entity);

		return retval;
	}

}
