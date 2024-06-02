package ru.xdragon.chatserver.entity

import jakarta.persistence.*

@Entity
data class Template(
    @Id
    @GeneratedValue
    val id: Long,
    val fileHash: String,
    val filePath: String,
    @OneToOne(mappedBy="template", fetch= FetchType.LAZY, cascade=[CascadeType.ALL])
    val letter: Letter
)
