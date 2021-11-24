package com.example.allnewsapp.domain

class GetNewsUseCase(private val newsListRepository: NewsListRepository) {

    fun getNews(url: String): NewsItem {
       return newsListRepository.getNews(url)
    }
}