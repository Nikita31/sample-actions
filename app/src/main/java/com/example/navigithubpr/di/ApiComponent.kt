package com.example.navigithubpr.di

import android.app.Application
import com.example.navigithubpr.model.PullRequestService
import com.example.navigithubpr.viewmodel.PullRequestViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: PullRequestService)

    fun inject(viewModel: PullRequestViewModel)
}