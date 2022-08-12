package com.mironenko.patternsexapmle.decorator

import android.util.Log

class Messenger(
    private val facebookMessenger: FacebookMessenger,
    private val slackMessenger: SlackMessenger,
    private val telegramMessenger: TelegramMessenger
) {
    fun sendMessenger(messageString: String) {
        facebookMessenger.sendMessage(messageString)
        slackMessenger.sendMessage(messageString)
        telegramMessenger.sendMessage(messageString)
    }

    fun sendImage(imageId: Int) {
        facebookMessenger.sendImage(imageId)
        slackMessenger.sendImage(imageId)
        telegramMessenger.sendImage(imageId)
    }

    fun makePost(post: String) {
        facebookMessenger.makePost(post)
    }
}

class FacebookMessenger {
    fun sendMessage(message: String) {
        Log.d("TAG", "${FacebookMessenger::class.java.simpleName} message is $message")
    }

    fun sendImage(imageId: Int) {
        Log.d("TAG", "${FacebookMessenger::class.java.simpleName} image is $imageId")
    }
    fun makePost(post: String) {
        Log.d("TAG", "${TelegramMessenger::class.java.simpleName} post is $post")
    }
}

class SlackMessenger {
    fun sendMessage(message: String) {
        Log.d("TAG", "${SlackMessenger::class.java.simpleName} message is $message")
    }

    fun sendImage(imageId: Int) {
        Log.d("TAG", "${SlackMessenger::class.java.simpleName} image is $imageId")
    }
}

class TelegramMessenger {
    fun sendMessage(message: String) {
        Log.d("TAG", "${TelegramMessenger::class.java.simpleName} message is $message")
    }

    fun sendImage(imageId: Int) {
        Log.d("TAG", "${TelegramMessenger::class.java.simpleName} image is $imageId")
    }
}