package com.example.week05day03hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val price = 100.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printFullName("Ahmad","Khalid","Ali")

        price.calculateVAT()
    }

    private fun printFullName(vararg fullName:String){
        var fNameString:String = ""

        for(name in fullName){
            fNameString = fNameString +" "+ name
        }

        Toast.makeText(this,fNameString,Toast.LENGTH_LONG).show()
    }

    private fun Double.calculateVAT(){
        val percentAmount = this * 0.15
        val finalAmount = percentAmount+this

        Toast.makeText(this@MainActivity,finalAmount.toString(),Toast.LENGTH_LONG).show()
    }
}