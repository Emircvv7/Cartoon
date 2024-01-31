
package com.example.mycalck.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycalck.character.CharacterZ
import com.example.mycalck.character.Location
import com.example.mycalck.character.Origin
import com.example.mycalck.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val characters: List<CharacterZ> = listOf(
            CharacterZ(
                id = 1,
                name = "Rick Sanchez",
                status = "Alive",
                species = "Human",
                type = "Genius Scientist",
                gender = "Male",
                origin = Origin(name = "Earth", url = "https://rickandmortyapi.com/api/location/1"),
                location = Location(name = "Earth", url = "https://rickandmortyapi.com/api/location/20"),
                image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
                episode = listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2"),
                url = "https://rickandmortyapi.com/api/character/1",
                created = "2017-11-04T18:48:46.250Z"
            ),
            CharacterZ(
                id = 2,
                name = "Morty Smith",
                status = "Alive",
                species = "Human",
                type = "Student",
                gender = "Male",
                origin = Origin(name = "Earth", url = "https://rickandmortyapi.com/api/location/1"),
                location = Location(name = "Earth", url = "https://rickandmortyapi.com/api/location/20"),
                image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
                episode = listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2"),
                url = "https://rickandmortyapi.com/api/character/2",
                created = "2017-11-04T18:50:21.651Z"
            ),
            CharacterZ(
                id = 3,
                name = "Summer Smith",
                status = "Alive",
                species = "Human",
                type = "Student",
                gender = "Female",
                origin = Origin(name = "Earth", url = "https://rickandmortyapi.com/api/location/1"),
                location = Location(name = "Earth", url = "https://rickandmortyapi.com/api/location/20"),
                image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg",
                episode = listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2"),
                url = "https://rickandmortyapi.com/api/character/3",
                created = "2017-11-04T19:09:56.428Z"
            )
        )

        val adapter = CharacterAdapter(characters)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}
