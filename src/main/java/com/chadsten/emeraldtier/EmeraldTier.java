package com.chadsten.emeraldtier;

import com.chadsten.emeraldtier.item.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
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

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Emerald Tier Initializing.");

        registerItems();

        LOGGER.info("Emerald Tier Initialized!");
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
    }

}
