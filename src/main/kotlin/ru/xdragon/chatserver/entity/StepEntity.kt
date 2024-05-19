package ru.xdragon.chatserver.entity

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.io.Serializable

@Entity
data class StepEntity(
    @Id
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
    val positionY: Float,
    @JsonProperty("document_id")
    val documentId: Long
): Serializable
