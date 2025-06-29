package com.example.facturation.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "client")
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String telephone;
    private String activite;
    private String email;
    private double bankSolde;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "client")
    private List<Facture> factures;

    @OneToMany(mappedBy = "client")
    private List<Paiement> paiements;

    
}
