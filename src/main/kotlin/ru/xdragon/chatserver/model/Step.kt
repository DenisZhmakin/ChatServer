package ru.xdragon.chatserver.model

import com.fasterxml.jackson.annotation.JsonProperty

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.io.Serializable

@Entity
data class Step(
    @Id
    @JsonProperty("id")
    @GeneratedValue
    val id: Long,
    @JsonProperty("position")
    val position: Int,
    @JsonProperty("template_var")
    val templateVar: String,
    @JsonProperty("description")
    val description: String
): Serializable
