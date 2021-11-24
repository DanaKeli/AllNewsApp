package com.example.allnewsapp.domain

import com.squareup.moshi.Json

data class NewsApiData(
@Json(name = "article") val article: String
)

data class NewsItem(
    @Json(name = "title") val title: String,
    @Json(name = "description") val description: String,
    @Json(name = "content") val content: String,
    @Json(name = "url") val url: String,
    @Json(name = "image") val image: String
)
