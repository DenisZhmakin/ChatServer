package ru.xdragon.chatserver.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class DocumentDTO(
    @JsonIgnoreProperties(ignoreUnknown=true)
    @JsonProperty
    val id: Long
)
