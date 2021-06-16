package com.example.xmovieapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.Fragments.BlankFragmentHorizontalRV
import com.example.Fragments.BlankFragmentVerticalRV

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

        supportFragmentManager.beginTransaction()
            .add(R.id.containerHorizontalFragment, BlankFragmentHorizontalRV())
            .add(R.id.containerVerticalFragment, BlankFragmentVerticalRV())
            .commit()
    }
}