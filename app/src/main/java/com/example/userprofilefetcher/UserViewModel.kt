package com.example.userprofilefetcher

import androidx.lifecycle.*
import kotlinx.coroutines.launch
import retrofit2.Response

   class UserViewModel : ViewModel() {
     private val repository = UserRepository()

     private val _user = MutableLiveData<User?>()
      val user: LiveData<User?> get() = _user
       private val _error = MutableLiveData<String?>()
        val error: LiveData<String?> get() = _error

      fun fetchUserProfile() {
         viewModelScope.launch {
            _error.value = null // Clear any previous error message
            val response: Response<User> = repository.getUserProfile()
            if (response.isSuccessful && response.body() != null) {
                _user.postValue(response.body())
            } else {
                _error.postValue("Failed to load data. Please try again.")
            }
        }
    }
}