package com.example.facturation.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "fournisseur")
public class Fournisseur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;
    private String telephone;

    
}
