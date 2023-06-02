package com.ruvaldak.renewabletools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.loot.LootTables;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ruvaldak.renewabletools.item.*;
public class RenewableTools implements ModInitializer {
        // This logger is used to write text to the console and the log file.
        // It is considered best practice to use your mod id as the logger's name.
        // That way, it's clear which mod wrote info, warnings, and errors.
        public static final String NAMESPACE = "renewabletools";
        public static final Logger LOGGER = LoggerFactory.getLogger(NAMESPACE);

        private static <I extends Item> I registerItem(String itemId, I item) {
                return Registry.register(Registries.ITEM, new Identifier(NAMESPACE, itemId), item);
        }
        // Sword
        public static final SwordItem EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterials.EMERALD, 3, -2.4F, new FabricItemSettings()));
        public static final SwordItem AMETHYST_SWORD = registerItem("amethyst_sword", new SwordItem(ModToolMaterials.AMETHYST, 3, -2.4F, new FabricItemSettings()));
        public static final SwordItem COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterials.COPPER, 3, -2.4F, new FabricItemSettings()));

        // Shovel
        public static final ShovelItem EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(ModToolMaterials.EMERALD, 1.5F, -3.0F, new FabricItemSettings()));
        public static final ShovelItem AMETHYST_SHOVEL = registerItem("amethyst_shovel", new ShovelItem(ModToolMaterials.AMETHYST, 1.5F, -3.0F, new FabricItemSettings()));
        public static final ShovelItem COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterials.COPPER, 1.5F, -3.0F, new FabricItemSettings()));

        // Pickaxe
        public static final PickaxeItem EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(ModToolMaterials.EMERALD, 1, -2.8F, new FabricItemSettings()));
        public static final PickaxeItem AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", new PickaxeItem(ModToolMaterials.AMETHYST, 1, -2.8F, new FabricItemSettings()));
        public static final PickaxeItem COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModToolMaterials.COPPER, 1, -2.8F, new FabricItemSettings()));

        // Axe
        public static final AxeItem EMERALD_AXE = registerItem("emerald_axe", new AxeItem(ModToolMaterials.EMERALD, 6F, -3.1F, new FabricItemSettings()));
        public static final AxeItem AMETHYST_AXE = registerItem("amethyst_axe", new AxeItem(ModToolMaterials.AMETHYST, 7F, -3.2F, new FabricItemSettings()));
        public static final AxeItem COPPER_AXE = registerItem("copper_axe", new AxeItem(ModToolMaterials.COPPER, 6F, -3.1F, new FabricItemSettings()));

        // Hoe
        public static final HoeItem EMERALD_HOE = registerItem("emerald_hoe", new HoeItem(ModToolMaterials.EMERALD, -2, -1F, new FabricItemSettings()));
        public static final HoeItem AMETHYST_HOE = registerItem("amethyst_hoe", new HoeItem(ModToolMaterials.AMETHYST, -1, -2F, new FabricItemSettings()));
        public static final HoeItem COPPER_HOE = registerItem("copper_hoe", new HoeItem(ModToolMaterials.COPPER, -2, -1F, new FabricItemSettings()));

        // Emerald Armor
        public static final ArmorItem EMERALD_HELMET = registerItem("emerald_helmet", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
        public static final ArmorItem EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        public static final ArmorItem EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        public static final ArmorItem EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

        // Amethyst Armor
        public static final ArmorItem AMETHYST_HELMET = registerItem("amethyst_helmet", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
        public static final ArmorItem AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        public static final ArmorItem AMETHYST_LEGGINGS = registerItem("amethyst_leggings", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        public static final ArmorItem AMETHYST_BOOTS = registerItem("amethyst_boots", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));

        // Copper Armor
        public static final ArmorItem COPPER_HELMET = registerItem("copper_helmet", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
        public static final ArmorItem COPPER_CHESTPLATE = registerItem("copper_chestplate", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        public static final ArmorItem COPPER_LEGGINGS = registerItem("copper_leggings", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        public static final ArmorItem COPPER_BOOTS = registerItem("copper_boots", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));


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

                LOGGER.info("[Renewable Tools] Adding items to item groups...");
                addItemsToGroups();
                LOGGER.info("[Renewable Tools] Done.");

                LOGGER.info("[Renewable Tools] Initialization completed.");
        }

        

        private void addItemsToGroups() {
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
                        // Emerald
                        entries.addAfter(Items.GOLDEN_PICKAXE, EMERALD_PICKAXE);
                        entries.addAfter(Items.GOLDEN_SHOVEL, EMERALD_SHOVEL);
                        entries.addAfter(Items.GOLDEN_HOE, EMERALD_HOE);

                        // Amethyst
                        entries.addAfter(Items.IRON_PICKAXE, AMETHYST_PICKAXE);
                        entries.addAfter(Items.IRON_SHOVEL, AMETHYST_SHOVEL);
                        entries.addAfter(Items.IRON_HOE, AMETHYST_HOE);

                        // Copper
                        entries.addAfter(Items.STONE_PICKAXE, COPPER_PICKAXE);
                        entries.addAfter(Items.STONE_SHOVEL, COPPER_SHOVEL);
                        entries.addAfter(Items.STONE_HOE, COPPER_HOE);
                });

                ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
                        // Emerald
                        entries.addAfter(Items.GOLDEN_SWORD, EMERALD_SWORD);
                        entries.addAfter(Items.GOLDEN_AXE, EMERALD_AXE);
                        entries.addAfter(Items.DIAMOND_BOOTS, EMERALD_HELMET);
                        entries.addAfter(EMERALD_HELMET, EMERALD_CHESTPLATE);
                        entries.addAfter(EMERALD_CHESTPLATE, EMERALD_LEGGINGS);
                        entries.addAfter(EMERALD_LEGGINGS, EMERALD_BOOTS);

                        // Amethyst
                        entries.addAfter(Items.IRON_SWORD, AMETHYST_SWORD);
                        entries.addAfter(Items.IRON_AXE, AMETHYST_AXE);
                        entries.addAfter(Items.IRON_BOOTS, AMETHYST_HELMET);
                        entries.addAfter(AMETHYST_HELMET, AMETHYST_CHESTPLATE);
                        entries.addAfter(AMETHYST_CHESTPLATE, AMETHYST_LEGGINGS);
                        entries.addAfter(AMETHYST_LEGGINGS, AMETHYST_BOOTS);

                        // Copper
                        entries.addAfter(Items.STONE_SWORD, COPPER_SWORD);
                        entries.addAfter(Items.STONE_AXE, COPPER_AXE);
                        entries.addAfter(Items.LEATHER_BOOTS, COPPER_HELMET);
                        entries.addAfter(COPPER_HELMET, COPPER_CHESTPLATE);
                        entries.addAfter(COPPER_CHESTPLATE, COPPER_LEGGINGS);
                        entries.addAfter(COPPER_LEGGINGS, COPPER_BOOTS);
                });
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
