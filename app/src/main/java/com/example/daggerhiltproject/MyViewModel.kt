package com.example.daggerhiltproject

import androidx.lifecycle.ViewModel
import com.example.daggerhiltproject.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


//normally dependency is constructed as soon as we injected,
// however with the Lazy, is not directly created when is injected
// but is created when is used

@HiltViewModel
class MyViewModel @Inject constructor(
//    private val repository: MyRepository
    private val repository: Lazy<MyRepository>
): ViewModel() {

    init {
        repository.get()
    }

}