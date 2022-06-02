package com.dont39.stellarcraft.block

import com.dont39.stellarcraft.MOD_NAMESPACE
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.util.Identifier

abstract class AbstractScBlock {
  abstract val block: Block
  abstract val blockItem: BlockItem

}