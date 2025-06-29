package com.example.facturation.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "produitsservices")
public class ProduitsServices {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    @NotBlank
    private String nom;
    @NotNull
    private String prix;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    
}
