package ru.xdragon.chatserver.entity

import jakarta.persistence.*

@Entity
data class Role(
    @Id
    @GeneratedValue
    val id: Long,
    val name: String,
    val description: String,
    @OneToMany(mappedBy="role", fetch= FetchType.LAZY, cascade=[CascadeType.ALL])
    val users: Set<User>
)
