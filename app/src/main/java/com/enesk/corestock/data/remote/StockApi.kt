package com.enesk.corestock.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    //https://www.alphavantage.co/query?function=LISTING_STATUS&apikey=demo

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String = API_KEY
    ): ResponseBody

    companion object{
        const val API_KEY = "6MWJKFHBQBU2LSE0"
        const val BASE_URL = "https://www.alphavantage.co"
    }

}