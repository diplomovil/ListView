package com.amaurypm.listview.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.amaurypm.listview.databinding.ElementoListaBinding
import com.amaurypm.listview.model.Anime

/**
 * Creado por Amaury Perea Matsumura el 14/10/22
 */
class Adaptador(private val contexto: Context, val datos: ArrayList<Anime>): BaseAdapter() {

    private val layoutInflater = LayoutInflater.from(contexto)

    override fun getCount(): Int {
        return datos.size
    }

    override fun getItem(position: Int): Any {
        return datos[position]
    }

    override fun getItemId(position: Int): Long {
        return datos[position].id
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding = ElementoListaBinding.inflate(layoutInflater)

        with(binding) {
            tvTitulo.text = datos[position].titulo
            tvTipo.text = datos[position].tipo
            tvFecha.text = datos[position].fecha
        }

        return binding.root
    }
}