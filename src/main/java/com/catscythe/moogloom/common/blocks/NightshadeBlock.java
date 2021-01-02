package com.catscythe.moogloom.common.blocks;

import java.util.function.Supplier;

import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsFlowerBlock;

import net.minecraft.potion.Effect;
import net.minecraft.state.IntegerProperty;

public class NightshadeBlock extends AbnormalsFlowerBlock {
	public static final IntegerProperty LIGHT_LEVEL = IntegerProperty.create("light_level", 1, 5);

	public NightshadeBlock(Supplier<Effect> stewEffect, int stewEffectDuration, Properties properties) {
		super(stewEffect, stewEffectDuration, properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(LIGHT_LEVEL, Integer.valueOf(1)));
	}

}
