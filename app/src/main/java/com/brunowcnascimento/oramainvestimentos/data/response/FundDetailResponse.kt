package com.brunowcnascimento.oramainvestimentos.data.response

import com.google.gson.annotations.SerializedName

data class Specification(

	@SerializedName("fund_main_strategy_name")
	var fundMainStrategyName: String,

	@SerializedName("fund_risk_profile")
	var fundRiskProfile: FundRiskProfile,

	@SerializedName("fund_main_strategy_explanation")
	var fundMainStrategyExplanation: String,

	@SerializedName("fund_class")
	var fundClass: String,

	@SerializedName("fund_main_strategy")
	var fundMainStrategy: FundMainStrategy,

	@SerializedName("fund_suitability_profile")
	var fundSuitabilityProfile: FundSuitabilityProfile,

	@SerializedName("fund_type")
	var fundType: String,

	@SerializedName("fund_class_anbima")
	var fundClassAnbima: String,

	@SerializedName("fund_macro_strategy")
	var fundMacroStrategy: FundMacroStrategy,

	@SerializedName("is_qualified")
	var isQualified: Boolean
)

data class PerformanceVideosItem(

	@SerializedName("thumbnail")
	var thumbnail: String,

	@SerializedName("enabled_for_tvorama")
	var enabledForTvorama: Boolean,

	@SerializedName("description")
	var description: String,

	@SerializedName("published")
	var published: String,

	@SerializedName("id")
	var id: Int,

	@SerializedName("title")
	var title: String,

	@SerializedName("youtube_id")
	var youtubeId: String,

	@SerializedName("url")
	var url: String
)

data class FundSuitabilityProfile(

	@SerializedName("score_range_order")
	var scoreRangeOrder: Int,

	@SerializedName("name")
	var name: String
)

data class FundDetailResponseItem(

	@SerializedName("closing_date")
	var closingDate: Any,

	@SerializedName("fees")
	var fees: Fees,

	@SerializedName("quota_date")
	var quotaDate: String,

	@SerializedName("orama_standard")
	var oramaStandard: Boolean,

	@SerializedName("profitabilities")
	var profitabilities: Profitabilities,

	@SerializedName("fund_manager")
	var fundManager: FundManager,

	@SerializedName("documents")
	var documents: List<DocumentsItem>,

	@SerializedName("is_simple")
	var isSimple: Boolean,

	@SerializedName("fund_situation")
	var fundSituation: FundSituation,

	@SerializedName("description")
	var description: Description,

	@SerializedName("target_fund")
	var targetFund: Any,

	@SerializedName("cnpj")
	var cnpj: String,

	@SerializedName("description_seo")
	var descriptionSeo: String,

	@SerializedName("simple_name")
	var simpleName: String,

	@SerializedName("is_closed_to_capture")
	var isClosedToCapture: Boolean,

	@SerializedName("initial_date")
	var initialDate: String,

	@SerializedName("net_patrimony_12m")
	var netPatrimony12m: String,

	@SerializedName("id")
	var id: Int,

	@SerializedName("operability")
	var operability: Operability,

	@SerializedName("opening_date")
	var openingDate: Any,

	@SerializedName("slug")
	var slug: String,

	@SerializedName("is_closed")
	var isClosed: Boolean,

	@SerializedName("show_detailed_review")
	var showDetailedReview: Boolean,

	@SerializedName("insurance_company_code")
	var insuranceCompanyCode: Any,

	@SerializedName("performance_videos")
	var performanceVideos: List<Any>,

	@SerializedName("is_active")
	var isActive: Boolean,

	@SerializedName("volatility_12m")
	var volatility12m: String,

	@SerializedName("specification")
	var specification: Specification,

	@SerializedName("strategy_video")
	var strategyVideo: Any,

	@SerializedName("benchmark")
	var benchmark: Benchmark,

	@SerializedName("full_name")
	var fullName: String,

	@SerializedName("tax_classification")
	var taxClassification: String,

	@SerializedName("esg_seal")
	var esgSeal: Boolean,

	@SerializedName("performance_audios")
	var performanceAudios: List<Any>,

	@SerializedName("closed_to_capture_explanation")
	var closedToCaptureExplanation: String
)

data class Fees(

	@SerializedName("maximum_administration_fee")
	var maximumAdministrationFee: String,

	@SerializedName("anticipated_retrieval_fee_value")
	var anticipatedRetrievalFeeValue: String,

	@SerializedName("administration_fee")
	var administrationFee: String,

	@SerializedName("anticipated_retrieval_fee")
	var anticipatedRetrievalFee: String,

	@SerializedName("has_anticipated_retrieval")
	var hasAnticipatedRetrieval: Boolean,

	@SerializedName("performance_fee")
	var performanceFee: String
)

data class Benchmark(

	@SerializedName("name")
	var name: String,

	@SerializedName("id")
	var id: Int
)

data class FundMacroStrategy(

	@SerializedName("name")
	var name: String,

	@SerializedName("id")
	var id: Int,

	@SerializedName("explanation")
	var explanation: String
)

data class StrategyVideo(

	@SerializedName("thumbnail")
	var thumbnail: Any,

	@SerializedName("enabled_for_tvorama")
	var enabledForTvorama: Boolean,

	@SerializedName("description")
	var description: String,

	@SerializedName("published")
	var published: Any,

	@SerializedName("id")
	var id: Int,

	@SerializedName("title")
	var title: String,

	@SerializedName("youtube_id")
	var youtubeId: String,

	@SerializedName("url")
	var url: String
)

data class DocumentsItem(

	@SerializedName("name")
	var name: String,

	@SerializedName("position")
	var position: Int,

	@SerializedName("document_url")
	var documentUrl: String,

	@SerializedName("document_type")
	var documentType: String
)

data class FundManager(

	@SerializedName("full_name")
	var fullName: String,

	@SerializedName("name")
	var name: String,

	@SerializedName("description")
	var description: String,

	@SerializedName("logo")
	var logo: String,

	@SerializedName("id")
	var id: Int,

	@SerializedName("slug")
	var slug: String
)

data class Description(

	@SerializedName("strengths")
	var strengths: String,

	@SerializedName("target_audience")
	var targetAudience: String,

	@SerializedName("strategy")
	var strategy: String,

	@SerializedName("movie_url")
	var movieUrl: Any,

	@SerializedName("objective")
	var objective: String
)

data class FundSituation(

	@SerializedName("code")
	var code: String,

	@SerializedName("name")
	var name: String
)

data class FundRiskProfile(

	@SerializedName("score_range_order")
	var scoreRangeOrder: Int,

	@SerializedName("name")
	var name: String
)

data class Profitabilities(

	@SerializedName("m48")
	var m48: String,

	@SerializedName("m36")
	var m36: String,

	@SerializedName("month")
	var month: String,

	@SerializedName("year")
	var year: String,

	@SerializedName("m60")
	var m60: String,

	@SerializedName("day")
	var day: String,

	@SerializedName("m24")
	var m24: String,

	@SerializedName("m12")
	var m12: String
)

data class FundMainStrategy(

	@SerializedName("name")
	var name: String,

	@SerializedName("id")
	var id: Int,

	@SerializedName("explanation")
	var explanation: String,

	@SerializedName("fund_macro_strategy")
	var fundMacroStrategy: Int
)

data class Operability(

	@SerializedName("has_grace_period")
	var hasGracePeriod: Boolean,

	@SerializedName("has_operations_on_tuesdays")
	var hasOperationsOnTuesdays: Boolean,

	@SerializedName("anticipate_retrieval_liquidation_days_type")
	var anticipateRetrievalLiquidationDaysType: String,

	@SerializedName("has_operations_on_wednesdays")
	var hasOperationsOnWednesdays: Boolean,

	@SerializedName("anticipate_retrieval_liquidation_days_str")
	var anticipateRetrievalLiquidationDaysStr: String,

	@SerializedName("anticipated_retrieval_quotation_days_type")
	var anticipatedRetrievalQuotationDaysType: String,

	@SerializedName("anticipate_retrieval_liquidation_days")
	var anticipateRetrievalLiquidationDays: Int,

	@SerializedName("retrieval_special_type")
	var retrievalSpecialType: String,

	@SerializedName("maximum_initial_application_amount")
	var maximumInitialApplicationAmount: String,

	@SerializedName("grace_period_in_days_str")
	var gracePeriodInDaysStr: Any,

	@SerializedName("retrieval_quotation_days_type")
	var retrievalQuotationDaysType: String,

	@SerializedName("has_operations_on_mondays")
	var hasOperationsOnMondays: Boolean,

	@SerializedName("retrieval_time_limit")
	var retrievalTimeLimit: String,

	@SerializedName("retrieval_quotation_days_str")
	var retrievalQuotationDaysStr: String,

	@SerializedName("grace_period_in_days")
	var gracePeriodInDays: Int,

	@SerializedName("retrieval_direct")
	var retrievalDirect: Boolean,

	@SerializedName("max_balance_permanence")
	var maxBalancePermanence: String,

	@SerializedName("anticipated_retrieval_quotation_days_str")
	var anticipatedRetrievalQuotationDaysStr: String,

	@SerializedName("anticipated_retrieval_quotation_days")
	var anticipatedRetrievalQuotationDays: Int,

	@SerializedName("retrieval_liquidation_days_str")
	var retrievalLiquidationDaysStr: String,

	@SerializedName("application_time_limit")
	var applicationTimeLimit: String,

	@SerializedName("has_operations_on_thursdays")
	var hasOperationsOnThursdays: Boolean,

	@SerializedName("retrieval_quotation_days")
	var retrievalQuotationDays: Int,

	@SerializedName("application_quotation_days_type")
	var applicationQuotationDaysType: String,

	@SerializedName("minimum_subsequent_retrieval_amount")
	var minimumSubsequentRetrievalAmount: String,

	@SerializedName("minimum_balance_permanence")
	var minimumBalancePermanence: String,

	@SerializedName("has_operations_on_fridays")
	var hasOperationsOnFridays: Boolean,

	@SerializedName("retrieval_liquidation_days_type")
	var retrievalLiquidationDaysType: String,

	@SerializedName("minimum_subsequent_application_amount")
	var minimumSubsequentApplicationAmount: String,

	@SerializedName("application_quotation_days_str")
	var applicationQuotationDaysStr: String,

	@SerializedName("minimum_initial_application_amount")
	var minimumInitialApplicationAmount: String,

	@SerializedName("retrieval_liquidation_days")
	var retrievalLiquidationDays: Int,

	@SerializedName("application_quotation_days")
	var applicationQuotationDays: Int
)
