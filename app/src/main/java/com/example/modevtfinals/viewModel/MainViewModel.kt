package com.example.modevtfinals.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modevtfinals.LOG_TAG
import com.example.modevtfinals.util.MainHelper

class MainViewModel: ViewModel() {
    private val _token = MutableLiveData<Int>()

    val token: LiveData<Int> = _token

    init {
        Log.i(LOG_TAG, "MainViewModel is CREATED")
        _token.value = MainHelper.getRemainingData()

    }

    fun wrongAnswer(){
        _token.value = _token.value?.minus(1)

    }

    fun correctAnswer(){
        _token.value = _token.value?.plus(1)

    }


}