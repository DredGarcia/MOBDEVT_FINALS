package com.example.modevtfinals.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modevtfinals.LOG_TAG
import com.example.modevtfinals.util.MainHelper

class MainViewModel: ViewModel() {
    private val _message = MutableLiveData<String>()
    private val _data = MutableLiveData<Int>()
    private val _load = MutableLiveData<Int>()

    val message: LiveData<String> = _message
    val data: LiveData<Int> = _data
    val load: LiveData<Int> = _load

    init {
        Log.i(LOG_TAG, "MainViewModel is CREATED")
        _message.value = MainHelper.getMessage()
        _data.value = MainHelper.getRemainingData()
        _load.value = 3
    }

    fun wrongAnswer(){
        _data.value = _data.value?.minus(1)

    }

    fun correctAnswer(){
        _data.value = _data.value?.plus(1)

    }


}