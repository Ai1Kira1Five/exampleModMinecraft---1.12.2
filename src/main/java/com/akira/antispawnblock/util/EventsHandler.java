package com.akira.antispawnblock.util;

import com.akira.antispawnblock.blocks.AllBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.SPacketCombatEvent.Event;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

@Mod.EventBusSubscriber
public class EventsHandler {    
	@SubscribeEvent
	public static void preventMobSpawn(LivingSpawnEvent.CheckSpawn event) {
		World world = event.getWorld();
	 	IBlockState blockState;
		Block block;
		
	 	if (!world.isRemote && event.getSpawner() == null) {
	 		ResourceLocation key = EntityList.getKey(event.getEntity());
	 		
	 		// get pos of block for check
	 		BlockPos mobPos = new BlockPos(event.getEntity());
	 		int x = mobPos.getX(), y = mobPos.getY() - 1, z = mobPos.getZ();
	        BlockPos myBlock = new BlockPos(x, y, z);
	        
	        blockState = world.getBlockState(myBlock);
	        block = blockState.getBlock();
	        
	 		boolean preventSpawn = block.isAssociatedBlock(AllBlocks.AntiBlock);
	 		if (preventSpawn) {
	 			event.setResult(Result.DENY);
	 		}
		}
	}
}
