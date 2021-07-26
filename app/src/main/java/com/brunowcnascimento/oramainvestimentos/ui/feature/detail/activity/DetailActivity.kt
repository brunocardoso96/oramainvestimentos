package com.brunowcnascimento.oramainvestimentos.ui.feature.detail.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.brunowcnascimento.oramainvestimentos.data.model.FundDetail
import com.brunowcnascimento.oramainvestimentos.databinding.ActivityDetailBinding
import com.brunowcnascimento.oramainvestimentos.helper.formatCurrency
import com.brunowcnascimento.oramainvestimentos.helper.formatPercent
import com.brunowcnascimento.oramainvestimentos.helper.formatTimeHHmm

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
        setFundDetail()
    }

    private fun getFundDetail() {
        intent.getSerializableExtra(tagFundDetail).run {
            fundDetail = this as FundDetail
        }
    }

    private fun setFundDetail() {
        binding.run {
            monthPercent.text = fundDetail.profitabilityLast12Months?.formatPercent()
            yearPercent.text = fundDetail.profitabilityLastYear?.formatPercent()
            twelvePercent.text = fundDetail.profitabilityLast12Months?.formatPercent()
            retrievalDate.text = fundDetail.retrievalQuotation
            minimalRetrievalValor.text = fundDetail.subsequentRetrieval?.formatCurrency()
            minimumBalance.text = fundDetail.minimumBalancePermanence?.formatCurrency()
            firstApplication.text = fundDetail.minimumInitialApplication?.formatCurrency()
            applicationMinimum.text = fundDetail.minimumApplication?.formatCurrency()
            dayConvert.text = fundDetail.applicationQuotationDays
            hourApplication.text = fundDetail.applicationTimeLimit?.formatTimeHHmm()
        }
    }

    companion object {
        val tagFundDetail: String = DetailActivity::class.java.simpleName
        fun getStartIntent(context: Context): Intent {
            return Intent(context, DetailActivity::class.java)
        }
    }
}