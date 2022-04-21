package com.said.androdhiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject constructor(
    @FirstImplementor private val myInterfaceImplementor: MyInterface,
    private val gson: Gson,
    @SecondImplementor private val mySecondImplementor: MyInterface
    ) {


    fun myFunction(): String {
        return "Working First : ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun mySecondFunction() : String{
        return "Working Second : ${mySecondImplementor.myPrintFunction()}"
    }

}