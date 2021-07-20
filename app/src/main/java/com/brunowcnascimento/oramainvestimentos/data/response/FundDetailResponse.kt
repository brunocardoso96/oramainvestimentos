package com.brunowcnascimento.oramainvestimentos.data.response

import com.google.gson.annotations.SerializedName

data class FundDetailResponse(

	@SerializedName("FundDetailResponse")
	val fundDetailResponse: List<FundDetailResponseItem>
)

data class Specification(

	@SerializedName("fund_main_strategy_name")
	val fundMainStrategyName: String,

	@SerializedName("fund_risk_profile")
	val fundRiskProfile: FundRiskProfile,

	@SerializedName("fund_main_strategy_explanation")
	val fundMainStrategyExplanation: String,

	@SerializedName("fund_class")
	val fundClass: String,

	@SerializedName("fund_main_strategy")
	val fundMainStrategy: FundMainStrategy,

	@SerializedName("fund_suitability_profile")
	val fundSuitabilityProfile: FundSuitabilityProfile,

	@SerializedName("fund_type")
	val fundType: String,

	@SerializedName("fund_class_anbima")
	val fundClassAnbima: String,

	@SerializedName("fund_macro_strategy")
	val fundMacroStrategy: FundMacroStrategy,

	@SerializedName("is_qualified")
	val isQualified: Boolean
)

data class PerformanceVideosItem(

	@SerializedName("thumbnail")
	val thumbnail: String,

	@SerializedName("enabled_for_tvorama")
	val enabledForTvorama: Boolean,

	@SerializedName("description")
	val description: String,

	@SerializedName("published")
	val published: String,

	@SerializedName("id")
	val id: Int,

	@SerializedName("title")
	val title: String,

	@SerializedName("youtube_id")
	val youtubeId: String,

	@SerializedName("url")
	val url: String
)

data class FundSuitabilityProfile(

	@SerializedName("score_range_order")
	val scoreRangeOrder: Int,

	@SerializedName("name")
	val name: String
)

data class FundDetailResponseItem(

	@SerializedName("closing_date")
	val closingDate: Any,

	@SerializedName("fees")
	val fees: Fees,

	@SerializedName("quota_date")
	val quotaDate: String,

	@SerializedName("orama_standard")
	val oramaStandard: Boolean,

	@SerializedName("profitabilities")
	val profitabilities: Profitabilities,

	@SerializedName("fund_manager")
	val fundManager: FundManager,

	@SerializedName("documents")
	val documents: List<DocumentsItem>,

	@SerializedName("is_simple")
	val isSimple: Boolean,

	@SerializedName("fund_situation")
	val fundSituation: FundSituation,

	@SerializedName("description")
	val description: Description,

	@SerializedName("target_fund")
	val targetFund: Any,

	@SerializedName("cnpj")
	val cnpj: String,

	@SerializedName("description_seo")
	val descriptionSeo: String,

	@SerializedName("simple_name")
	val simpleName: String,

	@SerializedName("is_closed_to_capture")
	val isClosedToCapture: Boolean,

	@SerializedName("initial_date")
	val initialDate: String,

	@SerializedName("net_patrimony_12m")
	val netPatrimony12m: String,

	@SerializedName("id")
	val id: Int,

	@SerializedName("operability")
	val operability: Operability,

	@SerializedName("opening_date")
	val openingDate: Any,

	@SerializedName("slug")
	val slug: String,

	@SerializedName("is_closed")
	val isClosed: Boolean,

	@SerializedName("show_detailed_review")
	val showDetailedReview: Boolean,

	@SerializedName("insurance_company_code")
	val insuranceCompanyCode: Any,

	@SerializedName("performance_videos")
	val performanceVideos: List<Any>,

	@SerializedName("is_active")
	val isActive: Boolean,

	@SerializedName("volatility_12m")
	val volatility12m: String,

	@SerializedName("specification")
	val specification: Specification,

	@SerializedName("strategy_video")
	val strategyVideo: Any,

	@SerializedName("benchmark")
	val benchmark: Benchmark,

	@SerializedName("full_name")
	val fullName: String,

	@SerializedName("tax_classification")
	val taxClassification: String,

	@SerializedName("esg_seal")
	val esgSeal: Boolean,

	@SerializedName("performance_audios")
	val performanceAudios: List<Any>,

	@SerializedName("closed_to_capture_explanation")
	val closedToCaptureExplanation: String
)

data class Fees(

	@SerializedName("maximum_administration_fee")
	val maximumAdministrationFee: String,

	@SerializedName("anticipated_retrieval_fee_value")
	val anticipatedRetrievalFeeValue: String,

	@SerializedName("administration_fee")
	val administrationFee: String,

	@SerializedName("anticipated_retrieval_fee")
	val anticipatedRetrievalFee: String,

	@SerializedName("has_anticipated_retrieval")
	val hasAnticipatedRetrieval: Boolean,

	@SerializedName("performance_fee")
	val performanceFee: String
)

data class Benchmark(

	@SerializedName("name")
	val name: String,

	@SerializedName("id")
	val id: Int
)

data class FundMacroStrategy(

	@SerializedName("name")
	val name: String,

	@SerializedName("id")
	val id: Int,

	@SerializedName("explanation")
	val explanation: String
)

data class StrategyVideo(

	@SerializedName("thumbnail")
	val thumbnail: Any,

	@SerializedName("enabled_for_tvorama")
	val enabledForTvorama: Boolean,

	@SerializedName("description")
	val description: String,

	@SerializedName("published")
	val published: Any,

	@SerializedName("id")
	val id: Int,

	@SerializedName("title")
	val title: String,

	@SerializedName("youtube_id")
	val youtubeId: String,

	@SerializedName("url")
	val url: String
)

data class DocumentsItem(

	@SerializedName("name")
	val name: String,

	@SerializedName("position")
	val position: Int,

	@SerializedName("document_url")
	val documentUrl: String,

	@SerializedName("document_type")
	val documentType: String
)

data class FundManager(

	@SerializedName("full_name")
	val fullName: String,

	@SerializedName("name")
	val name: String,

	@SerializedName("description")
	val description: String,

	@SerializedName("logo")
	val logo: String,

	@SerializedName("id")
	val id: Int,

	@SerializedName("slug")
	val slug: String
)

data class Description(

	@SerializedName("strengths")
	val strengths: String,

	@SerializedName("target_audience")
	val targetAudience: String,

	@SerializedName("strategy")
	val strategy: String,

	@SerializedName("movie_url")
	val movieUrl: Any,

	@SerializedName("objective")
	val objective: String
)

data class FundSituation(

	@SerializedName("code")
	val code: String,

	@SerializedName("name")
	val name: String
)

data class FundRiskProfile(

	@SerializedName("score_range_order")
	val scoreRangeOrder: Int,

	@SerializedName("name")
	val name: String
)

data class Profitabilities(

	@SerializedName("m48")
	val m48: String,

	@SerializedName("m36")
	val m36: String,

	@SerializedName("month")
	val month: String,

	@SerializedName("year")
	val year: String,

	@SerializedName("m60")
	val m60: String,

	@SerializedName("day")
	val day: String,

	@SerializedName("m24")
	val m24: String,

	@SerializedName("m12")
	val m12: String
)

data class FundMainStrategy(

	@SerializedName("name")
	val name: String,

	@SerializedName("id")
	val id: Int,

	@SerializedName("explanation")
	val explanation: String,

	@SerializedName("fund_macro_strategy")
	val fundMacroStrategy: Int
)

data class Operability(

	@SerializedName("has_grace_period")
	val hasGracePeriod: Boolean,

	@SerializedName("has_operations_on_tuesdays")
	val hasOperationsOnTuesdays: Boolean,

	@SerializedName("anticipate_retrieval_liquidation_days_type")
	val anticipateRetrievalLiquidationDaysType: String,

	@SerializedName("has_operations_on_wednesdays")
	val hasOperationsOnWednesdays: Boolean,

	@SerializedName("anticipate_retrieval_liquidation_days_str")
	val anticipateRetrievalLiquidationDaysStr: String,

	@SerializedName("anticipated_retrieval_quotation_days_type")
	val anticipatedRetrievalQuotationDaysType: String,

	@SerializedName("anticipate_retrieval_liquidation_days")
	val anticipateRetrievalLiquidationDays: Int,

	@SerializedName("retrieval_special_type")
	val retrievalSpecialType: String,

	@SerializedName("maximum_initial_application_amount")
	val maximumInitialApplicationAmount: String,

	@SerializedName("grace_period_in_days_str")
	val gracePeriodInDaysStr: Any,

	@SerializedName("retrieval_quotation_days_type")
	val retrievalQuotationDaysType: String,

	@SerializedName("has_operations_on_mondays")
	val hasOperationsOnMondays: Boolean,

	@SerializedName("retrieval_time_limit")
	val retrievalTimeLimit: String,

	@SerializedName("retrieval_quotation_days_str")
	val retrievalQuotationDaysStr: String,

	@SerializedName("grace_period_in_days")
	val gracePeriodInDays: Int,

	@SerializedName("retrieval_direct")
	val retrievalDirect: Boolean,

	@SerializedName("max_balance_permanence")
	val maxBalancePermanence: String,

	@SerializedName("anticipated_retrieval_quotation_days_str")
	val anticipatedRetrievalQuotationDaysStr: String,

	@SerializedName("anticipated_retrieval_quotation_days")
	val anticipatedRetrievalQuotationDays: Int,

	@SerializedName("retrieval_liquidation_days_str")
	val retrievalLiquidationDaysStr: String,

	@SerializedName("application_time_limit")
	val applicationTimeLimit: String,

	@SerializedName("has_operations_on_thursdays")
	val hasOperationsOnThursdays: Boolean,

	@SerializedName("retrieval_quotation_days")
	val retrievalQuotationDays: Int,

	@SerializedName("application_quotation_days_type")
	val applicationQuotationDaysType: String,

	@SerializedName("minimum_subsequent_retrieval_amount")
	val minimumSubsequentRetrievalAmount: String,

	@SerializedName("minimum_balance_permanence")
	val minimumBalancePermanence: String,

	@SerializedName("has_operations_on_fridays")
	val hasOperationsOnFridays: Boolean,

	@SerializedName("retrieval_liquidation_days_type")
	val retrievalLiquidationDaysType: String,

	@SerializedName("minimum_subsequent_application_amount")
	val minimumSubsequentApplicationAmount: String,

	@SerializedName("application_quotation_days_str")
	val applicationQuotationDaysStr: String,

	@SerializedName("minimum_initial_application_amount")
	val minimumInitialApplicationAmount: String,

	@SerializedName("retrieval_liquidation_days")
	val retrievalLiquidationDays: Int,

	@SerializedName("application_quotation_days")
	val applicationQuotationDays: Int
)
