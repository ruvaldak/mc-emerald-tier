package com.ruvaldak.renewabletools.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {
    public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();

    @Override
    public int getDurability() {
        return 131; // same durability as netherrite
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6; // same mining speed as iron
    }

    @Override
    public float getAttackDamage() {
        return 2; // same damage as iron
    }

    @Override
    public int getMiningLevel() {
        return 2; // same harvest tier as iron
    }

    @Override
    public int getEnchantability() {
        return 5; // same enchantability as iron
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }
}
