package com.example.lista_modulo10

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lista_modulo10.databinding.ActivityMainBinding
import faker.com.fasterxml.jackson.databind.util.ClassUtil.name
import io.github.serpro69.kfaker.faker

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
        val faker = faker {  }

        repeat(500){ listaDeContato.add(ContactList("${faker.name.firstName()}","${faker.phoneNumber.cellPhone.number()}","${faker.address.city()}"))}
    }


    override fun click(content: String) {
        Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show()
    }

}