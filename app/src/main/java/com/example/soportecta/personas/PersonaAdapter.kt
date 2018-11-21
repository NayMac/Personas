package com.example.soportecta.personas

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.single_person.view.*
import org.w3c.dom.Text

class PersonaAdapter (personas:ArrayList<Persona>, contexto:Context):RecyclerView.Adapter<PersonaAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PersonaAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: PersonaAdapter.ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista){
            var imagen:ImageView? = null
            var nombre:TextView? = null
            var genero:TextView?=null
            init {
            imagen = itemView.ivFoto
                

            }
    }


}