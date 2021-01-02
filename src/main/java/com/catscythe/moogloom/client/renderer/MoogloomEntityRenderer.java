package com.catscythe.moogloom.client.renderer;

import com.catscythe.moogloom.common.entities.moogloom.MoogloomEntity;
import com.catscythe.moogloom.core.Moogloom;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MoogloomEntityRenderer extends MobRenderer<MoogloomEntity, CowModel<MoogloomEntity>> {

	public MoogloomEntityRenderer(EntityRendererManager rendererManagerIn) {
		super(rendererManagerIn, new CowModel<MoogloomEntity>(), 0.7F);
	}
	
	@Override
	public ResourceLocation getEntityTexture(MoogloomEntity entity) {
		return new ResourceLocation(Moogloom.MOD_ID, "textures/entity/moogloom.png");
	}
}
