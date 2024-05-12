package ru.xdragon.chatserver

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ChatServerApplication

fun main(args: Array<String>) {
    runApplication<ChatServerApplication>(*args)
}
