package com.brunowcnascimento.oramainvestimentos.ui.feature.detail.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.brunowcnascimento.oramainvestimentos.data.model.FundDetail
import com.brunowcnascimento.oramainvestimentos.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var fundDetail: FundDetail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
    }

    private fun initialize() {
        getFundDetail()
    }

    private fun getFundDetail() {

        intent.getSerializableExtra(fundDetailTag).run {
            fundDetail = this as FundDetail
        }
    }

    companion object {
        val fundDetailTag: String = DetailActivity::class.java.simpleName
        fun getStartIntent(context: Context): Intent {
            return Intent(context, DetailActivity::class.java)
        }
    }
}