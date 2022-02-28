package com.kemalurekli.fastlist.view

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.MutableLiveData
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kemalurekli.fastlist.R
import com.kemalurekli.fastlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var toggle : ActionBarDrawerToggle
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = Firebase.auth
        val drawerLayout : DrawerLayout = binding.drawerLayout
        val navView : NavigationView = binding.navView
        val currentUser = auth.currentUser
        toggle = ActionBarDrawerToggle(this,drawerLayout, R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val profileMenu = navView.inflateHeaderView(R.layout.nav_header)


        //if user sign-in
        if (currentUser != null){
            profileMenu.findViewById<View>(R.id.layout_before_sign_in).visibility = View.GONE
            profileMenu.findViewById<TextView>(R.id.tv_after_sign_in_user_email).text = auth.currentUser!!.email.toString()
        } else {
            profileMenu.findViewById<TextView>(R.id.tv_after_sign_in_user_name).visibility = View.GONE
            profileMenu.findViewById<TextView>(R.id.tv_after_sign_in_user_email).visibility = View.GONE
        }




        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    binding.fragmentContainerView.findNavController().navigate(R.id.action_global_profileFragment)
                    true
                }
                R.id.nav_login -> {
                    Navigation.findNavController(navView).navigate(HomeFragmentDirections.actionHomeFragmentToSignInFragment())
                    true
                }
                R.id.nav_setting -> {
                    Navigation.findNavController(navView).navigate(HomeFragmentDirections.actionHomeFragmentToProfileFragment())
                    true
                }
                else -> {
                    true
                }
            }
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
            }
        return super.onOptionsItemSelected(item)
        }


    private fun HideMenuItemsBeforeSignIn () {

    }






    }

