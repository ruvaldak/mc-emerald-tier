package com.ruvaldak.renewabletools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.loot.LootTables;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ruvaldak.renewabletools.item.*;

public class RenewableTools implements ModInitializer {
        // This logger is used to write text to the console and the log file.
        // It is considered best practice to use your mod id as the logger's name.
        // That way, it's clear which mod wrote info, warnings, and errors.
        public static final Logger LOGGER = LoggerFactory.getLogger("renewabletools");

        // Emerald
        public static final SwordItem EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 3, -2.4F,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ShovelItem EMERALD_SHOVEL = new ShovelItem(EmeraldToolMaterial.INSTANCE, 1.5F, -3.0F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final EmeraldPickaxeItem EMERALD_PICKAXE = new EmeraldPickaxeItem(EmeraldToolMaterial.INSTANCE, 1,
                        -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final EmeraldAxeItem EMERALD_AXE = new EmeraldAxeItem(EmeraldToolMaterial.INSTANCE, 6F, -3.1F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final EmeraldHoeItem EMERALD_HOE = new EmeraldHoeItem(EmeraldToolMaterial.INSTANCE, -2, -1F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));

        public static final ArmorItem EMERALD_HELMET = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.HEAD,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem EMERALD_CHESTPLATE = new ArmorItem(EmeraldArmorMaterial.INSTANCE,
                        EquipmentSlot.CHEST,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem EMERALD_LEGGINGS = new ArmorItem(EmeraldArmorMaterial.INSTANCE,
                        EquipmentSlot.LEGS,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem EMERALD_BOOTS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.FEET,
                        new FabricItemSettings().group(ItemGroup.COMBAT));

        // Amethyst
        public static final SwordItem AMETHYST_SWORD = new SwordItem(AmethystToolMaterial.INSTANCE, 3, -2.4F,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ShovelItem AMETHYST_SHOVEL = new ShovelItem(AmethystToolMaterial.INSTANCE, 1.5F, -3.0F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final AmethystPickaxeItem AMETHYST_PICKAXE = new AmethystPickaxeItem(
                        AmethystToolMaterial.INSTANCE, 1,
                        -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final AmethystAxeItem AMETHYST_AXE = new AmethystAxeItem(AmethystToolMaterial.INSTANCE, 7F, -3.2F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final AmethystHoeItem AMETHYST_HOE = new AmethystHoeItem(AmethystToolMaterial.INSTANCE, -1, -2F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));

        public static final ArmorItem AMETHYST_HELMET = new ArmorItem(AmethystArmorMaterial.INSTANCE,
                        EquipmentSlot.HEAD,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem AMETHYST_CHESTPLATE = new ArmorItem(AmethystArmorMaterial.INSTANCE,
                        EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem AMETHYST_LEGGINGS = new ArmorItem(AmethystArmorMaterial.INSTANCE,
                        EquipmentSlot.LEGS,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem AMETHYST_BOOTS = new ArmorItem(AmethystArmorMaterial.INSTANCE, EquipmentSlot.FEET,
                        new FabricItemSettings().group(ItemGroup.COMBAT));

        // Copper
        public static final SwordItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4F,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ShovelItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 1.5F, -3.0F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final CopperPickaxeItem COPPER_PICKAXE = new CopperPickaxeItem(CopperToolMaterial.INSTANCE, 1,
                        -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final CopperAxeItem COPPER_AXE = new CopperAxeItem(CopperToolMaterial.INSTANCE, 6F, -3.1F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));
        public static final CopperHoeItem COPPER_HOE = new CopperHoeItem(CopperToolMaterial.INSTANCE, -2, -1F,
                        new FabricItemSettings().group(ItemGroup.TOOLS));

        public static final ArmorItem COPPER_HELMET = new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentSlot.HEAD,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem COPPER_CHESTPLATE = new ArmorItem(CopperArmorMaterial.INSTANCE,
                        EquipmentSlot.CHEST,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem COPPER_LEGGINGS = new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentSlot.LEGS,
                        new FabricItemSettings().group(ItemGroup.COMBAT));
        public static final ArmorItem COPPER_BOOTS = new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentSlot.FEET,
                        new FabricItemSettings().group(ItemGroup.COMBAT));

        public static final LootTableItem[] LOOT_TABLE = {
                        new LootTableItem(LootTables.SIMPLE_DUNGEON_CHEST, 2),
                        new LootTableItem(LootTables.DESERT_PYRAMID_CHEST, 3),
                        new LootTableItem(LootTables.END_CITY_TREASURE_CHEST, 1),
                        new LootTableItem(LootTables.JUNGLE_TEMPLE_CHEST, 1),
                        new LootTableItem(LootTables.NETHER_BRIDGE_CHEST, 2),
                        new LootTableItem(LootTables.STRONGHOLD_CORRIDOR_CHEST, 1)
                        // village weaponsmith's chests are excluded to provide balance via increased
                        // rarity
        };

        @Override
        public void onInitialize() {
                // This code runs as soon as Minecraft is in a mod-load-ready state.
                // However, some things (like resources) may still be uninitialized.
                // Proceed with mild caution.

                LOGGER.info("[Renewable Tools] Initialization started.");

                LOGGER.info("[Renewable Tools] Item registration starting.");
                registerItems();
                LOGGER.info("[Renewable Tools] Item registration complete.");

                LOGGER.info("[Renewable Tools] Initialization completed.");
        }

        private void registerItems() {
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_sword"), EMERALD_SWORD);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_shovel"), EMERALD_SHOVEL);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_pickaxe"), EMERALD_PICKAXE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_axe"), EMERALD_AXE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_hoe"), EMERALD_HOE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_helmet"), EMERALD_HELMET);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_chestplate"),
                                EMERALD_CHESTPLATE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_leggings"),
                                EMERALD_LEGGINGS);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "emerald_boots"), EMERALD_BOOTS);

                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_sword"), AMETHYST_SWORD);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_shovel"), AMETHYST_SHOVEL);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_pickaxe"),
                                AMETHYST_PICKAXE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_axe"), AMETHYST_AXE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_hoe"), AMETHYST_HOE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_helmet"), AMETHYST_HELMET);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_chestplate"),
                                AMETHYST_CHESTPLATE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_leggings"),
                                AMETHYST_LEGGINGS);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "amethyst_boots"), AMETHYST_BOOTS);

                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_sword"), COPPER_SWORD);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_shovel"), COPPER_SHOVEL);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_pickaxe"), COPPER_PICKAXE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_axe"), COPPER_AXE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_hoe"), COPPER_HOE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_helmet"), COPPER_HELMET);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_chestplate"),
                                COPPER_CHESTPLATE);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_leggings"), COPPER_LEGGINGS);
                Registry.register(Registry.ITEM, new Identifier("renewabletools", "copper_boots"), COPPER_BOOTS);
        }

        public static class LootTableItem {
                public Identifier id;
                public int weight;

                public LootTableItem(Identifier id, int weight) {
                        this.id = id;
                        this.weight = weight;
                }
        }
}
