package com.example.rickmorty.di


import com.example.rickmorty.data.Repository
import org.koin.dsl.module

val repositoryModule = module {
    single{
        Repository(get())
    }
}