package com.minecraftmods.sheepiary.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SheepStation extends Block{

    public SheepStation(Material material) {
        super(Material.ground);
        setHardness(1f);
        setLightLevel(3);
        setCreativeTab(CreativeTabs.tabMisc);
        setStepSound(soundTypePiston);
        setBlockName("sheepstation");
        setHarvestLevel("pickaxe", 0);
        setBlockTextureName("sheepiary:BlockSheepstation");
    }
}
