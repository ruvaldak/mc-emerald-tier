package com.ruvaldak.renewabletools.item;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.ArmorItem;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class AmethystArmorMaterial implements ArmorMaterial {
    public static final AmethystArmorMaterial INSTANCE = new AmethystArmorMaterial();

    private static final int durabilityMultiplier = 15;
    private static final int[] protectionAmounts = new int[] { 1, 3, 5, 2 };

    // Minecraft base durability values.
    private static final int[] BASE_DURABILITY = new int[] { 13, 15, 16, 11 };

    @Override
    public int getDurability(ArmorItem.Type slot) {
        return BASE_DURABILITY[slot.getEquipmentSlot().getEntitySlotId()] * durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type slot) {
        return protectionAmounts[slot.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.AMETHYST_SHARD);
    }

    @Override
    public String getName() {
        return "amethyst";
    }

    @Override
    public float getToughness() {
        return 0.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}
