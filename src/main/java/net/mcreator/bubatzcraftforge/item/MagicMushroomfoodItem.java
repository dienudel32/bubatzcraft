
package net.mcreator.bubatzcraftforge.item;

public class MagicMushroomfoodItem extends Item {

	public MagicMushroomfoodItem() {
		super(new Item.Properties().tab(BubatzcraftforgeModTabs.TAB_DRUGS).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

						.build()));
		setRegistryName("magic_mushroomfood");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("fly high"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);

		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MagicmushroomfoodFoodEatenProcedure.execute(world, entity);

		return retval;
	}

}
