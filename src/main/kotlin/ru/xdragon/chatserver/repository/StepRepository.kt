package ru.xdragon.chatserver.repository

import org.springframework.data.jpa.repository.JpaRepository

import ru.xdragon.chatserver.model.Step

interface StepRepository: JpaRepository<Step, Long>