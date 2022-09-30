package com.example.navigithubpr.model

import io.reactivex.Single
import retrofit2.http.GET

interface PullRequestApi {
    @GET("repos/Nikita31/ipl-dashboard/pulls")
    fun getPullRequest(): Single<List<PullRequest>>
}
