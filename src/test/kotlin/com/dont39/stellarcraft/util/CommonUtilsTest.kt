package com.dont39.stellarcraft.util

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CommonUtilsTest {

  class TestBlock()

  @Test
  fun getIdentifierPath() {
    assertEquals("test_block", CommonUtils.getIdentifierPath(TestBlock::class))
  }
}