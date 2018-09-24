package com.MRTOBY12.læringspakkemod.items;

import com.MRTOBY12.læringspakkemod.Main;
import com.MRTOBY12.læringspakkemod.init.ModItems;
import com.MRTOBY12.læringspakkemod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{		
		Main.Proxy.registerItemRenderer(this, 0, "inventory");
	}

}
