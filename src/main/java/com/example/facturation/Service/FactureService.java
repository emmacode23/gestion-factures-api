
package com.example.facturation.Service;

import com.example.facturation.Entity.Facture;
import com.example.facturation.Repository.FactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureService {

    private FactureRepository factureRepository;

    public Facture save(Facture facture) {
        return factureRepository.save(facture);
    }

    public List<Facture> findAll() {
        return factureRepository.findAll();
    }

    public Facture findById(Long id) {
        return factureRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Facture non trouvée"));
    }

    public Facture update(Long id, Facture facture) {
        Facture existing = findById(id);
        existing.setMontant(facture.getMontant());
        existing.setDate(facture.getDate());
        return factureRepository.save(existing);
    }

    public void delete(Long id) {
        factureRepository.deleteById(id);
    }
}
