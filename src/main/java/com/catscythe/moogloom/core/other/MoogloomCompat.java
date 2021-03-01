package com.catscythe.moogloom.core.other;

import com.catscythe.moogloom.core.registry.MoogloomBlocks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class MoogloomCompat {
	
	public static void registerBlockRenderers() {
		RenderTypeLookup.setRenderLayer(MoogloomBlocks.NIGHTSHADE.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(MoogloomBlocks.POTTED_NIGHTSHADE.get(), RenderType.getCutout());
	}

}
