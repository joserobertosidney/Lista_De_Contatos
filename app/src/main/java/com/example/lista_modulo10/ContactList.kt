package com.example.lista_modulo10

import android.provider.ContactsContract.CommonDataKinds.Email
import kotlin.random.Random

data class ContactList(
    var name : String,
    var number: String,
    var email: String
){
    companion object{
        fun aleatorio (): ContactList{

            return ContactList(name = readNames().get( Random.nextInt(500)) ,"","")
        }
    }
}

