package com.said.androdhiltkotlin

import javax.inject.Inject

class InterfaceImplementor @Inject constructor() : MyInterface {


    override fun myPrintFunction(): String {
        return "MyImplementor First Interface Implementor"
    }
}

