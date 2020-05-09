package com.akira.antispawnblock;

import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

import org.apache.logging.log4j.Logger;

import com.akira.antispawnblock.proxy.CommonProxy;
import com.akira.antispawnblock.util.EventsHandler;
import com.akira.antispawnblock.util.Reference;

@Mod(modid = AntiSpawnBlock.MODID, name = AntiSpawnBlock.NAME, version = AntiSpawnBlock.VERSION)
public class AntiSpawnBlock
{
    public static final String MODID = "antispawnblock";
    public static final String NAME = "Anti Mob-spawn block";
    public static final String VERSION = "0.0.1-alpha";

    public static Logger logger;
    
    @Instance
    public static AntiSpawnBlock instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//MinecraftForge.EVENT_BUS.register(this);
    	
    }
    
   
}
