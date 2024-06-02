package ru.xdragon.chatserver.deprecated.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.xdragon.chatserver.deprecated.entity.DocumentEntity

interface DocumentRepository: JpaRepository<DocumentEntity, Long>