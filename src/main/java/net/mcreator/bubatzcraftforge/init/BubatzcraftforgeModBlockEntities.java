
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubatzcraftforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.bubatzcraftforge.block.entity.FluidExtractorBlockEntity;
import net.mcreator.bubatzcraftforge.block.entity.ChemicalmixerBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BubatzcraftforgeModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> CHEMICALMIXER = register("bubatzcraftforge:chemicalmixer", BubatzcraftforgeModBlocks.CHEMICALMIXER,
			ChemicalmixerBlockEntity::new);
	public static final BlockEntityType<?> FLUID_EXTRACTOR = register("bubatzcraftforge:fluid_extractor", BubatzcraftforgeModBlocks.FLUID_EXTRACTOR,
			FluidExtractorBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
