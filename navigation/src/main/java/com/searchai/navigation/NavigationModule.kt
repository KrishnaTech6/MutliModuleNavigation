package com.searchai.navigation

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NavigationModule {
    @Provides
    fun provideNavigator(): Navigator {
        return NavigatorImpl() // Provide your custom navigation implementation
    }
}