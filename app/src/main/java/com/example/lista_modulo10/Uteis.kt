package com.example.lista_modulo10

import android.content.Context
import android.content.res.Resources
import android.hardware.biometrics.BiometricManager.Strings
import java.io.File

fun readInput(name: String) = File("./res/raw", "$name.csv")
    .readLines()

fun readNames(): List<String>{
   return  readInput("random_names")
}
fun astf (context: Context){
    context.resources
}
