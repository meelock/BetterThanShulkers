package com.Meelock.PlastiTech.items;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.PlastiTechReference.PlastiTechItems;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;

import net.darkhax.tesla.api.implementation.BaseTeslaContainer;
import net.darkhax.tesla.capability.TeslaCapabilities;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMiningDrill extends ItemPickaxe {
	public static final Item.ToolMaterial MININGDRILL_BASIC = EnumHelper.addToolMaterial("MININGDRILL_BASIC", 2, 2000,
			20.0f, 8.0f, 0);

	public ItemMiningDrill(PlastiTechReference.PlastiTechItems itemtype) {
		super(MININGDRILL_BASIC);
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
		setMaxDamage(2000);
	}

	@Override
	public void setDamage(ItemStack stack, int damage) {
		if (getDamage(stack) >= 1998) {
			super.setDamage(stack, 1998);
		}else{
			super.setDamage(stack, damage);
		}

	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
		if (getDamage(itemstack) < 1998) {
			return false;
		} else {
			player.playSound(SoundEvents.ENTITY_WITHER_SHOOT, 0.1f, 10f);
			return true;
		}
	}

}
