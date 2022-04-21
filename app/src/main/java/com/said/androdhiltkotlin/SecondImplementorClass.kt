package com.said.androdhiltkotlin

import javax.inject.Inject

class SecondImplementorClass @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "MyImplementor Second Interface Implementor"
    }
}