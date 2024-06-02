package ru.xdragon.chatserver.entity

import jakarta.persistence.*

@Entity
data class Question(
    @Id
    @GeneratedValue
    val id: Long,
    val number: Int,
    val templateVar: String,
    val description: String,
    val positionX: Float,
    val positionY: Float,
    @ManyToOne(fetch= FetchType.LAZY, optional=false)
    @JoinColumn(name="letter_id", nullable=false)
    val letter: Letter
)
