package ru.xdragon.chatserver.deprecated.error

data class ValidationErrorResponse(
    val violations: List<Violation>
)

