package com.example.fragment_life_cycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

//var fragment1button: Button?=null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment,firstFragment)
            commit()
        }
        val btnFirstFragment = findViewById<Button>(R.id.btnFirstFragment)
        val btnSecondFragment = findViewById<Button>(R.id.btnSecondFragment)
        btnFirstFragment?.setOnClickListener(View.OnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment,firstFragment)
                commit()
            }
        })
        btnSecondFragment?.setOnClickListener(View.OnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment,secondFragment)
                commit()
            }
        })

    }


}
