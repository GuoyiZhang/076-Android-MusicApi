package com.guoyi.musicapi.kugou

data class KugouSongInfo(
        val `data`: InfoData,
        val err_code: Int,
        val status: Int
)

data class InfoData(
        val album_id: String,
        val album_name: String,
        val audio_id: String,
        val audio_name: String,
        val author_id: String,
        val author_name: String,
        val authors: List<Author>,
        val bitrate: Int,
        val filesize: Int,
        val hash: String,
        val have_album: Int,
        val have_mv: Int,
        val img: String,
        val is_free_part: Int,
        val lyrics: String,
        val play_backup_url: String,
        val play_url: String,
        val privilege: Int,
        val privilege2: String,
        val song_name: String,
        val timelength: Int,
        val video_id: String
)

data class Author(
        val author_id: String,
        val author_name: String,
        val avatar: String,
        val is_publish: String,
        val sizable_avatar: String
)