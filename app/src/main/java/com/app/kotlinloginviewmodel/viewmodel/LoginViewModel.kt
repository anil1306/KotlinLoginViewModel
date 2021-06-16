package com.app.kotlinloginviewmodel.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.app.kotlinloginviewmodel.modellogin.LoginModel
import com.app.kotlinloginviewmodel.remote.LoginApiService
import com.app.kotlinloginviewmodel.remote.LoginBody
import com.app.kotlinloginviewmodel.util.Resource
import kotlinx.coroutines.Dispatchers

class LoginViewModel(private val apiService: LoginApiService) : ViewModel() {

    //  var emailAddress = "ajay21@yopmail.com"
//    var password = "Test@1234"
    var fcmToken = "adfssafdskfdajfdlkfjdfjfljdffaff"

    //  val emailAddress: MutableLiveData<String> = MutableLiveData()
    // val password: MutableLiveData<String> = MutableLiveData()
    // var emailAddress: MutableLiveData<String> = MutableLiveData()
    //val emailAddress: LiveData<String> get()=_emailAddress
    var password: MutableLiveData<String> = MutableLiveData()
    var email: MutableLiveData<String> = MutableLiveData()
    // val password: LiveData<String> get()= _password

 /*   private var _emailAddress = MutableLiveData<String>()
    val emailAddress: MutableLiveData<String>
        get() = _emailAddress*/

/*   var emailAddress = ObservableField("")
    var password = ObservableField("")*/

    // private val login: MutableLiveData<UserLoginModel>? = null
    /* private val loginRepository: LoginRepository
         get()= loginRepository.getMutableLiveData()*/

    /* init {
         loginRepository = LoginRepository()
     }*/


    /* private val loginRepository: LoginRepository
       val login: LiveData<Resource<Call<LoginModel?>?>>
        get()= loginRepository.getMutableLiveData()

    init {
        loginRepository = LoginRepository()
    }*/
///https://stackoverflow.com/questions/60678290/using-livedata-coroutine-builder-on-dispatchers-io-thread


    private var userMutableLiveData: MutableLiveData<LoginModel>? = null

    /*fun loginUser(): MutableLiveData<LoginModel>? {
        if (userMutableLiveData == null) {
            userMutableLiveData = MutableLiveData<LoginModel>()
        }
        return userMutableLiveData
    }
    fun onClick(view: View?) {
        val loginUser =LoginBody(_emailAddress.value.toString(),
            _password.value.toString(), fcmToken
        )
        userMutableLiveData!!.setValue(loginUser)
    }*/
    suspend fun onLoginButtonClicked() {

        apiService.logInPostRequest(
            LoginBody
                (email.value.toString().trim(), password.value.toString().trim(), fcmToken)
        ).let { it ->
            when (it) {
              /*  Result.Success -> {
                    //   showProgress(false)

                    resource.data.let { call -> it }
                    resource.data.let { println("$it!!") }
                    resource.data?.let { retrieveList(it as ArrayList<LoginModel?>) }
                    //resource.data?.let { users -> retrieveList(users as ArrayList<LoginModel?>) }
                    //  Toast.makeText(this, it.data, Toast.LENGTH_LONG).show()
                }
                Status.ERROR -> {
                    showProgress(false)
                    //  Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
                Status.LOADING -> {
                    showProgress(true)
                }*/
                else -> {
                }
            }

        }
    }
}

