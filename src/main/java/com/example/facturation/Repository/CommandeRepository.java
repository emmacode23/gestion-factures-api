package com.example.facturation.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.facturation.Entity.Commande; 

public interface CommandeRepository extends JpaRepository<Commande,Long> {

        Commande findByNumcommande(String numcommande);
    
}