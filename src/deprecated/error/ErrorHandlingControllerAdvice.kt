package ru.xdragon.chatserver.deprecated.error

import jakarta.validation.ConstraintViolationException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import java.util.stream.Collectors


@ControllerAdvice
class ErrorHandlingControllerAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException::class)
    fun onConstraintValidationException(error: ConstraintViolationException): ValidationErrorResponse {
        val violations = error.constraintViolations.stream()
            .map {
                Violation(
                    it.propertyPath.toString(),
                    it.message
                )
            }
            .collect(Collectors.toList())
        return ValidationErrorResponse(violations)
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun onMethodArgumentNotValidException(error: MethodArgumentNotValidException): ValidationErrorResponse {
        val violations = error.bindingResult.fieldErrors.stream()
            .map {
                Violation(it.field, it.defaultMessage.toString())
            }
            .collect(Collectors.toList())

        return ValidationErrorResponse(violations)
    }
}