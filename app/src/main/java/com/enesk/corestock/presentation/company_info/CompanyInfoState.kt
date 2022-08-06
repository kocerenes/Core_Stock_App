package com.enesk.corestock.presentation.company_info

import com.enesk.corestock.domain.model.CompanyInfo
import com.enesk.corestock.domain.model.IntradayInfo
import com.enesk.corestock.util.Resource

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
