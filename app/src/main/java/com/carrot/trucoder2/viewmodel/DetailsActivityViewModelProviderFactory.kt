package com.carrot.trucoder2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.carrot.trucoder2.repository.CodeRespository

class DetailsActivityViewModelProviderFactory(val codeRespository : CodeRespository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DetailsViewModel(codeRespository) as T
    }

}