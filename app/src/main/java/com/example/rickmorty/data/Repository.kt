package com.example.rickmorty.data

import androidx.lifecycle.LiveData
import com.example.rickmorty.ui.base.BaseRepository

class Repository(private val api: CartoonApiService): BaseRepository(api) {

    fun getCharacters(): LiveData<Resource<List<Character>>> = performRequest {
        api.getCharacters().body()?.results ?: emptyList()
    }

    fun getCharacterDetails(id: Int): LiveData<Resource<Character>> = performRequest {
        api.getCharacterDetails(id).body()!!
    }
}