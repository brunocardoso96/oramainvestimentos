package com.brunowcnascimento.oramainvestimentos.ui.feature.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brunowcnascimento.oramainvestimentos.R
import com.brunowcnascimento.oramainvestimentos.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}