package com.enesk.corestock.di

import com.enesk.corestock.data.csv.CSVParser
import com.enesk.corestock.data.csv.CompanyListingsParser
import com.enesk.corestock.data.repository.StockRepositoryImpl
import com.enesk.corestock.domain.model.CompanyListing
import com.enesk.corestock.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser : CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

}