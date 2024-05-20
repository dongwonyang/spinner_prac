package com.example.spinner_prac

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spinner_prac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initSpinner()
    }

    private fun initSpinner() = with(binding){
        val spinnerArray = resources.getStringArray(R.array.category)
        spinner.adapter = ArrayAdapter.createFromResource(this@MainActivity, R.array.category, R.layout.item_spinner)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when(position){
                    //Gaming
                    0 -> {
                        tv.text = spinnerArray[0]
                    }
                    //Music
                    1 -> {
                        tv.text = spinnerArray[1]
                    }
                    //Pets/Animals
                    2 -> {
                        tv.text = spinnerArray[2]
                    }
                    //Sport
                    3 -> {
                        tv.text = spinnerArray[3]
                    }
                    //Movies
                    4 -> {
                        tv.text = spinnerArray[4]
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }
}