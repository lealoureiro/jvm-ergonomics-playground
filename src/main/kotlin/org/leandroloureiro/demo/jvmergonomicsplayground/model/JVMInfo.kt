package org.leandroloureiro.demo.jvmergonomicsplayground.model

data class JVMInfo(val jvmInfo: String,
                   val availableGarbageCollectors: List<String>,
                   val availableCpus: Int,
                   val memory: MemoryInfo)
