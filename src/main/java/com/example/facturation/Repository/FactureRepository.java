package com.example.facturation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.facturation.Entity.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {

    
} 