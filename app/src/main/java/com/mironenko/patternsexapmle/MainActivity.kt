package com.mironenko.patternsexapmle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mironenko.patternsexapmle.builder.SomeClass
import com.mironenko.patternsexapmle.decorator.FacebookMessenger
import com.mironenko.patternsexapmle.decorator.Messenger
import com.mironenko.patternsexapmle.decorator.SlackMessenger
import com.mironenko.patternsexapmle.decorator.TelegramMessenger
import com.mironenko.patternsexapmle.factory.Item
import com.mironenko.patternsexapmle.factory.ItemFactory
import com.mironenko.patternsexapmle.singleton.Singleton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Singleton.getInstance?.doSome()

        val someClassInstance: SomeClass = SomeClass.Builder()
            .withNumber(1)
            .withWord("word")
            .withLetter("c")
            .build()
        Log.d("TAG_BUILDER", "$someClassInstance")

        val item = Item(1,"name", "none")

        val itemFactory = ItemFactory()
        itemFactory.createFromId(1)
        Log.d("TAG_FACTORY", "${itemFactory}")


        val messenger = Messenger(FacebookMessenger(), SlackMessenger(), TelegramMessenger())
        messenger.sendMessenger("Message OK")
        messenger.sendImage(100)
        messenger.makePost("show post")
    }
}