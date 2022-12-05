package org.leandroloureiro.demo.jvmergonomicsplayground

import kotlinx.coroutines.flow.flowOf
import org.leandroloureiro.demo.jvmergonomicsplayground.service.JVMDetailsService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyAndAwait
import org.springframework.web.reactive.function.server.coRouter

@SpringBootApplication
class JvmErgonomicsPlaygroundApplication {

    @Bean
    fun http(jvmDetailsService: JVMDetailsService) = coRouter {
        GET("/jvm-info") {
            ServerResponse.ok().bodyAndAwait(flowOf(jvmDetailsService.getJVMDetails()))
        }
    }

}

fun main(args: Array<String>) {
    runApplication<JvmErgonomicsPlaygroundApplication>(*args)
}
