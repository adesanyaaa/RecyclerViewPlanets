package com.adesoftware.recyclerviewplanets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class PlanetsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planets)

        val recyclerView: RecyclerView = findViewById(R.id.rv_planets)

        val planetImages = arrayListOf(
            PlanetModel(
                R.drawable.solarsystem,
                "Solar System",
                "These included the Sun and Earth's Moon, " +
                        "as well as the five planets in the modern sense—Mercury, " +
                        "Venus, Mars, Jupiter, and Saturn"
            ),
            PlanetModel(
                R.drawable.pluto,
                "Pluto",
                "A dwarf planet in the Kuiper belt, a ring of bodies " +
                        "beyond the orbit of Neptune. "
            ),
            PlanetModel(
                R.drawable.mercury,
                "Mercury",
                "The smallest planet in the Solar System and the closest to the Sun. " +
                        "Its orbit around the Sun takes 87.97 Earth days."
            ),
            PlanetModel(
                R.drawable.venus,
                "Venus",
                "The second planet from the Sun, " +
                        "orbiting it the closest to Earth."
            ),
            PlanetModel(
                R.drawable.earth,
                "Earth",
                "The third planet from the Sun and " +
                        "the only astronomical object known to harbor life."

            ),
            PlanetModel(
                R.drawable.mars,
                "Mars",
                "The fourth planet from the Sun and the second-smallest" +
                        " planet in the Solar System, being larger than only Mercury. "
            ),
            PlanetModel(R.drawable.jupiter,
                "Jupiter",
                "The fifth planet from the Sun and the largest in the Solar System"
            ),
            PlanetModel(
                R.drawable.saturn,
                "Saturn",
                "The sixth planet from the Sun and the " +
                        "second-largest in the Solar System, after Jupiter."
            ),
            PlanetModel(
                R.drawable.uranus,
                "Uranus",
                "The seventh planet from the Sun. " +
                        "Its name is a reference to the Greek god of the sky,"
            ),
            PlanetModel(
                R.drawable.neptune,
                "Neptune",
                "The eighth planet from the Sun and the farthest known solar planet."
            )
        )

        val adapter = PlanetAdapter(planetImages)
        recyclerView.adapter = adapter
    }

}