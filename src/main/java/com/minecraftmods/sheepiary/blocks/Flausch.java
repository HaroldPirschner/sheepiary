package com.minecraftmods.sheepiary.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Flausch extends Block {

    public Flausch(Material material) {
        super(Material.cloth);
        setHardness(0.5f);
        setLightLevel(1);
        setCreativeTab(CreativeTabs.tabMisc);
        setStepSound(soundTypeCloth);
        setBlockName("flausch");
        setHarvestLevel("pickaxe", 0);
        setBlockTextureName("sheepiary:BlockFlausch");
    }
}
