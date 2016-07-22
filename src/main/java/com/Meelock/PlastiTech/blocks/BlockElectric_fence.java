package com.Meelock.PlastiTech.blocks;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockElectric_fence extends BlockFence {

	public BlockElectric_fence(Material mat, MapColor map, PlastiTechReference.PlastiTechBlocks blocktype) {
		super(mat, map);
		this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false))
				.withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false))
				.withProperty(WEST, Boolean.valueOf(false)));
		this.setCreativeTab(CreativeTabs.DECORATIONS);

		setUnlocalizedName(blocktype.getUnlocalizedName());
		setRegistryName(blocktype.getRegistryName());
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
		
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		entityIn.attackEntityFrom(DamageSource.onFire, 1f);
	}

}
