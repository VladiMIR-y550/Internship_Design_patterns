package com.mironenko.patternsexapmle.singleton

import android.util.Log

class Singleton private constructor() {

    companion object {
        private var instance: Singleton? = null

        val getInstance: Singleton?
            get() {
                if (instance == null) {
                    synchronized(Singleton::class.java) {
                        instance = Singleton()
                    }
                }
                return instance
            }
    }

    fun doSome() {
        Log.d("TAG_SINGLETON", "Singleton doSome()")
    }
}