package com.searchai.navigation

import android.app.Activity

interface Navigator {
    fun navigateToHome(activity: Activity)
    fun navigateToMain(activity: Activity)
}