package com.example.facturation.Entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "facture")
public class Facture {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double montant;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private LocalDate date;


}
