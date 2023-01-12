package com.example.lista_modulo10

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lista_modulo10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() ,ListAdapter.AdapterList{

    private lateinit var binding: ActivityMainBinding
    private var listaDeContato :MutableList<ContactList> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val listView = binding.listaTelefones

        onList()

        listView.layoutManager = LinearLayoutManager (this)
        listView.adapter = ListAdapter(listaDeContato,this)
    }

    private fun onList (){

        listaDeContato.add(ContactList( "Marcos", "999999999","teste@test1"))
        listaDeContato.add(ContactList( "Joao", "999999998","teste@test2"))
        listaDeContato.add(ContactList( "Pina", "999999997","teste@test3"))
        listaDeContato.add(ContactList( "Kennedy", "999999996","teste@test4"))
        listaDeContato.add(ContactList( "Rafael", "999999995","teste@test5"))
        repeat(50){listaDeContato.add(ContactList.aleatorio())}



    }


    override fun click(content: String) {
        Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show()
    }

}