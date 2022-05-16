package com.example.mymoviesmariamay.model.MediaItem

//import com.example.mymoviesmariamay.MediaItem.Type

data class MediaItem(
    val id:Int,
    val title:String,
    val thumb:String,
    val type:Type
) {
    enum class Type{PHOTO, VIDEO}
}
fun getMedia(): List<MediaItem> = (1..10).map{
    MediaItem(
        id=it,
        title="Title $it",
        thumb="https://loremflickr.com/400/400/$it",
        type=if(it % 3 == 0) MediaItem.Type.VIDEO else MediaItem.Type.PHOTO
    )
}
