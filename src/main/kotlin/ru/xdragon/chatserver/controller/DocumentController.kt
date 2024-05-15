package ru.xdragon.chatserver.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import ru.xdragon.chatserver.entity.Document
import ru.xdragon.chatserver.repository.DocumentRepository

import java.util.*

@RestController
@RequestMapping("/document")
class DocumentController {
    @Autowired
    private lateinit var repository: DocumentRepository

    @GetMapping
    fun all(): List<Document> {
        return repository.findAll()
    }
    
    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long): Optional<Document> {
        return repository.findById(id)
    }

    @PostMapping(consumes=["application/json"])
    fun addStep(@RequestBody document: Document) {
        repository.save(document)
    }

    @PutMapping("/{id}")
    fun updateStep(@RequestBody document: Document, @PathVariable id: Long) {
        repository.save(document.copy(id = id))
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: Long) {
        repository.deleteById(id)
    }
}