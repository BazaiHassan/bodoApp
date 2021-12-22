package com.masterdev.bodo.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.masterdev.bodo.repositories.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
):ViewModel() {
}