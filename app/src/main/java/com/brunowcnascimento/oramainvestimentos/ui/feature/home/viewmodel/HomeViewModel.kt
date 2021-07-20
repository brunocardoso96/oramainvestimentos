package com.brunowcnascimento.oramainvestimentos.ui.feature.home.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.brunowcnascimento.oramainvestimentos.data.model.FundDetail
import com.brunowcnascimento.oramainvestimentos.data.repository.HomeRepository
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: HomeRepository): ViewModel() {

    val fundDetailLiveData = MutableLiveData<List<FundDetail>>()

    fun getFundDetail() {
        viewModelScope.launch {
            fundDetailLiveData.postValue(repository.getFundDetail())
        }
    }
    class HomeViewModelFactory(private val repository: HomeRepository) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return HomeViewModel(repository) as T
        }
    }
}