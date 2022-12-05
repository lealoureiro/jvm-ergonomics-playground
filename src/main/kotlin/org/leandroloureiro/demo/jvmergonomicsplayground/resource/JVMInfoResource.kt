package org.leandroloureiro.demo.jvmergonomicsplayground.resource

import org.leandroloureiro.demo.jvmergonomicsplayground.model.JVMInfo
import org.leandroloureiro.demo.jvmergonomicsplayground.service.JVMDetailsService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
class JVMInfoResource (private val jvmDetailsService : JVMDetailsService){

    @GetMapping(path = ["/jvm-info"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun jvmInfo() : Mono<JVMInfo> {

        return Mono.just(jvmDetailsService.getJVMDetails())

    }

}