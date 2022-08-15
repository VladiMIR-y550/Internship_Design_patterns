package com.mironenko.patternsexapmle.adapter

class UkraineToUSAConnectorAdapter(private val usaPlug: USAPlugConnector) : UkrainianPlugConnector {

    override fun giveElectricity() {
        usaPlug.provideElectricity()
    }
}