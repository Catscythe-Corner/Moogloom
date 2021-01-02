package com.catscythe.moogloom.client.renderer;

import com.catscythe.moogloom.common.entities.moogloom.MoogloomEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;

public class MoogloomEntityLayer<T extends MoogloomEntity> extends LayerRenderer<T, CowModel<T>> {

	public MoogloomEntityLayer(IEntityRenderer<T, CowModel<T>> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn,
			float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
			float headPitch) {
		
		
	}

}
