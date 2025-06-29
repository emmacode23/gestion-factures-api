package com.example.facturation.Service;

import com.example.facturation.Entity.Fournisseur;
import com.example.facturation.Repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;

    public Fournisseur save(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    public List<Fournisseur> findAll() {
        return fournisseurRepository.findAll();
    }

    public Fournisseur findById(Long id) {
        return fournisseurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fournisseur non trouvé"));
    }

    public Fournisseur update(Long id, Fournisseur fournisseur) {
        Fournisseur existing = findById(id);
        existing.setNom(fournisseur.getNom());
        existing.setEmail(fournisseur.getEmail());
        existing.setTelephone(fournisseur.getTelephone());
        return fournisseurRepository.save(existing);
    }

    public void delete(Long id) {
        fournisseurRepository.deleteById(id);
    }
}
