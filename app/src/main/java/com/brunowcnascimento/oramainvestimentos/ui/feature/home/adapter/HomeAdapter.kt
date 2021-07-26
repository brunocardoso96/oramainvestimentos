package com.brunowcnascimento.oramainvestimentos.ui.feature.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.brunowcnascimento.oramainvestimentos.helper.formatCurrency
import com.brunowcnascimento.oramainvestimentos.helper.formatPercent
import com.brunowcnascimento.oramainvestimentos.helper.setBarColor
import com.brunowcnascimento.oramainvestimentos.data.model.FundDetail
import com.brunowcnascimento.oramainvestimentos.databinding.RvCardFundBinding

class HomeAdapter(
    private val listFundDetail: List<FundDetail>,
    private val onItemClickListener: (list: FundDetail) -> Unit
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            RvCardFundBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val listFund = listFundDetail[position]
        with(holder.binding) {
            strategy.text = listFund.name
            specification.text = listFund.specification
            simpleName.text = listFund.simpleName
            minInitApplication.text = listFund.minimumApplication?.formatCurrency()
            percent.text = listFund.profitabilityLast12Months?.formatPercent()
            barLeft.setBarColor(listFund.risk)
            cardFund.setOnClickListener {
                onItemClickListener.invoke(listFund)
            }
        }
    }

    override fun getItemCount(): Int = listFundDetail.size

    class HomeViewHolder(val binding: RvCardFundBinding): RecyclerView.ViewHolder(binding.root)
}