package com.unava.dia.validationexample.domain.use_case

class ValidateRepeaterPassword {
    fun execute(password: String, repeatedPassword: String) : ValidationResult {
        if(password != repearedPassword) {
            return ValidationResult(
                successfull = false,
                errorMessage = "The password doesnt match"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}