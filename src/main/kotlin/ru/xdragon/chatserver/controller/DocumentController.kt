package ru.xdragon.chatserver.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import ru.xdragon.chatserver.entity.DocumentEntity
import ru.xdragon.chatserver.repository.DocumentRepository

import java.util.*

@RestController
@RequestMapping("/document")
class DocumentController {
    @Autowired
    private lateinit var repository: DocumentRepository

    @GetMapping
    fun all(): List<DocumentEntity> {
        return repository.findAll()
    }
    
    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long): Optional<DocumentEntity> {
        return repository.findById(id)
    }

    @PostMapping(consumes=["application/json"])
    fun addStep(@RequestBody document: DocumentEntity) {
        repository.save(document)
    }

    @PutMapping("/{id}")
    fun updateStep(@RequestBody document: DocumentEntity, @PathVariable id: Long) {
        repository.save(document.copy(id = id))
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: Long) {
        repository.deleteById(id)
    }
}