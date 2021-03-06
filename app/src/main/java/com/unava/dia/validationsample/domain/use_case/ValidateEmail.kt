package com.unava.dia.validationsample.domain.use_case

import android.util.Patterns

class ValidateEmail {
    fun execute(email: String) : ValidationResult {
        if(email.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = "The email cant be blank"
            )
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return ValidationResult(
                successful = false,
                errorMessage = "This email is not valid"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}