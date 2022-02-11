package com.example.notetakingapp

import android.os.Bundle
import android.text.SpannableStringBuilder
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.notetakingapp.databinding.ActivityMainBinding
import com.example.notetakingapp.models.NoteFile
import com.example.notetakingapp.models.sqlite.DatabaseHelper

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //val dbHelper = DatabaseHelper(this)
        //val note = NoteFile("my title", null, "my folder")

        val newNote = NoteFile("New Note", SpannableStringBuilder("Test"), "DefaultFolder", this)
        //Log.d("DATE TEST", newNote.dateToISO(newNote.lastModifiedDate))
    }
}