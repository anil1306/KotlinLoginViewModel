package com.app.kotlinloginviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.kotlinloginviewmodel.databinding.ActivityMainBinding
import com.app.kotlinloginviewmodel.modellogin.LoginModel
import com.app.kotlinloginviewmodel.remote.LoginApiService
import com.app.kotlinloginviewmodel.remote.LoginBody
import com.app.kotlinloginviewmodel.remote.RetrofitClient
import com.app.kotlinloginviewmodel.ui.ViewModelFactory
import com.app.kotlinloginviewmodel.util.Status
import com.app.kotlinloginviewmodel.viewmodel.LoginViewModel

class MainActivity : AppCompatActivity() {
    private var loginViewModel: LoginViewModel? = null
    lateinit var activityMainBinding: ActivityMainBinding
    /*var userName = "ajay21@yopmail.com"
    var password ="Test@1234"
    var fcmToken ="adfssafdskfdajfdlkfjdfjfljdffaff"*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // activityMainBinding. = this
        //loginViewModel = ViewModelProviders.of(this).get<LoginViewModel>(LoginViewModel::class.java)

        /*provide login parameters from here  validate from a function*/
        setupViewModel()
        //setUpObserver()
    }
    fun addUser() {
        openAddMessageDialog()
    }

    private fun openAddMessageDialog() {
        Toast.makeText(this, "HI", Toast.LENGTH_LONG).show()

    }
    private fun retrieveList(user: ArrayList<LoginModel?>) {
        //if (user.size > 0) {
        Log.e("TAG", "retrieveList: "+user.get(0)?.accessToken )
        //}
    }
    private fun setupViewModel() {
        loginViewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(RetrofitClient.apiClient().create(LoginApiService::class.java))
        ).get(LoginViewModel::class.java)
    }

    /*fun onLoginClick(view: View) {
        //  private fun setUpObserver() {
       *//* var userName=activityMainBinding.txtEmailAddress.text.toString()
        var password = activityMainBinding.txtPassword.text.toString()
        var fcmToken="Test"
        val body = LoginBody(userName,
            password, fcmToken)*//*
        loginViewModel?.loginUser()?.observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {
                        //showProgress(false)
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                        resource.data.let { call -> it }
                        resource.data.let { println("$it") }
                        resource.data?.let { retrieveList(it as ArrayList<LoginModel?>) }
                        //resource.data?.let { users -> retrieveList(users as ArrayList<LoginModel?>) }
                        //  Toast.makeText(this, it.data, Toast.LENGTH_LONG).show()
                        Log.d("Success","Success")
                    }
                    Status.ERROR -> {
                        // showProgress(false)
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                        Log.d("Error","Error")
                    }
                    Status.LOADING -> {
                        // showProgress(true)
                    }
                }

            }
        })
    }
*/

    /* private fun setUpObserver() {
         var userName=activityMainBinding.txtEmailAddress.text.toString()
         var password = activityMainBinding.txtPassword.text.toString()
         var fcmToken="Test"
         val body = LoginBody(userName,
             password, fcmToken)
              loginViewModel?.loginUser(body)?.observe(this, Observer {
                  it?.let { resource ->
                      when (resource.status) {
                          Status.SUCCESS -> {
                              //showProgress(false)
                              Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                              resource.data.let { call -> it }
                              resource.data.let { println("$it") }
                              resource.data?.let { retrieveList(it as ArrayList<LoginModel?>) }
                              //resource.data?.let { users -> retrieveList(users as ArrayList<LoginModel?>) }
                              //  Toast.makeText(this, it.data, Toast.LENGTH_LONG).show()
                              Log.d("Success","Success")
                          }
                          Status.ERROR -> {
                             // showProgress(false)
                              Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                              Log.d("Error","Error")
                          }
                          Status.LOADING -> {
                             // showProgress(true)
                          }
                      }

                  }
              })
          }*/

    /*  fun onLoginClick(view: View) {
    //  private fun setUpObserver() {
              loginViewModel?.loginUser()?.observe(this, Observer {
                  it?.let { resource ->
                      when (resource.status) {
                          Status.SUCCESS -> {
                              //showProgress(false)
                              Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                              resource.data.let { call -> it }
                              resource.data.let { println("$it") }
                              resource.data?.let { retrieveList(it as ArrayList<LoginModel?>) }
                              //resource.data?.let { users -> retrieveList(users as ArrayList<LoginModel?>) }
                              //  Toast.makeText(this, it.data, Toast.LENGTH_LONG).show()
                              Log.d("Success","Success")
                          }
                          Status.ERROR -> {
                             // showProgress(false)
                              Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                              Log.d("Error","Error")
                          }
                          Status.LOADING -> {
                             // showProgress(true)
                          }
                      }

                  }
              })
          }*/
    //  }
    /* private fun doLogin() {//Observer<LoginUser>()
         loginViewModel?.loginUser()?.observe(this, object : Observer<List<LoginModel?>>() {
             override fun onChanged(t: List<LoginModel?>?) {
                 TODO("Not yet implemented")
             }

         })
     }*/

    /* private fun showProgress(status: Boolean) {
         if (status) {
             activityMainBinding.showProgress.visibility = View.VISIBLE
         } else {
             activityMainBinding.showProgress.visibility = View.GONE
         }
     }*/
}