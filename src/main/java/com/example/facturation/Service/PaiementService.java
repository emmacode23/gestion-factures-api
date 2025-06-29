package com.example.facturation.Service;

import com.example.facturation.Entity.Paiement;
import com.example.facturation.Repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementService {

    @Autowired
    private PaiementRepository paiementRepository;

    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    public Paiement findById(Long id) {
        return paiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiement non trouvé"));
    }

    public Paiement update(Long id, Paiement paiement) {
        Paiement existing = findById(id);
        existing.setMontant(paiement.getMontant());
        existing.setDate(paiement.getDate());
        return paiementRepository.save(existing);
    }

    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }
}
