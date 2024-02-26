package com.example.rickmorty.ui.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.rickmorty.data.Repository
import com.example.rickmorty.data.Resource

class ViewModel(private val repository: Repository):ViewModel(){
    fun getCharacters():LiveData<Resource<List<Character>>> = repository.getCharacters()
}