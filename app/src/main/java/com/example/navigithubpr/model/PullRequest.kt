package com.example.navigithubpr.model

import com.google.gson.annotations.SerializedName

//We are fetching Title, Created date, closed date, userName, user Image for closed pull request of this repository
// as per app requirement

data class PullRequest(
    val title:String?,
    @SerializedName("created_at")
    val created_date:String?,
    @SerializedName("closed_at")
    val closed_date:String?,
    val user:User
)
