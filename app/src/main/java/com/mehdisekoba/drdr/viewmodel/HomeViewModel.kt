package com.mehdisekoba.drdr.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mehdisekoba.drdr.data.model.home.ResponseClinics
import com.mehdisekoba.drdr.data.model.home.ResponseComment
import com.mehdisekoba.drdr.data.model.home.ResponseHome
import com.mehdisekoba.drdr.data.model.home.ResponseIntroduction
import com.mehdisekoba.drdr.data.repository.HomeRepository
import com.mehdisekoba.drdr.utils.network.NetworkRequest
import com.mehdisekoba.drdr.utils.network.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository) : ViewModel() {
    init {
        viewModelScope.launch {
            delay(200)
            visitToTheDoctorApi()
            introductionDoctorApi()
            clinicDataApi()
            commentDataApi()
        }
    }

    //visit doctor home
    private val _visitToTheDoctor = MutableLiveData<NetworkRequest<ResponseHome>>()
    val visitToTheDoctor: LiveData<NetworkRequest<ResponseHome>> = _visitToTheDoctor

    private fun visitToTheDoctorApi() = viewModelScope.launch {
        _visitToTheDoctor.value = NetworkRequest.Loading()
        val response = repository.getHomeDataList()
        _visitToTheDoctor.value = NetworkResponse(response).generateResponse()
    }

    //introduction Doctor
    private val _introductionDoctor = MutableLiveData<NetworkRequest<ResponseIntroduction>>()
    val introductionDoctor: LiveData<NetworkRequest<ResponseIntroduction>> = _introductionDoctor
    private fun introductionDoctorApi() = viewModelScope.launch {
        _introductionDoctor.value = NetworkRequest.Loading()
        val response = repository.getHomeIntroductionData()
        _introductionDoctor.value = NetworkResponse(response).generateResponse()
    }

    //Clinic
    private val _clinicData = MutableLiveData<NetworkRequest<ResponseClinics>>()
    val clinicData: LiveData<NetworkRequest<ResponseClinics>> = _clinicData
    private fun clinicDataApi() = viewModelScope.launch {
        _clinicData.value = NetworkRequest.Loading()
        val response = repository.getHomeClinicsData()
        _clinicData.value = NetworkResponse(response).generateResponse()
    }

    //comment
    private val _commentData = MutableLiveData<NetworkRequest<ResponseComment>>()
    val commentData: LiveData<NetworkRequest<ResponseComment>> = _commentData
    private fun commentDataApi() = viewModelScope.launch {
        _commentData.value = NetworkRequest.Loading()
        val response = repository.getHomeCommentData()
        _commentData.value = NetworkResponse(response).generateResponse()
    }
}