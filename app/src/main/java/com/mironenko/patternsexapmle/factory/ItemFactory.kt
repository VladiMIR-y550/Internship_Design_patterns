package com.mironenko.patternsexapmle.factory

class ItemFactory {

    fun create(): Item {
        return Item(-1,"", "")
    }

    fun createFromId(id: Int): Item {
        return Item(id, "name_$id", "item $id description")
    }
}