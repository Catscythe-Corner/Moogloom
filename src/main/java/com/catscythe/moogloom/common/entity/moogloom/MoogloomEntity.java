package com.catscythe.moogloom.common.entity.moogloom;

import com.catscythe.moogloom.core.registry.MoogloomEntities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class MoogloomEntity extends CowEntity {

	public MoogloomEntity(EntityType<? extends MoogloomEntity> type, World worldIn) {
		super(type, worldIn);
	}

	@Override
	public MoogloomEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
		return MoogloomEntities.MOOGLOOM.get().create(world);
	}
	
}
