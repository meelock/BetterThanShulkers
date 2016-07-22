package com.Meelock.PlastiTech.blocks;

import com.Meelock.PlastiTech.PlastiTechReference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGeneric extends Block {

	public BlockGeneric(PlastiTechReference.PlastiTechBlocks blocktype) {
		super(Material.IRON);
		setUnlocalizedName(blocktype.getUnlocalizedName());
		setRegistryName(blocktype.getRegistryName());
	}

}
