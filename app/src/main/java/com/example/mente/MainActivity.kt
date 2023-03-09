package com.example.mente

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mente.Authentication.AuthenticationViewModel.AuthVM
import com.example.mente.Authentication.Repo.AuthRepo
import com.example.mente.Authentication.Ui.Login
import com.example.mente.Parent.HomeParentActivity
import com.example.mente.Specialist.HomeSpecialistActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var authViewModel: AuthVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        authViewModel = ViewModelProvider(this)[AuthVM::class.java]

        var currentuser = AuthRepo.getInstance().getCurrentUser()
         GlobalScope.launch(Dispatchers.Main) {
            delay(1500)
            if (currentuser == null)
             {
                goToLogin()
             }

            else {
           //     authViewModel.mGetUserInfo.observe(this@MainActivity){
                   //    if(it.type == constant.userTypeSpecialist)
                                 goToHomeSpecialist()
                     //    else
                     //         goToHomeParent()
                     //    }

                }
            }


        }



    private fun goToLogin() {
        var intent = Intent(this, Login::class.java)
        startActivity(intent)
        finish()
    }
    private fun goToHomeSpecialist() {
        var intent = Intent(this, HomeSpecialistActivity::class.java)
        startActivity(intent)
        finish()
    }
    private fun goToHomeParent() {
        var intent = Intent(this, HomeParentActivity::class.java)
        startActivity(intent)
        finish()
    }


}