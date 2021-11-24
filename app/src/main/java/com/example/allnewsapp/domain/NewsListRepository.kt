package com.example.allnewsapp.domain

interface NewsListRepository {

    fun getNewsList(): List<NewsItem>

    fun getNews(url: String): NewsItem
}