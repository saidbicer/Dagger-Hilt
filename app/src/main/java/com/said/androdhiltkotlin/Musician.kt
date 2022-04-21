package com.said.androdhiltkotlin

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class Musician
    @Inject constructor(intrument : Instrument, band : Band) {
    fun sing(){
        Log.e("sing", "sing")
    }
}