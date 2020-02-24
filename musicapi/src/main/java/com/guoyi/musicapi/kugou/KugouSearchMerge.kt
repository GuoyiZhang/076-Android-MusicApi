package com.guoyi.musicapi.kugou

data class KugouSearchMergeInfo(
        val `data`: Data,
        val errcode: Int,
        val error: String,
        val status: Int
)

data class Data(
        val aggregation: List<Aggregation>,
        val allowerr: Int,
        val correctiontip: String,
        val correctiontype: Int,
        val forcecorrection: Int,
        val info: List<Info>,
        val istag: Int,
        val istagresult: Int,
        val tab: String,
        val timestamp: Int,
        val total: Int
)

data class Aggregation(
        val count: Int,
        val key: String
)

data class Info(
        val `320filesize`: Int,
        val `320hash`: String,
        val `320privilege`: Int,
        val Accompany: Int,
        val album_audio_id: Int,
        val album_id: String,
        val album_name: String,
        val audio_id: Int,
        val bitrate: Int,
        val duration: Int,
        val extname: String,
        val fail_process: Int,
        val fail_process_320: Int,
        val fail_process_sq: Int,
        val feetype: Int,
        val filename: String,
        val filesize: Int,
        val fold_type: Int,
        val group: List<Any>,
        val hash: String,
        val isnew: Int,
        val isoriginal: Int,
        val m4afilesize: Int,
        val mvhash: String,
        val old_cpy: Int,
        val othername: String,
        val othername_original: String,
        val ownercount: Int,
        val pay_type: Int,
        val pay_type_320: Int,
        val pay_type_sq: Int,
        val pkg_price: Int,
        val pkg_price_320: Int,
        val pkg_price_sq: Int,
        val price: Int,
        val price_320: Int,
        val price_sq: Int,
        val privilege: Int,
        val rp_publish: Int,
        val rp_type: String,
        val singername: String,
        val songname: String,
        val songname_original: String,
        val source: String,
        val sourceid: Int,
        val sqfilesize: Int,
        val sqhash: String,
        val sqprivilege: Int,
        val srctype: Int,
        val topic: String,
        val topic_url: String,
        val trans_param: TransParam
)

data class TransParam(
        val cid: Int,
        val display: Int,
        val display_rate: Int,
        val musicpack_advance: Int,
        val pay_block_tpl: Int
)