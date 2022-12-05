package org.leandroloureiro.demo.jvmergonomicsplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JvmErgonomicsPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<JvmErgonomicsPlaygroundApplication>(*args)
}
