package com.example.plugins

import com.example.routes.randomFact
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    
    routing {
        randomFact()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
