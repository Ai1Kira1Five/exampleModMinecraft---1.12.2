package com.akira.antispawnblock.blocks;

import com.akira.antispawnblock.AntiSpawnBlock;
import com.akira.antispawnblock.util.ModBlock;
import com.akira.antispawnblock.util.interfaces.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AntiBlock extends ModBlock implements IHasModel{

	public AntiBlock(String name, Material material, SoundType sound, 
					 CreativeTabs crTab, float hardness,
					 float resistance, float lightLevel,
					 int harvestLevel, String toolClass) {
		super(name, material, sound, 
			  crTab, hardness, resistance, 
			  lightLevel, harvestLevel, toolClass);
		
	}
	
	
	public void registerModels() {
		AntiSpawnBlock.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
