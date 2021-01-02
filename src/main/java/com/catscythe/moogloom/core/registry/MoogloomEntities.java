package com.catscythe.moogloom.core.registry;

import com.catscythe.moogloom.client.renderer.MoogloomEntityRenderer;
import com.catscythe.moogloom.common.entities.moogloom.MoogloomEntity;
import com.catscythe.moogloom.core.Moogloom;
import com.minecraftabnormals.abnormals_core.core.util.registry.EntitySubRegistryHelper;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Moogloom.MOD_ID, bus = Bus.MOD)
public class MoogloomEntities {

	public static final EntitySubRegistryHelper HELPER = Moogloom.REGISTRY_HELPER.getEntitySubHelper();
	
	public static final RegistryObject<EntityType<MoogloomEntity>> MOOGLOOM = HELPER.createLivingEntity("moogloom", MoogloomEntity::new, EntityClassification.CREATURE, 0.9f, 1.3f);
	
	public static void registerRendering() {
		RenderingRegistry.registerEntityRenderingHandler(MOOGLOOM.get(), MoogloomEntityRenderer::new);
	}
	
	public static void registerAttributes() {
		GlobalEntityTypeAttributes.put(MOOGLOOM.get(), MoogloomEntity.func_234188_eI_().create());
	}
}
