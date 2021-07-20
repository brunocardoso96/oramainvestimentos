package com.brunowcnascimento.oramainvestimentos.ui.feature.home.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.brunowcnascimento.oramainvestimentos.data.repository.HomeRepository
import com.brunowcnascimento.oramainvestimentos.databinding.ActivityHomeBinding
import com.brunowcnascimento.oramainvestimentos.ui.feature.home.viewmodel.HomeViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var viewModel: HomeViewModel
    private val TAG = HomeActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()

    }

    private fun initialize() {
        setupActionBar()
        setupViewModel()
    }

    private fun setupActionBar() {
        supportActionBar?.hide()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this, HomeViewModel.HomeViewModelFactory(HomeRepository()))
            .get(HomeViewModel::class.java)

        viewModel.fundDetailLiveData.observe(this) {
            it.forEach {
                Log.d(TAG, it.toString())
            }
        }
        viewModel.getFundDetail()
    }
}