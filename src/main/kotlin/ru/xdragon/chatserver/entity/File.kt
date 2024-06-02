package ru.xdragon.chatserver.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class File(
    @Id
    @GeneratedValue
    val id: Long,
    val name: String,
    val type: String
)
