package com.unava.dia.validationsample.presentation

sealed class RegistrationFormEvent {
    data class EmailChanged(val email: String) : RegistrationFormEvent()
    data class PasswordChanged(val password: String) : RegistrationFormEvent()
    data class RepeatedPasswordChanged(val repeatedPassword: String) : RegistrationFormEvent()
    data class AcceptTerms(val terms: Boolean) : RegistrationFormEvent()

    object Submit: RegistrationFormEvent()
}