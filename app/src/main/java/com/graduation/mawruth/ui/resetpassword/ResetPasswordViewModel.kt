package com.graduation.mawruth.ui.resetpassword

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.graduation.domain.useCase.EditUserInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResetPasswordViewModel @Inject constructor(
    private val editUserInfoUseCase: EditUserInfoUseCase,
) : ViewModel() {

    val infoLiveData = MutableLiveData<Boolean>()
    fun editPassword(newPassword: String) {
//        viewModelScope.launch {
//            try {
//                val result =
//                    editUserInfoUseCase
//                        .invoke(
//                            null,
//                            null,
//                            null,
//                            newPassword,
//                            null,
//                            null
//                        )
//                infoLiveData.postValue(true)
//            } catch (e: Exception) {
//                Log.e("userInfo", e.localizedMessage!!)
//                infoLiveData.postValue(false)
//            }
//        }

    }

}