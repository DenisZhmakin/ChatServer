package ru.xdragon.chatserver.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.xdragon.chatserver.entity.DocumentEntity

interface DocumentRepository: JpaRepository<DocumentEntity, Long>