package com.said.androdhiltkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var lars: Musician

    @Inject
    lateinit var myClassExample: ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val instrument = Instrument()
        val band = Band()

        val james = Musician(instrument, band)
        james.sing()
        */


        lars.sing()

        println(myClassExample.myFunction())
        println(myClassExample.mySecondFunction())

    }
}