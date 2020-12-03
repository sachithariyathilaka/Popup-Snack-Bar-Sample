package com.sachith.popupsnackbarsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sachith.popupsnackbar.PopupSnackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setup UI
        init()
    }

    private fun init() {
        supportActionBar?.hide()
        success.setOnClickListener { PopupSnackbar().snackBar(this,activity_main, "This is success message", 0) }
        waiting.setOnClickListener { PopupSnackbar().snackBar(this,activity_main, "This is waiting message", 1) }
        error.setOnClickListener { PopupSnackbar().snackBar(this,activity_main, "This is error message", 2) }
    }
}