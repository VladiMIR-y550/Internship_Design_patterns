package com.mironenko.patternsexapmle.adapter

import android.util.Log

class USAElectricalSocket : USAPlugConnector {
    override fun provideElectricity() {
        Log.d("TAG_ADAPTER", "Use electricity systems from USA")
    }
}