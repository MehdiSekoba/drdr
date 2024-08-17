package com.mehdisekoba.drdr.data.repository

import com.mehdisekoba.drdr.data.network.ApiServices
import javax.inject.Inject


class HomeRepository
@Inject
constructor(private val api: ApiServices) {
    suspend fun getHomeDataList() = api.getHomeData()
    suspend fun getHomeIntroductionData() = api.getHomeIntroductionData()
    suspend fun getHomeClinicsData() = api.getHomeClinicsData()
    suspend fun getHomeCommentData() = api.getHomeCommentData()

}
