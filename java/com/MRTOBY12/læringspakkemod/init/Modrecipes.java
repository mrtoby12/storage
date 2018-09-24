package com.MRTOBY12.læringspakkemod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Modrecipes {
	
	public static void init() { 
		GameRegistry.addSmelting(ModItems.WOODEN_INGOT, new ItemStack(ModBlocks.WOODEN_INGOT_BLOCK, 1), 1.5f);
	}

	}
