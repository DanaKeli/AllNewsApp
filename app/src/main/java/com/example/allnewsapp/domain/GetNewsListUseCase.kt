package com.example.allnewsapp.domain

class GetNewsListUseCase(private val newsListRepository: NewsListRepository) {

    fun getNewsList(): List<NewsItem> {
       return newsListRepository.getNewsList()
    }
}