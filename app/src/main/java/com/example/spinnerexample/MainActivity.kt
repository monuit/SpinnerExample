package com.example.spinnerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autoMakers = arrayOf("Benz", "BMW", "Honda", "Ford", "Toyota")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, autoMakers)
        val mySpinner = findViewById<Spinner>(R.id.spinner)
        mySpinner.adapter = arrayAdapter
        val resultText = findViewById<TextView>(R.id.textView)
        mySpinner.onItemSelectedListener = object :
            AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                resultText.text = autoMakers[position]
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                resultText.text = autoMakers[position]
            }


            override fun onNothingSelected(parent: AdapterView<*>?) {
                resultText.text = "Please select an automaker!"
            }

        }

    }
}