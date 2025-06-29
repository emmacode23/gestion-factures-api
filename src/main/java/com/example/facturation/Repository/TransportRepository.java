package com.example.facturation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.facturation.Entity.Transport;

public interface TransportRepository extends JpaRepository<Transport,Long> {

Transport findBytype(String type);
 Transport findByMatricule(String matricule);
    
}
