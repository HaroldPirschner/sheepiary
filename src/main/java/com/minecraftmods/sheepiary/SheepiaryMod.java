package com.minecraftmods.sheepiary;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.ItemStack;

@Mod(modid = SheepiaryMod.MODID, name = SheepiaryMod.MODNAME, version = SheepiaryMod.VERSION)
public class SheepiaryMod {
    public static final String MODID = "sheepiary";
    public static final String MODNAME = "Sheepiary";
    public static final String VERSION = "0.1";

    @Mod.Instance(value = SheepiaryMod.MODID) //Tell Forge what instance to use.
    public static SheepiaryMod instance;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.dirt));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt), new ItemStack(Blocks.cobblestone));
    }
}