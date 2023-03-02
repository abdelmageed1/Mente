package com.example.mente.Parent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mente.R
import com.example.mente.databinding.ActivityHomeParentBinding
import com.google.android.material.navigation.NavigationView

class HomeParentActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityHomeParentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeParentBinding.inflate(layoutInflater)
        setContentView(binding.root)

         setAppBarAndNavigationDrawer()






    }





    private fun setAppBarAndNavigationDrawer() {

        setSupportActionBar(binding.appBarHomeParent.toolbar)
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_home_parent)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home_parent, R.id.nav_about_parent  , R.id.nav_setting_parent , R.id.nav_connectus_parent  , R.id.nav_ratting_parent
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_home_parent)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


}