package com.example.rickmorty.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.rickmorty.data.CartoonApiService
import com.example.rickmorty.data.Resource
import kotlinx.coroutines.Dispatchers

abstract class BaseRepository(private val api: CartoonApiService) {

    protected fun <T> performRequest(apiCall: suspend () -> T): LiveData<Resource<T>> =
        liveData(Dispatchers.IO) {
            emit(Resource.Loading())
            try {
                val response = apiCall.invoke()
                emit(Resource.Success(response))
            } catch (e: Exception) {
                emit(Resource.Error(e.localizedMessage ?: "Unknown error"))
            }
        }

}