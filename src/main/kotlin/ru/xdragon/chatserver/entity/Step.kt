package ru.xdragon.chatserver.entity

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*

import java.io.Serializable

@Entity
data class Step(
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
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="document_id", nullable=false)
    val document: Document
): Serializable
