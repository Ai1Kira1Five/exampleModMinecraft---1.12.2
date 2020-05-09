package com.akira.antispawnblock.util;

import com.akira.antispawnblock.AntiSpawnBlock;
import com.akira.antispawnblock.items.AllItems;
import com.akira.antispawnblock.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItem extends Item implements IHasModel{

	public ModItem(String name) {
		this.setUnlocalizedName(AntiSpawnBlock.MODID + "."  + name);
    	this.setRegistryName(AntiSpawnBlock.MODID, name);
		
		AllItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		AntiSpawnBlock.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
