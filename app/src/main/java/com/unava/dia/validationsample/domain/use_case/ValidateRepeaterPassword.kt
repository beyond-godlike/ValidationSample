package com.unava.dia.validationsample.domain.use_case

class ValidateRepeaterPassword {
    fun execute(password: String, repeatedPassword: String) : ValidationResult {
        if(password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password doesnt match"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}