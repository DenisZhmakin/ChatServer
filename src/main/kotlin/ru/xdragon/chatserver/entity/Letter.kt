package ru.xdragon.chatserver.entity

import jakarta.persistence.*

@Entity
data class Letter(
    @Id
    @GeneratedValue
    val id: Long,
    val name: String,
    @OneToOne(fetch= FetchType.LAZY, optional=false)
    @JoinColumn(name="template_id", nullable=false)
    val template: Template,
    @OneToMany(mappedBy="letter", fetch= FetchType.LAZY, cascade=[CascadeType.ALL])
    val questions: List<Question>
)
