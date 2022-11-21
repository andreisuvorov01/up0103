package com.example.personal_computer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.personal_computer.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Personal_computer)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.placeholder1,BlankFragment.newInstance()).commit()
        binding.navigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.action_search -> {
                    supportFragmentManager.beginTransaction().replace(R.id.placeholder1,BlankFragment.newInstance()).commit()
                    true
                }
                R.id.action_settings ->{
                    supportFragmentManager.beginTransaction().replace(R.id.placeholder1,type_hardware.newInstance()).commit()
                    true
                }
                R.id.action_navigation ->{
                    supportFragmentManager.beginTransaction().replace(R.id.placeholder1,setting.newInstance()).commit()
                    true
                }
                else -> {
                true}
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
        }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId){
                R.id.home ->{
                    supportFragmentManager.beginTransaction().replace(R.id.placeholder1,BlankFragment.newInstance()).commit()
                    /*intent = Intent(this@MainActivity,info::class.java)
                    startActivity(intent)*/
                }
                R.id.info ->{
                    supportFragmentManager.beginTransaction().replace(R.id.placeholder1,fragment_info.newInstance()).commit()
                }
            }
        return super.onOptionsItemSelected(item)
    }


}
