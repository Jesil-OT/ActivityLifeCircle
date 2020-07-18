package com.room.ps.activitylifecircle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleObserver
import timber.log.Timber

const val TIME_OUT = 1500

class HomeActivity : AppCompatActivity(), LifecycleObserver{
    lateinit var button: Button
    private lateinit var dessertTimer: DessertTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        Timber.i("Application onCreated")
        button = findViewById(R.id.button_signUp)
        dessertTimer = DessertTimer(this.lifecycle)
//        dessertTimer.startTimer()

        /**Handler().postDelayed({
              button.isEnabled = true
        },TIME_OUT.toLong())
        */
    }

    override fun onStart() {
        super.onStart()
        Timber.i("Application onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("Application onResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("Application onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("Application onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("Application onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("Application onDestroy")
    }
}