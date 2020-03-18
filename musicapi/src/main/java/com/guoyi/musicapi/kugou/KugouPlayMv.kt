package com.guoyi.musicapi.kugou

data class KugouPlayMv(
    val errcode: Int,
    val error: String,
    val id: Int,
    val is_publish: Int,
    val mp3data: Mp3data,
    val mvdata: Mvdata,
    val mvicon: String,
    val play_count: Int,
    val remark: String,
    val singer: String,
    val songname: String,
    val status: Int,
    val timelength: Int,
    val track: Int,
    val type: Int
)

data class Mp3data(
    val bitrate: Int,
    val filesize: Int,
    val hash: String,
    val timelength: Int
)

data class Mvdata(
    val le: Le,
    val rq: Rq,
    val sq: Sq
)

data class Le(
    val backupdownurl: List<String>,
    val bitrate: Int,
    val downurl: String,
    val filesize: Int,
    val hash: String,
    val timelength: Int
)

class Rq(
)

class Sq(
)