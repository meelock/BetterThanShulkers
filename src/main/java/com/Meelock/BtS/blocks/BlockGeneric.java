package com.Meelock.BtS.blocks;

import com.Meelock.BtS.BtSReference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGeneric extends Block {

	public BlockGeneric(BtSReference.BtSBlocks blocktype) {
		super(Material.IRON);
		setUnlocalizedName(blocktype.getUnlocalizedName());
		setRegistryName(blocktype.getRegistryName());
	}

}
