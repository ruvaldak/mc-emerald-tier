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

        private static <ITEM_TYPE extends Item> ITEM_TYPE registerItem(String itemId, ITEM_TYPE item) {
                return Registry.register(Registries.ITEM, new Identifier(NAMESPACE, itemId), item);
        }

        //Sword
        public static final SwordItem EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(EmeraldToolMaterial.INSTANCE, 3, -2.4F, new FabricItemSettings()));
        public static final SwordItem AMETHYST_SWORD = registerItem("amethyst_sword", new SwordItem(AmethystToolMaterial.INSTANCE, 3, -2.4F, new FabricItemSettings()));
        public static final SwordItem COPPER_SWORD = registerItem("copper_sword", new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4F, new FabricItemSettings()));

        //Shovel
        public static final ShovelItem EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(EmeraldToolMaterial.INSTANCE, 1.5F, -3.0F, new FabricItemSettings()));
        public static final ShovelItem AMETHYST_SHOVEL = registerItem("amethyst_shovel", new ShovelItem(AmethystToolMaterial.INSTANCE, 1.5F, -3.0F, new FabricItemSettings()));
        public static final ShovelItem COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(CopperToolMaterial.INSTANCE, 1.5F, -3.0F, new FabricItemSettings()));

        //Pickaxe
        public static final PickaxeItem EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(EmeraldToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings()));
        public static final PickaxeItem AMETHYST_PICKAXE = new PickaxeItem(AmethystToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings());
        public static final PickaxeItem COPPER_PICKAXE = new PickaxeItem(CopperToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings());

        public static final Logger LOGGER = LoggerFactory.getLogger("renewabletools");

        // Emerald
        
        public static final AxeItem EMERALD_AXE = new AxeItem(EmeraldToolMaterial.INSTANCE, 6F, -3.1F, new FabricItemSettings());
        public static final HoeItem EMERALD_HOE = new HoeItem(EmeraldToolMaterial.INSTANCE, -2, -1F, new FabricItemSettings());

        public static final ArmorItem EMERALD_HELMET = new ArmorItem(EmeraldArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings());
        public static final ArmorItem EMERALD_CHESTPLATE = new ArmorItem(EmeraldArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
        public static final ArmorItem EMERALD_LEGGINGS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
        public static final ArmorItem EMERALD_BOOTS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings());

        // Amethyst
        
        
        
        public static final AxeItem AMETHYST_AXE = new AxeItem(AmethystToolMaterial.INSTANCE, 7F, -3.2F, new FabricItemSettings());
        public static final HoeItem AMETHYST_HOE = new HoeItem(AmethystToolMaterial.INSTANCE, -1, -2F, new FabricItemSettings());

        public static final ArmorItem AMETHYST_HELMET = new ArmorItem(AmethystArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings());
        public static final ArmorItem AMETHYST_CHESTPLATE = new ArmorItem(AmethystArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
        public static final ArmorItem AMETHYST_LEGGINGS = new ArmorItem(AmethystArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
        public static final ArmorItem AMETHYST_BOOTS = new ArmorItem(AmethystArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings());

        // Copper
        
        
        
        public static final AxeItem COPPER_AXE = new AxeItem(CopperToolMaterial.INSTANCE, 6F, -3.1F, new FabricItemSettings());
        public static final HoeItem COPPER_HOE = new HoeItem(CopperToolMaterial.INSTANCE, -2, -1F, new FabricItemSettings());

        public static final ArmorItem COPPER_HELMET = new ArmorItem(CopperArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings());
        public static final ArmorItem COPPER_CHESTPLATE = new ArmorItem(CopperArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
        public static final ArmorItem COPPER_LEGGINGS = new ArmorItem(CopperArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
        public static final ArmorItem COPPER_BOOTS = new ArmorItem(CopperArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings());

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
                /*Object[][] itemList = {
                        {"emerald_shovel", RenewableTools.EMERALD_SHOVEL},
                        {"emerald_pickaxe", RenewableTools.EMERALD_PICKAXE},
                        {"emerald_axe", RenewableTools.EMERALD_AXE},
                        {"emerald_hoe", RenewableTools.EMERALD_HOE},
                        {"emerald_helmet", RenewableTools.EMERALD_HELMET},
                        {"emerald_chestplate", RenewableTools.EMERALD_CHESTPLATE},
                        {"emerald_leggings", RenewableTools.EMERALD_LEGGINGS},
                        {"emerald_boots", RenewableTools.EMERALD_BOOTS},
                        {"amethyst_shovel", RenewableTools.AMETHYST_SHOVEL},
                        {"amethyst_pickaxe", RenewableTools.AMETHYST_PICKAXE},
                        {"amethyst_axe", RenewableTools.AMETHYST_AXE},
                        {"amethyst_hoe", RenewableTools.AMETHYST_HOE},
                        {"amethyst_helmet", RenewableTools.AMETHYST_HELMET},
                        {"amethyst_chestplate", RenewableTools.AMETHYST_CHESTPLATE},
                        {"amethyst_leggings", RenewableTools.AMETHYST_LEGGINGS},
                        {"amethyst_boots", RenewableTools.AMETHYST_BOOTS},
                        {"copper_shovel", RenewableTools.COPPER_SHOVEL},
                        {"copper_pickaxe", RenewableTools.COPPER_PICKAXE},
                        {"copper_axe", RenewableTools.COPPER_AXE},
                        {"copper_hoe", RenewableTools.COPPER_HOE},
                        {"copper_helmet", RenewableTools.COPPER_HELMET},
                        {"copper_chestplate", RenewableTools.COPPER_CHESTPLATE},
                        {"copper_leggings", RenewableTools.COPPER_LEGGINGS},
                        {"copper_boots", RenewableTools.COPPER_BOOTS}
                };

                for(int i = 0; i < itemList.length; i++) {
                        registerItem((String)itemList[i][0], (Item)itemList[i][1]);
                }*/

                Registry.register(Registries.ITEM, new Identifier("renewabletools", "emerald_shovel"), EMERALD_SHOVEL);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "emerald_pickaxe"), EMERALD_PICKAXE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "emerald_axe"), EMERALD_AXE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "emerald_hoe"), EMERALD_HOE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "emerald_helmet"), EMERALD_HELMET);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "emerald_chestplate"),
                                EMERALD_CHESTPLATE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "emerald_leggings"),
                                EMERALD_LEGGINGS);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "emerald_boots"), EMERALD_BOOTS);

                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_sword"), AMETHYST_SWORD);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_shovel"), AMETHYST_SHOVEL);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_pickaxe"),
                                AMETHYST_PICKAXE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_axe"), AMETHYST_AXE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_hoe"), AMETHYST_HOE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_helmet"), AMETHYST_HELMET);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_chestplate"),
                                AMETHYST_CHESTPLATE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_leggings"),
                                AMETHYST_LEGGINGS);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "amethyst_boots"), AMETHYST_BOOTS);

                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_sword"), COPPER_SWORD);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_shovel"), COPPER_SHOVEL);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_pickaxe"), COPPER_PICKAXE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_axe"), COPPER_AXE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_hoe"), COPPER_HOE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_helmet"), COPPER_HELMET);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_chestplate"),
                                COPPER_CHESTPLATE);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_leggings"), COPPER_LEGGINGS);
                Registry.register(Registries.ITEM, new Identifier("renewabletools", "copper_boots"), COPPER_BOOTS);

                ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
                        entries.add(EMERALD_SWORD);
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
