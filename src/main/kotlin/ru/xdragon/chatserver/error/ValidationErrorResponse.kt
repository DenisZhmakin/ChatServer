package ru.xdragon.chatserver.error

data class ValidationErrorResponse(
    val violations: List<Violation>
)

