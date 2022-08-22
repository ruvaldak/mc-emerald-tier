package com.chadsten.emeraldtier.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystToolMaterial implements ToolMaterial {
    public static final AmethystToolMaterial INSTANCE = new AmethystToolMaterial();

    @Override
    public int getDurability() {
        return 250; //same durability as iron
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12F; //same mining speed as gold
    }

    @Override
    public float getAttackDamage() {
        return 1F; //same damage as stone
    }

    @Override
    public int getMiningLevel() {
        return 1; //same harvest tier as stone
    }

    @Override
    public int getEnchantability() {
        return 22; //same enchantability as iron
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.AMETHYST_SHARD);
    }
}
