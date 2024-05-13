package ru.xdragon.chatserver.model

import jakarta.persistence.Id
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue

import com.fasterxml.jackson.annotation.JsonProperty

import java.io.Serializable

@Entity
data class Step(
    @Id
    @JsonProperty("id")
    @GeneratedValue
    val id: Long,
    @JsonProperty("number")
    val number: Int,
    @JsonProperty("template_var")
    val templateVar: String,
    @JsonProperty("description")
    val description: String,
    @JsonProperty("position_x")
    val positionX: Float,
    @JsonProperty("position_y")
    val positionY: Float
): Serializable
