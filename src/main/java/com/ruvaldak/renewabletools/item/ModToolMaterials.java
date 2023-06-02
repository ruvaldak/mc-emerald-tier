package com.ruvaldak.renewabletools.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public enum ModToolMaterials implements ToolMaterial {
    // Emerald Material
    EMERALD(MiningLevels.IRON, 2031, 14, 6.0F, 2.0F, Items.EMERALD),
    AMETHYST(MiningLevels.STONE, 250, 22, 12.0F, 1.0F, Items.AMETHYST_SHARD),
    COPPER(MiningLevels.IRON, 131, 5, 6.0F, 2.0F, Items.COPPER_INGOT);

    private final int       miningLevel,
                            durability,
                            enchantability;
    private final float     miningSpeedMultiplier, 
                            attackDamage;
    private final Item      repairIngredient;

    private ModToolMaterials(int miningLevel, int durability, int enchantability, float miningSpeedMultiplier, float attackDamage, Item repairIngredient) {
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.enchantability = enchantability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel; // same harvest tier as iron
    }

    @Override
    public int getDurability() {
        return this.durability; // same durability as netherrite
    }

    @Override
    public int getEnchantability() {
        return this.enchantability; // same enchantability as iron
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier; // same mining speed as iron
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage; // same damage as iron
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(this.repairIngredient);
    }
}
