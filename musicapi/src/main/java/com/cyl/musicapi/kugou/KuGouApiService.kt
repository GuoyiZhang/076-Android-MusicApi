package com.cyl.musicapi.kugou

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

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
                   @Query("pagesize") pagesize: Int): Observable<KugouSearchMergeInfo>

    /**
     * 获取歌曲详细信息（带歌词）
     */
    @GET("yy/index.php?r=play/getdata")
    fun getTingSongInfo(@Query("hash") hash: String): Observable<KugouSongInfo>

}
