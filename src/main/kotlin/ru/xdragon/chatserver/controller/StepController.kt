package ru.xdragon.chatserver.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.xdragon.chatserver.model.Step

import ru.xdragon.chatserver.repository.StepRepository
import java.util.*

@RestController
@RequestMapping("/steps")
class StepController {
    @Autowired
    private lateinit var repository: StepRepository

    @GetMapping
    fun all(): List<Step> {
        return repository.findAll()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long): Optional<Step> {
        return repository.findById(id)
    }

    @PostMapping
    fun addStep(@RequestBody step: Step) {
        println(step)
        repository.save(step)
    }

    @PutMapping("/{id}")
    fun updateStep(@RequestBody step: Step, @PathVariable id: Long) {
        repository.save(step.copy(id = id))
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable("id") id: Long) {
        repository.deleteById(id)
    }
}