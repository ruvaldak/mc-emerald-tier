package com.ruvaldak.renewabletools.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial {
    public static final EmeraldToolMaterial INSTANCE = new EmeraldToolMaterial();

    @Override
    public int getDurability() {
        return 2031; // same durability as netherrite
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6F; // same mining speed as iron
    }

    @Override
    public float getAttackDamage() {
        return 2F; // same damage as iron
    }

    @Override
    public int getMiningLevel() {
        return 2; // same harvest tier as iron
    }

    @Override
    public int getEnchantability() {
        return 14; // same enchantability as iron
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
