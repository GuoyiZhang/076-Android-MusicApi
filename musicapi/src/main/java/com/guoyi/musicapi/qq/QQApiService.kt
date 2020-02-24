package com.guoyi.musicapi.qq

import com.guoyi.musicapi.bean.ArtistsDataInfo
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import retrofit2.http.QueryMap

/**
 * Created by D22434 on 2018/1/5.
 */

interface QQApiService {
    //http://c.y.qq.com/soso/fcgi-bin/search_cp?
    /*
        'p': page,
        'n': limit,
        'w': key,
        'aggr': 1,
        'lossless': 1,
        'cr': 1
     */
    @Headers("referer: https://y.qq.com/portal/player.html")
    @GET("soso/fcgi-bin/search_cp?")
    fun searchByQQ(@QueryMap params: Map<String, String>): Observable<QQApiModel>

    @Headers("referer: https://y.qq.com/portal/player.html")
    @GET("/cgi-bin/musicu.fcg?")
    fun getQQArtists(@Query("data") data: String): Observable<ArtistsDataInfo>

    @Headers("referer: https://y.qq.com/portal/player.html")
    @GET("/cgi-bin/musicu.fcg?")
    fun getQQArtists1(@Query("data") data: String): Observable<ResponseBody>

}
