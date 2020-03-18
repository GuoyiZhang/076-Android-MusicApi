package com.guoyi.musicapi.kugou

import com.guoyi.musicapi.baidu.BaiduApiService
import com.guoyi.musicapi.baidu.BaiduPlayMv
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
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
                   @Query("pagesize") pagesize: Int): Observable<KugouSearchMergeInfo>

    /**
     * 获取歌曲详细信息（带歌词）
     */

    @Headers("cookie: kg_mid=ef7aace8ce119d737f7cdcb6be04b753; kg_dfid=2AMWRp0M0PId0W6sWX3JIPY9; Hm_lvt_aedee6983d4cfc62f509129360d6bb3d=1580622119,1581736075; KuGooRandom=66721581737309147; ACK_SERVER_10015=%7B%22list%22%3A%5B%5B%22gzlogin-user.kugou.com%22%5D%5D%7D; Hm_lpvt_aedee6983d4cfc62f509129360d6bb3d=1582543046")
    @GET("yy/index.php?r=play/getdata")
    fun getTingSongInfo(@Query("hash") hash: String): Observable<KugouSongInfo>


    /**
     * 获取mv信息
     */
    @GET("/app/i/mv.php?cmd=100&ismp3=1&ext=mp4")
    fun getPlayMv(@Query("hash") hash: String?): Observable<KugouPlayMv>

}
