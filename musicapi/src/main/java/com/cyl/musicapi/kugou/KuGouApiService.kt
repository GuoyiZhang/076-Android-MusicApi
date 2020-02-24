package com.cyl.musicapi.kugou

import com.cyl.musicapi.baidu.BaiduApiService
import com.cyl.musicapi.baidu.BaiduSearchMergeInfo
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface KuGouApiService {

    @GET("search?ver=1&man=yes&client=pc")
    fun searchLyric(@Query("keyword") songName: String, @Query("duration") duration: String): Observable<KugouLyric>

    @GET("download?ver=1&client=pc&fmt=lrc&charset=utf8")
    fun getRawLyric(@Query("id") id: String, @Query("accesskey") accesskey: String): Observable<KugouLyricInfo>

    /**
     * 搜索
     */
    @GET("api/v3/search/song?format=json")
    fun queryMerge(@Query("keyword") keyword: String,
                   @Query("page") page: Int,
                   @Query("pagesize") pagesize: Int): Observable<BaiduSearchMergeInfo>

}
