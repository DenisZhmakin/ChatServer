package ru.xdragon.chatserver.entity

import jakarta.persistence.*

@Entity(name="_user")
data class User(
    @Id
    @GeneratedValue
    val id: Long,
    val login: String,
    val passwordHash: String,
    val email: String,
    val phone: String,
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="role_id", nullable=false)
    val role: Role
)
