package com.example.navigithubpr.di

import com.example.navigithubpr.model.PullRequestApi
import com.example.navigithubpr.model.PullRequestService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

//This class is to provide dependency using dependency injection
@Module
class ApiModule {

    private val BASE_URL = "https://api.github.com/"

    @Provides
    fun provideCountriesApi(): PullRequestApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(PullRequestApi::class.java)
    }

    @Provides
    fun provideCountriesService(): PullRequestService {
        return PullRequestService()
    }
}