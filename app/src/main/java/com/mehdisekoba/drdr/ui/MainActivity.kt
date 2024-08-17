package com.mehdisekoba.drdr.ui

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.mehdisekoba.drdr.R
import com.mehdisekoba.drdr.databinding.ActivityMainBinding
import com.mehdisekoba.drdr.utils.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@Suppress("DEPRECATION")
class MainActivity : BaseActivity() {
    //binding
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    //other
    private lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL
        navHost = supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        // bottom nav
        binding.bottomNav.apply {
            setupWithNavController(navHost.navController)
            setOnNavigationItemReselectedListener {}
        }
        // Gone bottom menu
        navHost.navController.addOnDestinationChangedListener { _, destination, _ ->
            binding.apply {
                when (destination.id) {
                    R.id.splashFragment -> bottomNav.isVisible = false
                    else -> bottomNav.isVisible = true
                }
            }
        }
    }

    override fun onNavigateUp() =
        navHost.navController.navigateUp() || super.onNavigateUp()


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}