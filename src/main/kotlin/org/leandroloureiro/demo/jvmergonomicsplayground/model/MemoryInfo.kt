package org.leandroloureiro.demo.jvmergonomicsplayground.model

data class MemoryInfo(val usedMemory: Long,
                      val freeMemory: Long,
                      val totalMemory: Long,
                      val maxMemory: Long)
