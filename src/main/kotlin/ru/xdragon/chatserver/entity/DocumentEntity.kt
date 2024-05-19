package ru.xdragon.chatserver.entity

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import java.io.Serializable

@Entity
data class DocumentEntity(
    @Id
    @GeneratedValue
    val id: Long,
    @JsonProperty("name")
    val name: String,
    @JsonProperty("file_name")
    val fileName: String,
): Serializable