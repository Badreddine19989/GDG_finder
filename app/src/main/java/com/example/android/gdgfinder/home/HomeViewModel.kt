package com.example.android.gdgfinder.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class HomeViewModel : ViewModel() {
    private val _navigateToSearch = MutableLiveData<Boolean>()
    val navigateToSearch: LiveData<Boolean>
        get() = _navigateToSearch

    init {
        _navigateToSearch.value = false
    }

    fun onFabClicked() {
        _navigateToSearch.value = true
        Log.i("gdgnav","navigation = true")
    }

    fun onNavigatedToSearch() {
        _navigateToSearch.value = false
    }
}