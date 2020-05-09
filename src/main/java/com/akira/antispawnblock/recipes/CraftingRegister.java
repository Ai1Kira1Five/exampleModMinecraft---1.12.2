package com.akira.antispawnblock.recipes;

import com.akira.antispawnblock.AntiSpawnBlock;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class CraftingRegister {
	public static void register()
    {
        registerRecipes("key");
    }

    private static void registerRecipes(String name)
    {
        CraftingHelper.register(new ResourceLocation(AntiSpawnBlock.MODID, name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}
