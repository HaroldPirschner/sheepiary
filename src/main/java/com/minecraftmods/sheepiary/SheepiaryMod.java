package com.minecraftmods.sheepiary;

import com.minecraftmods.sheepiary.items.NewItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
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
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 2), new ItemStack(Blocks.dirt));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 2), new ItemStack(Blocks.cobblestone));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.apple, 2), new ItemStack(Blocks.gravel));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gravel), new ItemStack(Items.apple), new ItemStack(Items.apple));

        GameRegistry.addRecipe(new ItemStack(Blocks.stone, 2),
                "AB",
                "AB",
                'A',new ItemStack(Blocks.dirt), 'B', new ItemStack(Blocks.cobblestone));

        GameRegistry.addSmelting(new ItemStack(Items.apple), new ItemStack(Blocks.gravel), 1f);

        GameRegistry.registerItem(new NewItem(), "LOL item LOL");
    }
}