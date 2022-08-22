package com.chadsten.emeraldtier;

import com.chadsten.emeraldtier.item.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmeraldTier implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("emeraldtier");

    public static final SwordItem EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ShovelItem EMERALD_SHOVEL = new ShovelItem(EmeraldToolMaterial.INSTANCE, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final EmeraldPickaxeItem EMERALD_PICKAXE = new EmeraldPickaxeItem(EmeraldToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final EmeraldAxeItem EMERALD_AXE = new EmeraldAxeItem(EmeraldToolMaterial.INSTANCE, 6.5F, -3.2F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final EmeraldHoeItem EMERALD_HOE = new EmeraldHoeItem(EmeraldToolMaterial.INSTANCE, -1, -1.5F, new FabricItemSettings().group(ItemGroup.TOOLS));

    public static final ArmorItem EMERALD_HELMET = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem EMERALD_CHESTPLATE = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem EMERALD_LEGGINGS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem EMERALD_BOOTS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final HorseArmorItem EMERALD_HORSE_ARMOR = new HorseArmorItem(13, "emerald", new FabricItemSettings().maxCount(1).group(ItemGroup.MISC));

    public static final SwordItem AMETHYST_SWORD = new SwordItem(AmethystToolMaterial.INSTANCE, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ShovelItem AMETHYST_SHOVEL = new ShovelItem(AmethystToolMaterial.INSTANCE, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final EmeraldPickaxeItem AMETHYST_PICKAXE = new EmeraldPickaxeItem(AmethystToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final EmeraldAxeItem AMETHYST_AXE = new EmeraldAxeItem(AmethystToolMaterial.INSTANCE, 6.5F, -3.2F, new FabricItemSettings().group(ItemGroup.TOOLS));
    public static final EmeraldHoeItem AMETHYST_HOE = new EmeraldHoeItem(AmethystToolMaterial.INSTANCE, -1, -1.5F, new FabricItemSettings().group(ItemGroup.TOOLS));

    public static final ArmorItem AMETHYST_HELMET = new ArmorItem(AmethystArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMETHYST_CHESTPLATE = new ArmorItem(AmethystArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMETHYST_LEGGINGS = new ArmorItem(AmethystArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final ArmorItem AMETHYST_BOOTS = new ArmorItem(AmethystArmorMaterial.INSTANCE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final HorseArmorItem AMETHYST_HORSE_ARMOR = new HorseArmorItem(13, "amethyst", new FabricItemSettings().maxCount(1).group(ItemGroup.MISC));


    public static final LootTableItem[] LOOT_TABLE = {
            new LootTableItem(LootTables.SIMPLE_DUNGEON_CHEST, 2),
            new LootTableItem(LootTables.DESERT_PYRAMID_CHEST, 3),
            new LootTableItem(LootTables.END_CITY_TREASURE_CHEST, 1),
            new LootTableItem(LootTables.JUNGLE_TEMPLE_CHEST, 1),
            new LootTableItem(LootTables.NETHER_BRIDGE_CHEST, 2),
            new LootTableItem(LootTables.STRONGHOLD_CORRIDOR_CHEST, 1)
            // village weaponsmith's chests are excluded to provide balance via increased rarity
    };

    public static void buildLootTables() {
        for (LootTableItem LOOT_ENTRY: LOOT_TABLE) {

            LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
                if (source.isBuiltin() && LOOT_ENTRY.id.equals(id)) {

                    LootPool.Builder poolBuilder = LootPool.builder()
                            .with(ItemEntry.builder(EmeraldTier.EMERALD_HORSE_ARMOR).weight(LOOT_ENTRY.weight));

                    tableBuilder.pool(poolBuilder);
                }
            });
        }
    }

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("[Emerald Tier] Initialization started.");

        LOGGER.info("[Emerald Tier] Item registration starting.");
        registerItems();
        LOGGER.info("[Emerald Tier] Item registration complete.");

        LOGGER.info("[Emerald Tier] Loot table modification starting.");
        buildLootTables();
        LOGGER.info("[Emerald Tier] Loot table modification complete.");

        LOGGER.info("[Emerald Tier] Initialization completed.");
    }

    private void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_sword"), EMERALD_SWORD);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_shovel"), EMERALD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_pickaxe"), EMERALD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_axe"), EMERALD_AXE);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_hoe"), EMERALD_HOE);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_boots"), EMERALD_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "emerald_horse_armor"), EMERALD_HORSE_ARMOR);

        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_sword"), AMETHYST_SWORD);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_shovel"), AMETHYST_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_pickaxe"), AMETHYST_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_axe"), AMETHYST_AXE);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_hoe"), AMETHYST_HOE);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_helmet"), AMETHYST_HELMET);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_chestplate"), AMETHYST_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_leggings"), AMETHYST_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_boots"), AMETHYST_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("emeraldtier", "amethyst_horse_armor"), AMETHYST_HORSE_ARMOR);
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

