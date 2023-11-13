package com.runrun.elasticsearch

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/api")
class LoggingController {

    @GetMapping("/logging")
    fun logging() {
        logger.info { "Hello World" }
    }
}
