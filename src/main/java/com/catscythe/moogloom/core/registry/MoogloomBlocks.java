package com.catscythe.moogloom.core.registry;

import com.catscythe.moogloom.core.Moogloom;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsFlowerBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Moogloom.MOD_ID, bus = Bus.MOD)
public class MoogloomBlocks {

	public static final BlockSubRegistryHelper HELPER = Moogloom.REGISTRY_HELPER.getBlockSubHelper();
	
	public static final RegistryObject<Block> NIGHTSHADE = HELPER.createBlock("nightshade", () -> new AbnormalsFlowerBlock(MoogloomEffects.MIDNIGHT::get, 120, Block.Properties.from(Blocks.POPPY)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POTTED_NIGHTSHADE = HELPER.createBlockNoItem("potted_nightshade", () -> new FlowerPotBlock(NIGHTSHADE.get(), Block.Properties.from(Blocks.FLOWER_POT)));

}
