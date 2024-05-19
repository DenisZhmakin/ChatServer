package ru.xdragon.chatserver.error

data class Violation(
    val fieldName: String,
    val message: String
)
