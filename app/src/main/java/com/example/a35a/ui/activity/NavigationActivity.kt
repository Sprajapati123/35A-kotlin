package com.example.a35a.ui.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.a35a.R
import com.example.a35a.databinding.ActivityNavigationBinding
import com.example.a35a.ui.fragment.HomeFragment
import com.example.a35a.ui.fragment.NotificationFragment
import com.example.a35a.ui.fragment.ProfileFragment
import com.example.a35a.ui.fragment.SearchFragment

class NavigationActivity : AppCompatActivity() {
    lateinit var binding: ActivityNavigationBinding


     fun replaceFragment(fragment: Fragment) {
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction =
            fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameNavigation,fragment)
        fragmentTransaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {menu->
            when(menu.itemId){
                R.id.navHome -> replaceFragment(HomeFragment())
                R.id.navSearch -> replaceFragment(SearchFragment())
                R.id.navNotification -> replaceFragment(NotificationFragment())
                R.id.navProfile -> replaceFragment(ProfileFragment())
                    else -> {}
            }
            true
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }
    }
}