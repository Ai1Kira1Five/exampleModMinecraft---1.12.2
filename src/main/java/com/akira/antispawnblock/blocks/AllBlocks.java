package com.akira.antispawnblock.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AllBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// blocks
	public static final Block AntiBlock = new AntiBlock("antiblock", Material.IRON, SoundType.STONE, CreativeTabs.DECORATIONS, 5.0F, 15.0F, 0.0F, 2, "pickaxe");
}
