package ru.xdragon.chatserver.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotBlank
import java.io.Serializable

data class LetterDTO(
    @JsonProperty
    @JsonIgnoreProperties(ignoreUnknown=true)
    val id: Int? = null,
    val templateId: Int? = null,
    @JsonProperty
    @field:NotBlank
    val name: String,
    @JsonProperty("file_name")
    @field:NotBlank
    val fileName: String,
    // Чтобы была возможность скачать не только Word файл, но и PDF.
    @JsonProperty("file_suffix")
    @field:NotBlank
    val fileSuffix: String,
): Serializable

