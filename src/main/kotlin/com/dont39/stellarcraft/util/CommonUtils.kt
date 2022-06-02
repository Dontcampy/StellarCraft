package com.dont39.stellarcraft.util

import kotlin.reflect.KClass

object CommonUtils {
  fun getIdentifierPath(kClass: KClass<*>): String {
    return requireNotNull(kClass.simpleName).replace(Regex("[A-Z]"), "_$0").lowercase().removeRange(0..0)
  }
}