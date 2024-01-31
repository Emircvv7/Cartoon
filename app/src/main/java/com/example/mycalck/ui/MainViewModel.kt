package com.example.mycalck.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycalck.character.CharacterZ
import com.example.mycalck.data.RickAndMortyApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class MainViewModel(private val retrofit: Retrofit) : ViewModel() {
    private val _characters = MutableLiveData<List<CharacterZ>>()
    val characters: LiveData<List<CharacterZ>> get() = _characters

    init {
        loadCharacters()
    }

    private fun loadCharacters() {
        viewModelScope.launch {
            val api = retrofit.create(RickAndMortyApiService::class.java)

            val response = withContext(Dispatchers.IO) { api.getCharacters() }

            _characters.value = response.results
        }
    }
}




