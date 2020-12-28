package com.catscythe.moogloom.core.registry;

import com.catscythe.moogloom.core.Moogloom;
import com.minecraftabnormals.abnormals_core.common.potion.AbnormalsEffect;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Moogloom.MOD_ID, bus = Bus.MOD)
public class MoogloomEffects {

	public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Moogloom.MOD_ID);
	
	public static final RegistryObject<Effect> MIDNIGHT = EFFECTS.register("midnight", () -> new AbnormalsEffect(EffectType.BENEFICIAL, 0x7455CC));
	
}
