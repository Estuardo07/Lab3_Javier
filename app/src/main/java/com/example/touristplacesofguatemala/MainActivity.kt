package com.example.touristplacesofguatemala

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flag = true

        star_button.setOnClickListener{
            when (flag) {
                true -> {
                    name_hide.setText(name_edit_text.text)
                    name_hide.visibility = View.VISIBLE
                    name_edit_text.visibility = View.GONE
                    name_text.visibility = View.GONE
                    flag = false
                }
                false -> {
                    name_hide.text = ""
                    name_hide.visibility = View.GONE
                    name_edit_text.visibility = View.VISIBLE
                    name_text.visibility = View.VISIBLE

                    flag = true
                }
            }
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken, 0)
        }

        atitlan.setOnClickListener{
            startActivity(Intent(this, DetailActivity::class.java))
            finish()
        }
    }
}
