package com.catscythe.moogloom.common.entities.moogloom;

import javax.annotation.Nullable;

import com.catscythe.moogloom.core.registry.MoogloomEntities;
import com.catscythe.moogloom.core.registry.MoogloomItems;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IForgeShearable;

public class MoogloomEntity extends CowEntity implements IForgeShearable {

	public MoogloomEntity(EntityType<? extends MoogloomEntity> type, World worldIn) {
		super(type, worldIn);
	}

	@Override
	public MoogloomEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
		return MoogloomEntities.MOOGLOOM.get().create(world);
	}
	
	@Override
	public ItemStack getPickedResult(RayTraceResult target) {
		return new ItemStack(MoogloomItems.MOOGLOOM_SPAWN_EGG.get());
	}
	
	@Override
	public boolean isShearable(@Nullable ItemStack item, World world, BlockPos pos) {
		return !this.isChild();
	}
	
}
