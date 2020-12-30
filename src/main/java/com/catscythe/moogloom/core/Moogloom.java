package com.catscythe.moogloom.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.catscythe.moogloom.core.registry.MoogloomEntities;
import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;

import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moogloom")
public class Moogloom {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moogloom";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public static Moogloom instance;
    
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Moogloom() {
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;

        REGISTRY_HELPER.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	event.enqueueWork(() -> {
    		MoogloomEntities.registerAttributes();
    	});
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	MoogloomEntities.registerRendering();
    }
}
