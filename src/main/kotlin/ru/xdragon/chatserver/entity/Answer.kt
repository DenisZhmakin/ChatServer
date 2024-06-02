package ru.xdragon.chatserver.entity

import jakarta.persistence.*

@Entity
data class Answer(
    @Id
    @GeneratedValue
    val id: Long,
    val value: String,
    @ManyToOne(fetch= FetchType.LAZY, optional=false)
    @JoinColumn(name="question_id", nullable=false)
    val question: Question,
    @ManyToOne(fetch= FetchType.LAZY, optional=false)
    @JoinColumn(name="user_id", nullable=false)
    val user: User,
    @ManyToOne(fetch= FetchType.LAZY, optional=false)
    @JoinColumn(name="file_id", nullable=false)
    val file: File,
)
