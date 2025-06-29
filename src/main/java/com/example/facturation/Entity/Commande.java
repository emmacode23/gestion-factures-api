package com.example.facturation.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "commande")
public class Commande {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numcommande;

    private int nbrecommande;
    

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    
}
