package com.amaurypm.listview.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amaurypm.listview.R
import com.amaurypm.listview.databinding.ActivityMainBinding
import com.amaurypm.listview.model.Anime
import com.amaurypm.listview.view.adapters.Adaptador

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datos = ArrayList<Anime>()

        for(i in 1..20){
            val animeTmp = Anime(i.toLong(), "Título $i", "Tipo $i", "Fecha $i")
            datos.add(animeTmp)
        }

        val adaptador = Adaptador(this@MainActivity, datos)

        binding.lv.adapter = adaptador

    }
}