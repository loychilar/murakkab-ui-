package com.example.murakkabui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.murakkabui.R
import com.example.murakkabui.RvAdapter
import com.example.murakkabui.databinding.ActivityMainBinding
import com.example.murakkabui.models.Rasmlar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var list:ArrayList<Rasmlar>
    private lateinit var RvAdamters: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()
        addFiles()

        RvAdamters= RvAdapter(this,list,object :RvAdapter.RvClick{
            override fun onClick(rasmlar: Rasmlar) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                rasmlar.ismi
                startActivity(intent)
            }

        })

        binding.rv.adapter=RvAdamters
    }
    private fun addFiles() {
        list.add(Rasmlar(R.drawable.ph, "Avegers","Views: 500","Release Date: 16 Feb 2018"))
        list.add(Rasmlar(R.drawable.photo, "Avengers:Age of Ultron","Views: 400","Release Date: 17 March 2018"))
        list.add(Rasmlar(R.drawable.temirbosh, "Iron Man 3","Views: 550","Release Date: 17 April 2018"))
        list.add(Rasmlar(R.drawable.prtbtr, "Avengers: Infinity War","Views: 1500","Release Date: 15 Jan 2018"))
        list.add(Rasmlar(R.drawable.pot, "Olma","Views: 5006","Release Date: 17 March 2018"))
        list.add(Rasmlar(R.drawable.phot, "gbgb","Views: 50034","Release Date: 17 March 2018"))
    }
}