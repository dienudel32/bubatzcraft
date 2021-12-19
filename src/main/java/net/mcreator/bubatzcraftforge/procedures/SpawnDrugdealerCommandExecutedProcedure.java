package net.mcreator.bubatzcraftforge.procedures;

import net.minecraft.world.entity.Entity;

public class SpawnDrugdealerCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"/summon villager ~ ~1 ~ {VillagerData:{profession:armorer,level:2,type:plains},NoAI:1,CustomName:\"\\\"Drug Dealer\\\"\",Offers:{Recipes:[{buy:{id:gold_ingot,Count:3},sell:{id:\"bubatzcraftforge:joint\",Count:1},rewardExp:0b,maxUses:9999999},{buy:{id:gold_ingot,Count:5},sell:{id:\"bubatzcraftforge:heroin\",Count:1},rewardExp:0b,maxUses:9999999},{buy:{id:gold_ingot,Count:32},sell:{id:\"bubatzcraftforge:cocainehaufen\",Count:1},rewardExp:0b,maxUses:9999999},{buy:{id:gold_ingot,Count:21},sell:{id:\"bubatzcraftforge:cannabis_seeds\",Count:1},rewardExp:0b,maxUses:9999999},{buy:{id:gold_block,Count:25},sell:{id:\"bubatzcraftforge:coca_seeds\",Count:1},rewardExp:0b,maxUses:9999999}]}}");
		}
	}
}
