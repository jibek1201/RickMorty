package com.example.rickmorty.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{
        ViewModel(get())
    }

    viewModel{
        CharacterDetailsViewModel(get())
    }
}