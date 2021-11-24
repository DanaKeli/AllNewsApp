package com.example.allnewsapp.data

import com.example.allnewsapp.domain.NewsItem
import com.example.allnewsapp.domain.NewsListRepository
import java.lang.RuntimeException

object NewsListRepositoryImpl: NewsListRepository {

    private val newsList = mutableListOf<NewsItem>()

    override fun getNewsList(): List<NewsItem> {
        return newsList.toList()
    }

    override fun getNews(url: String): NewsItem {
        return newsList.find { it.url == url
        } ?: throw RuntimeException("Element with url $url not found")
    }
}