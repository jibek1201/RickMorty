package com.example.rickmorty.ui.characterDetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.rickmorty.data.Repository
import com.example.rickmorty.data.Resource


class CharacterDetailsViewModel(
    private val repository: Repository
) : ViewModel() {
    fun getCharacterDetails(sendId: Int): LiveData<Resource<Character>> =
        repository.getCharacterDetails(sendId)
}