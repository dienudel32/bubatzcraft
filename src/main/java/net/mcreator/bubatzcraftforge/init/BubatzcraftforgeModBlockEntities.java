
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.bubatzcraftforge.block.entity.FluidExtractorBlockEntity;
import net.mcreator.bubatzcraftforge.block.entity.ChemicalmixerBlockEntity;
import net.mcreator.bubatzcraftforge.block.entity.BongBlockEntity;
import net.mcreator.bubatzcraftforge.BubatzcraftforgeMod;

public class BubatzcraftforgeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			BubatzcraftforgeMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CHEMICALMIXER = register("chemicalmixer", BubatzcraftforgeModBlocks.CHEMICALMIXER,
			ChemicalmixerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FLUID_EXTRACTOR = register("fluid_extractor", BubatzcraftforgeModBlocks.FLUID_EXTRACTOR,
			FluidExtractorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BONG = register("bong", BubatzcraftforgeModBlocks.BONG, BongBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
