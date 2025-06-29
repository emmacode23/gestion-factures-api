package com.example.facturation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.facturation.Entity.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
    
}
