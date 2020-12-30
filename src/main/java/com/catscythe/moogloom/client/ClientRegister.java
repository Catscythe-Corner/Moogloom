package com.catscythe.moogloom.client;

import com.catscythe.moogloom.core.Moogloom;
import com.catscythe.moogloom.core.registry.MoogloomBlocks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = Moogloom.MOD_ID, bus = Bus.MOD)
public class ClientRegister {
	
	@SubscribeEvent
	public static void registerClient(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(MoogloomBlocks.NIGHTSHADE.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(MoogloomBlocks.POTTED_NIGHTSHADE.get(), RenderType.getCutout());
	}
	
}
