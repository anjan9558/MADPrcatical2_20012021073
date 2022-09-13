package com.example.madprcatical2_20012021073

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG, "onCreate method is called: ")
        Toast.makeText(this, "onCreate method is called:", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl, "onCreate method is called:", Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart method is called: ")
        Toast.makeText(this, "onStart method is called:", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl, "onStart method is called:", Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume method is called: ")
        Toast.makeText(this, "onResume method is called:", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl, "onResume method is called:", Snackbar.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause method is called: ")
        Toast.makeText(this, "onPause method is called:", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl, "onPause method is called:", Snackbar.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop method is called: ")
        Toast.makeText(this, "onStop method is called:", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl, "onStop method is called:", Snackbar.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy method is called: ")
        Toast.makeText(this, "onDestroy method is called:", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl, "onDestroy method is called:", Snackbar.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart method is called: ")
        Toast.makeText(this, "onRestart method is called:", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl, "onRestart method is called:", Snackbar.LENGTH_LONG).show()
    }
}