package com.said.androdhiltkotlin

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunction(): String
}


/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor) : MyInterface
}
 */

@InstallIn(SingletonComponent::class)
@Module
 class MyModule {

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction1(): MyInterface {
        return InterfaceImplementor()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun providerFunction2(): MyInterface {
        return SecondImplementorClass()
    }


    @Singleton
    @Provides
    fun gsonProvider() : Gson {
        return Gson()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor