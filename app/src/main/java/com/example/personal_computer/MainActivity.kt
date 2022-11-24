package com.example.personal_computer

import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Resources.Theme
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.core.content.res.ResourcesCompat.ThemeCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.personal_computer.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dataModels : ViewModel1 by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Personal_computer)
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode())
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dataModels.name.observe(this,{})
        dataModels.cena.observe(this,{})
        dataModels.Spec.observe(this,{})
        dataModels.img.observe(this,{})
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        supportFragmentManager.beginTransaction()
            .replace(R.id.placeholder1, BlankFragment.newInstance()).commit()
        binding.navigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.action_search -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.placeholder1, BlankFragment.newInstance()).commit()
                    true
                }
                R.id.action_settings -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.placeholder1, type_hardware.newInstance()).commit()
                    true
                }
                R.id.action_navigation -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.placeholder1, setting.newInstance()).commit()
                    true
                }
                else -> {
                    true
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.placeholder1, BlankFragment.newInstance()).commit()
            }
            R.id.info -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.placeholder1, fragment_info.newInstance()).commit()
            }
            R.id.darkTheme ->{
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES)
            }
            R.id.lightTheme ->{
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
