package com.minecraftmods.sheepiary;

import com.minecraftmods.sheepiary.blocks.Flausch;
import com.minecraftmods.sheepiary.blocks.SheepStation;
import com.minecraftmods.sheepiary.items.Sheepalyzer;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = SheepiaryMod.MODID, name = SheepiaryMod.MODNAME, version = SheepiaryMod.VERSION)
public class SheepiaryMod {
    public static final String MODID = "sheepiary";
    public static final String MODNAME = "Sheepiary";
    public static final String VERSION = "0.1";

    @Mod.Instance(value = SheepiaryMod.MODID) //Tell Forge what instance to use.
    public static SheepiaryMod instance;

    public final static Item sheepalyzer = new Sheepalyzer();
    public final static Block sheepstation = new SheepStation(null);
    public final static Block flauschblock = new Flausch(null);

    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent) {
        GameRegistry.registerItem(sheepalyzer, "sheepalyzer");
        GameRegistry.registerBlock(sheepstation, "sheepstation");
        GameRegistry.registerBlock(flauschblock, "flausch");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new ItemStack(Blocks.dirt));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 2), new ItemStack(Blocks.cobblestone));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.apple, 2), new ItemStack(Blocks.gravel));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gravel), new ItemStack(Items.apple), new ItemStack(Items.apple));

        GameRegistry.addRecipe(new ItemStack(Blocks.stone, 2),
                "AB",
                "AB",
                'A',new ItemStack(Blocks.dirt), 'B', new ItemStack(Blocks.cobblestone));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.apple), new ItemStack(sheepalyzer));
        GameRegistry.addShapelessRecipe(new ItemStack(sheepalyzer), new ItemStack(Items.apple));

        GameRegistry.addSmelting(new ItemStack(Items.apple), new ItemStack(Blocks.gravel), 1f);
    }
}