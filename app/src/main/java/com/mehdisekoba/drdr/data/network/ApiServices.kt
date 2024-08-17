package com.mehdisekoba.drdr.data.network

import com.mehdisekoba.drdr.data.model.home.ResponseClinics
import com.mehdisekoba.drdr.data.model.home.ResponseComment
import com.mehdisekoba.drdr.data.model.home.ResponseHome
import com.mehdisekoba.drdr.data.model.home.ResponseIntroduction
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("doctors/evisit/on-demand")
    suspend fun getHomeData(): Response<ResponseHome>

    @GET("doctors/featured")
    suspend fun getHomeIntroductionData(): Response<ResponseIntroduction>

    @GET("clinics/featured")
    suspend fun getHomeClinicsData(): Response<ResponseClinics>

    @GET("reviews/testimonials")
    suspend fun getHomeCommentData(): Response<ResponseComment>

}
