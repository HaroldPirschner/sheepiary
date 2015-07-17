package com.minecraftmods.sheepiary.items;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NewItem extends Item {

    public NewItem() {
        setMaxStackSize(5);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("LeCamelCasedItem");
    }
}
