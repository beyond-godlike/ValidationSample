package com.unava.dia.validationsample.domain.use_case

import com.unava.dia.validationexample.domain.use_case.ValidationResult

class ValidatePassword {
    fun execute(password: String) : ValidationResult {
        if(password.length < 8) {
            return ValidationResult(
                successful = false,
                errorMessage = "The passord needs to contain at least 8 characrets"
            )
        }
        val containsLetterAndDigits = password.any { it.isDigit() } &&
                password.any { it.isLetter() }
        if(!containsLetterAndDigits) {
            return ValidationResult(
                successful = false,
                errorMessage = "The passord needs to contain at least one letter and one digit"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}