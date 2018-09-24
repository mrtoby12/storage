package com.MRTOBY12.læringspakkemod.init;

import java.util.ArrayList;
import java.util.List;

import com.MRTOBY12.læringspakkemod.blocks.WoodenIngotBlock;
import com.MRTOBY12.læringspakkemod.blocks.woodenboks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block WOODEN_INGOT_BLOCK = new WoodenIngotBlock("wooden_ingot_block", Material.WOOD);
    public static final Block WOODEN_BOKS_BLOCK = new woodenboks("wooden_boks", Material.WOOD);
}
