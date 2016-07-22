package com.Meelock.PlastiTech.blocks;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGeneric extends Block {
	
	public BlockGeneric(PlastiTechReference.PlastiTechBlocks blocktype) {
		super(Material.IRON);
		setUnlocalizedName(blocktype.getUnlocalizedName());
		setRegistryName(blocktype.getRegistryName());
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
	}

}
