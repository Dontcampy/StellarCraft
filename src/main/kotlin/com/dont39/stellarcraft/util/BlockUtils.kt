package com.dont39.stellarcraft.util

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.Item.Settings
import net.minecraft.util.registry.Registry

object BlockUtils {
  fun Block.createBlockItem(setting: (settings: Settings) -> Settings): BlockItem {
    val settings = Settings()
    return BlockItem(this, setting(settings))
  }

  fun Block.createBlockItem(settings: Settings): BlockItem {
    return BlockItem(this, settings)
  }
}