package com.arhsxro.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.commit
import com.arhsxro.recordkeeper.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomNav.setOnItemSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbar,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.reset_running -> {
                Toast.makeText(this,"RESET RUNNING",Toast.LENGTH_LONG).show()
                true
            }
            R.id.reset_cycling -> {
                Toast.makeText(this,"RESET CYCLING",Toast.LENGTH_LONG).show()
                true
            }
            R.id.reset_all -> {
                Toast.makeText(this,"RESET ALL",Toast.LENGTH_LONG).show()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

    private fun onRunningClicked() {

        supportFragmentManager.commit {

            replace(R.id.frame_content,RunningFragment())

        }
    }

    private fun onCyclingClicked() {

        supportFragmentManager.commit {

            replace(R.id.frame_content,CyclingFragment())

        }
    }

    override fun onNavigationItemSelected(item: MenuItem) = when(item.itemId){
        R.id.nav_running -> {
            onRunningClicked()
            true
        }
        R.id.nav_cycling -> {
            onCyclingClicked()
            true
        }
        else -> false
    }
}