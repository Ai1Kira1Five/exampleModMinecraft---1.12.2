package com.akira.antispawnblock.proxy;

import com.akira.antispawnblock.blocks.AllBlocks;
import com.akira.antispawnblock.items.AllItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		for(Block block : AllBlocks.BLOCKS) {
			event.getRegistry().register(block);
		}
	}
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
		for(Item item : AllItems.ITEMS) {
			event.getRegistry().register(item);
		}
    }
	
	public void registerItemRenderer(Item item, int meta, String id) {}
}
