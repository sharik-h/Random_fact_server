package com.example.routes

import com.example.data.model.Fact
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://172.25.96.1:8080"

private val facts = listOf(
    Fact("Pistol Shrimp", "The loudest animal in the world is a mere 2cm long, prawn. The Pistol Shrimp is capable of snapping its claw shut so rapidly, that it creates a bubble which collapses to produce a sonic blast, louder than a Concorde’s sonic boom", "$BASE_URL/animals/pisto-shrimp.jpg" ),
    Fact("Flamingo", "Flamingos are not pink. They are born grey, their diet of brine shrimp and blue green algae contains a natural pink dye called canthaxanthin that makes their feathers pink", "$BASE_URL/animals/flamingo.jpg"),
    Fact("Dolphin", "Dolphins use toxic pufferfish to ‘get high’.", "$BASE_URL/animals/dolphin.jpg"),
    Fact("Humming Bird", "Hummingbirds are the only known birds that can also fly backwards.", "$BASE_URL/animals/humming_bird.jpg"),
    Fact("Inland Taipan", "The Inland Taipan (also known as, the Western Taipan) is the most venomous snake in the world.", "$BASE_URL/animals/inland_taipan.jpg"),
    Fact("Mayfly", "The shortest living animal in the world is the Mayfly.", "$BASE_URL/animals/mayfly.jpg"),
    Fact("Mosquito", "The worlds deadliest animal isn’t a shark, bear or tiger, but something far smaller – the mosquito.", "$BASE_URL/animals/mosquito.jpg"),
    Fact("Otter", "Otters “hold hands” while sleeping, so they don’t float away from each other.", "$BASE_URL/animals/otter.jpg"),
    Fact("Ant", "There are more than 1.4 billion insects for EACH HUMAN on the planet, according to recent estimates. Ants have colonised almost every landmass on Earth.", "$BASE_URL/animals/ant.jpg"),
    Fact("Tiger", "Tigers have striped skin, not just striped fur.", "$BASE_URL/animals/tiger.jpg"),
)

fun Route.randomFact() {
    get("/randomFact") {
        call.respond(
            HttpStatusCode.OK,
            facts.random()
        )
    }
}