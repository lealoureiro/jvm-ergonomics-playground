package org.leandroloureiro.demo.jvmergonomicsplayground.service

import org.leandroloureiro.demo.jvmergonomicsplayground.model.JVMInfo
import org.leandroloureiro.demo.jvmergonomicsplayground.model.MemoryInfo
import org.springframework.stereotype.Component
import java.lang.management.ManagementFactory

@Component
class JVMDetailsService {

    fun getJVMDetails(): JVMInfo {

        val runtimeMXBean = ManagementFactory.getRuntimeMXBean()
        val jvmInfo = runtimeMXBean.vmName + " " + runtimeMXBean.vmVendor + " " + runtimeMXBean.vmVersion

        val garbageCollectors = ManagementFactory.getGarbageCollectorMXBeans().stream()
                .map { gc -> gc.objectName.toString() }
                .toList()

        val osBean = ManagementFactory.getOperatingSystemMXBean()
        val availableCpus = osBean.availableProcessors

        val memoryInfo = getMemoryInfo()

        return JVMInfo(jvmInfo, garbageCollectors, availableCpus, memoryInfo)

    }

    fun getMemoryInfo() : MemoryInfo {

        val mb = 1024 * 1024
        val runtime = Runtime.getRuntime()

        val usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / mb
        val freeMemory = runtime.freeMemory() / mb
        val totalMemory = runtime.totalMemory() / mb
        val maxMemory = runtime.maxMemory() / mb

        return MemoryInfo(usedMemory, freeMemory, totalMemory, maxMemory)

    }

}