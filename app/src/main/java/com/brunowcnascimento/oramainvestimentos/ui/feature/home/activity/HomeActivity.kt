package com.brunowcnascimento.oramainvestimentos.ui.feature.home.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.brunowcnascimento.oramainvestimentos.data.repository.HomeRepository
import com.brunowcnascimento.oramainvestimentos.databinding.ActivityHomeBinding
import com.brunowcnascimento.oramainvestimentos.ui.feature.detail.activity.DetailActivity
import com.brunowcnascimento.oramainvestimentos.ui.feature.home.adapter.HomeAdapter
import com.brunowcnascimento.oramainvestimentos.ui.feature.home.viewmodel.HomeViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var viewModel: HomeViewModel
    private lateinit var recyclerViewHome: RecyclerView
    private lateinit var adapterHome: HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
        viewModel.getFundDetail()
    }

    private fun initialize() {
        viewBind()
        setupViewModel()
        observerFunDetail()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this, HomeViewModel.HomeViewModelFactory(HomeRepository()))
            .get(HomeViewModel::class.java)

    }

    private fun observerFunDetail() {
        viewModel.fundDetailLiveData.observe(this) {
            adapterHome = HomeAdapter(it) { fundDetail ->
                val intent = DetailActivity.getStartIntent(applicationContext)
                intent.putExtra(DetailActivity.fundDetailTag, fundDetail)
                startActivity(intent)
            }
            setupRecycler()
        }
    }

    private fun setupRecycler() {
        recyclerViewHome.run {
            layoutManager = LinearLayoutManager(this@HomeActivity, RecyclerView.VERTICAL, false)
            adapter = adapterHome
        }
    }

    private fun viewBind(){
        recyclerViewHome = binding.rvHome
    }
}