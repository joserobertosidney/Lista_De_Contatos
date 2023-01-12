package com.example.lista_modulo10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lista_modulo10.databinding.ItemBinding

class ListAdapter (
    val list: MutableList<ContactList>,
    val listener : AdapterList
        ):RecyclerView.Adapter<ListAdapter.ListItemViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(
        ItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false

          )
        )
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        var item = list[position]

        holder.posicao.text = position.toString()
        holder.nome.text = item.name
        holder.numero.text = item.number

        holder.root.setOnClickListener{
            listener.click(item.adress)
        }
    }

    override fun getItemCount(): Int {
        return list.size

    }

    class ListItemViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){

        var root = binding.root
        var posicao = binding.position
        var nome = binding.name
        var numero = binding.numbers
    }

    interface AdapterList {
        fun click (content : String);
    }
        }
