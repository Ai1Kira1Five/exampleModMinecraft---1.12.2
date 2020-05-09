package com.akira.antispawnblock.util;

import com.akira.antispawnblock.AntiSpawnBlock;
import com.akira.antispawnblock.blocks.AllBlocks;
import com.akira.antispawnblock.items.AllItems;
import com.akira.antispawnblock.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModBlock extends Block implements IHasModel{
    private ItemStack customDrop = null;
    public String name;
    
    public ModBlock(String name, Material material, SoundType sound, 
    				 CreativeTabs crTab, float hardness, 
    				 float resistance, float lightLevel,
    				 int harvestLevel, String toolClass) {
    	super(material);
    	this.name = name;
    	this.setCreativeTab(crTab);
    	this.setUnlocalizedName(AntiSpawnBlock.MODID + "."  + name);
    	this.setRegistryName(AntiSpawnBlock.MODID, name);
    	this.setHardness(hardness);
    	this.setResistance(resistance);
    	this.setSoundType(sound);
    	this.setHarvestLevel(toolClass, harvestLevel);
    	this.setLightLevel(lightLevel);
    	
    	AllBlocks.BLOCKS.add(this);
    	AllItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

	@Override
	public void registerModels() {
		AntiSpawnBlock.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
