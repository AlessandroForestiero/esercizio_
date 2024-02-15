package com.example.esercizio.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BlogPostRequest {
    @NotNull(message = "Contenuto obbligatorio")
    @NotEmpty(message = "Contenuto obbligatorio")
    private String contenuto;
    @NotNull(message = "Titolo obbligatorio")
    @NotEmpty(message = "Titolo obbligatorio")
    private String titolo;
    private String categoria;
    private int tempoLettura;
    @NotNull(message = "idAutore obbligatorio")
    private int idAutore;
}
