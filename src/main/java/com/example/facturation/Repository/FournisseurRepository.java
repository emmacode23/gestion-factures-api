package com.example.facturation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.facturation.Entity.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {

    
}