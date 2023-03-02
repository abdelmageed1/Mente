package com.example.mente.Specialist

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mente.Authentication.AuthenticationViewModel.AuthVM
import com.example.mente.R
import com.example.mente.databinding.ActivityHomeSpecialistBinding
import com.google.android.material.navigation.NavigationView

class HomeSpecialistActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityHomeSpecialistBinding
    lateinit var authVM: AuthVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeSpecialistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        authVM = ViewModelProvider(this)[AuthVM::class.java]
        authVM.getSpecialistUserInfo()

        // set Navigation Drawer
        setAppBarAndNavigationDrawer()

         setUserNameInNavHeader()


    }









    private fun setUserNameInNavHeader() {

        var n = binding.navView.getHeaderView(0)
        var userName = n.findViewById<TextView>(R.id.tvUserNameInDrawer)
        var userEmail = n.findViewById<TextView>(R.id.tvUserEmailInDrawer)
         authVM.mGetSpecialistUserInfo.observe(this){
             userName.text ="${ it.fName.capitalize()} ${ it.lName.capitalize()}"
             userEmail.text = " ${it.email}"

         }

    }






    private fun setAppBarAndNavigationDrawer() {
        setSupportActionBar(binding.appBarHomeSpecialist.toolbar)


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_home_specialist)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment, R.id.aboutUsFragment, R.id.connectUsFragment, R.id.ratingFragment
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_home_specialist)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }



}