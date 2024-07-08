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
        val author1=MyAuthorsBlog("Colan","Blossoms","2025","")
        val author2=MyAuthorsBlog("Colan","Blossoms","2025","")
        val author3=MyAuthorsBlog("Colan","Blossoms","2025","")
        val author4=MyAuthorsBlog("Colan","Blossoms","2025","")
        val author5=transaction_list("Colan","Blossoms","2025","")
        val author6=transaction_list("Colan","Blossoms","2025","")
        val author7=transaction_list("Colan","Blossoms","2025","")
        val author8=transaction_list("Colan","Blossoms","2025","")
        val author9=transaction_list("Colan","Blossoms","2025","")
        val author10=transaction_list("Colan","Blossoms","2025","")

        val authors= listOf(author1,author2,author3,author4,author5,author6,author7,author8,author9,author10)
        val transactionList=(authors)
        binding.rvRecyclers.adapter=transactionList
