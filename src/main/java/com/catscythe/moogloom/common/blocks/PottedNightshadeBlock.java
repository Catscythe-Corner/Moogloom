package com.catscythe.moogloom.common.blocks;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.state.IntegerProperty;

public class PottedNightshadeBlock extends FlowerPotBlock {
	public static final IntegerProperty LIGHT_LEVEL = NightshadeBlock.LIGHT_LEVEL;
	
	public PottedNightshadeBlock(Supplier<FlowerPotBlock> emptyPot, Supplier<? extends Block> block,
			Properties properties) {
		super(emptyPot, block, properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(LIGHT_LEVEL, Integer.valueOf(1)));
	}

}
