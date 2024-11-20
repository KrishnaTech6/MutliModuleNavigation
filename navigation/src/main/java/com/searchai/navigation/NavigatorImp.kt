package com.searchai.navigation

import android.app.Activity
import android.content.Intent
import com.searchai.intro.HomeActivity
import javax.inject.Inject

class NavigatorImpl @Inject constructor() : Navigator {

    override fun navigateToHome(activity: Activity) {
        val intent = Intent(activity, HomeActivity::class.java)
        activity.startActivity(intent)
    }

    override fun navigateToMain(activity: Activity) {
        TODO("Not yet implemented")
    }
}