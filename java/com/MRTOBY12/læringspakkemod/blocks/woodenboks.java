package com.MRTOBY12.læringspakkemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class woodenboks extends BlockBase
{
	
	public woodenboks(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 2);
		//setLightLevel(0.0F);
		//setLightOpacity(0.0F);
		//setBlockUnbreakable();
	}
}
