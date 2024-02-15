package com.example.esercizio.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AutoreRequest {
@NotNull(message = "Nome obbligatorio")
@NotEmpty(message = "Nome obbligatorio")
    private String nome;
    @NotNull(message = "Cognome obbligatorio")
    @NotEmpty(message = "Cognome obbligatorio")
    private String cognome;
    @Email(message = "email obbligatoria")
    private String email;
    @NotNull(message = "data nascita obbligatoria")
    private LocalDate dataNascita;
}
