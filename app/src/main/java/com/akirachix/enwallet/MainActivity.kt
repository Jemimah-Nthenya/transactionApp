package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.rvRecyclers.layoutManager=LinearLayoutManager(this)

    }
    fun authorsDisplay(){

        val author5=transaction_list
        val author6=transaction_list
        val author7=transaction_list
        val author8=transaction_list
        val author9=transaction_list
        val author10=transaction_list


        val transactionList=(transaction)
        binding.rvRecyclers.adapter=transactionList
