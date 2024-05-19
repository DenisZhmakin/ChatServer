package ru.xdragon.chatserver.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class StepDTO(
    @field:Min(1)
    @JsonProperty("number")
    val number: Int,
    @field:NotBlank
    @JsonProperty("template_var")
    val templateVar: String,
    @field:NotBlank
    @JsonProperty
    val description: String,
    @JsonProperty("position_x")
    val positionX: Float,
    @JsonProperty("position_y")
    val positionY: Float,
    val documentId: Long,
    @JsonIgnoreProperties(ignoreUnknown=true)
    @JsonProperty("id")
    val id: Long?
)
