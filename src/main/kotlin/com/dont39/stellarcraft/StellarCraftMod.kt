package com.dont39.stellarcraft

import com.dont39.stellarcraft.util.BlockUtils.createBlockItem
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.entity.FabricBlockEntityTypeBuilder
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

// For support join https://discord.gg/v6v4pMv

@Suppress("unused")
fun init() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.

    val firstItem = Item(Item.Settings().group(ItemGroup.MISC))

    Registry.register(Registry.ITEM, Identifier(MOD_NAMESPACE, "first_item"), firstItem, )

    val craftingTableBlock = Block(FabricBlockSettings.of(Material.METAL).breakInstantly())
    craftingTableBlock.createBlockItem {
        it.group(ItemGroup.BUILDING_BLOCKS)
    }
    Registry.register(Registry.BLOCK, Identifier(MOD_NAMESPACE, "crafting_table"), craftingTableBlock)
    Registry.register(Registry.ITEM, Identifier(MOD_NAMESPACE, "crafting_table"), BlockItem(craftingTableBlock, Item.Settings().group(ItemGroup.BUILDING_BLOCKS)))
}
