package com.Meelock.PlastiTech.items;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import com.Meelock.PlastiTech.PlastiTechReference;
import com.Meelock.PlastiTech.init.CreativeTabPlastiTech;
import com.Meelock.PlastiTech.init.ModItems;

import net.darkhax.tesla.api.ITeslaHolder;
import net.darkhax.tesla.api.implementation.BaseTeslaContainer;
import net.darkhax.tesla.api.implementation.BaseTeslaContainerProvider;
import net.darkhax.tesla.capability.TeslaCapabilities;
import net.darkhax.tesla.lib.TeslaUtils;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemRedstone;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.EnumHelper;

import static net.darkhax.tesla.capability.TeslaCapabilities.CAPABILITY_HOLDER;

/*
 * 
 *     disclaimer:
 *     THIS IS NOT MY CODE!
 * 
 * 
 *     I really need to use my own, but I'm a noob at coding so i used tesla essentials' code :/
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class ItemIncompleteMiningDrill extends ItemPickaxe {
	
	 public static final Item.ToolMaterial MININGDRILL_BASIC = EnumHelper.addToolMaterial("MININGDRILL_BASIC", 2, 2000, 20.0f, 8.0f, 0);
	public static final long drain = 50;
    private final Field itemDamage;

	public ItemIncompleteMiningDrill(PlastiTechReference.PlastiTechItems itemtype) {
		super(MININGDRILL_BASIC);
		setUnlocalizedName(itemtype.getUnlocalizedName());
		setRegistryName(itemtype.getRegistryName());
		setCreativeTab(CreativeTabPlastiTech.tabPlastiTech);
		Field f = null;
        try {
            f = ItemStack.class.getDeclaredField("itemDamage");
            f.setAccessible(true);
        } catch (NoSuchFieldException e) { }
        Field k = null;
        try{
            k = ItemTool.class.getDeclaredField("toolClass");
            k.setAccessible(true);
            k.set(this, "pickaxe");
        }catch(Exception e){}
        this.itemDamage = f;

	}
	
    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
        BaseTeslaContainer container = (BaseTeslaContainer) itemstack.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);
        if (container.getStoredPower() >= drain) {
            return false;
        } else {
            player.playSound(SoundEvents.ENTITY_WITHER_SHOOT, 0.1f, 10f);
            return true;
        }
    }

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {

		TeslaUtils.createTooltip(stack, tooltip);
	}

	@Override
	public ICapabilityProvider initCapabilities(final ItemStack stack, NBTTagCompound nbt) {
		return new BaseTeslaContainerProvider(new BaseTeslaContainer(2000, 20, 20){
            @Override
            public long givePower(long Tesla, boolean simulated) {
                setDamage(stack, 0);
                return super.givePower(Tesla, simulated);
            }

            @Override
            public long takePower(long Tesla, boolean simulated) {
                setDamage(stack, 0);
                return super.takePower(Tesla, simulated);
            }
        });
}
	
	@Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        BaseTeslaContainer container = (BaseTeslaContainer) stack.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);
        container.takePower(drain, false);
        return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }
	@Override
    public void setDamage(ItemStack stack, int damage) {
        ITeslaHolder h=stack.getCapability(CAPABILITY_HOLDER, EnumFacing.DOWN);
        // As stored power increases, dam tends towards the value getMaxDamage()
        int dam = h.getCapacity()>1?Math.round(h.getStoredPower()*(getMaxDamage()-1)/h.getCapacity()):1;
        try{ itemDamage.setInt(stack, getMaxDamage()-dam); }catch(Exception e){}
    }
	private ItemStack findAmmo(EntityPlayer player)
    {
        if (this.isRedstone(player.getHeldItem(EnumHand.OFF_HAND)))
        {
            return player.getHeldItem(EnumHand.OFF_HAND);
        }
        else if (this.isRedstone(player.getHeldItem(EnumHand.MAIN_HAND)))
        {
            return player.getHeldItem(EnumHand.MAIN_HAND);
        }
        else
        {
            for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
            {
                ItemStack itemstack = player.inventory.getStackInSlot(i);

                if (this.isRedstone(itemstack))
                {
                    return itemstack;
                }
            }

            return null;
        }
    }
	protected boolean isRedstone(@Nullable ItemStack stack)
    {
        return stack != null && stack.getItem() instanceof ItemRedstone;
    }
}
