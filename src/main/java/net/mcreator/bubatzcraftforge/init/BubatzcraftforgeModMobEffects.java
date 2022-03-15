
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.bubatzcraftforge.potion.WeedtripMobEffect;
import net.mcreator.bubatzcraftforge.potion.MagicmushroomtrioMobEffect;
import net.mcreator.bubatzcraftforge.BubatzcraftforgeMod;

public class BubatzcraftforgeModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BubatzcraftforgeMod.MODID);
	public static final RegistryObject<MobEffect> WEEDTRIP = REGISTRY.register("weedtrip", () -> new WeedtripMobEffect());
	public static final RegistryObject<MobEffect> MAGICMUSHROOMTRIP = REGISTRY.register("magicmushroomtrip", () -> new MagicmushroomtrioMobEffect());
}
