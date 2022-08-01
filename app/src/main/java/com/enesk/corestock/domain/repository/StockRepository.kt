package com.enesk.corestock.domain.repository

import com.enesk.corestock.domain.model.CompanyListing
import com.enesk.corestock.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

}