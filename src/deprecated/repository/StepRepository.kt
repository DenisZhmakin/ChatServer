package ru.xdragon.chatserver.deprecated.repository

import org.springframework.data.jpa.repository.JpaRepository

import ru.xdragon.chatserver.deprecated.entity.StepEntity

interface StepRepository: JpaRepository<StepEntity, Long>