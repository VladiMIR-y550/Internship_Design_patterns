package com.mironenko.patternsexapmle.adapter

import android.util.Log

class UkraineElectricalSocket : UkrainianPlugConnector {
    override fun giveElectricity() {
        Log.d("TAG_ADAPTER", "Use electricity systems from Ukraine")
    }
}