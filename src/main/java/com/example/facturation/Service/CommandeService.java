package com.example.facturation.Service;

import com.example.facturation.Entity.Commande;
import com.example.facturation.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    public Commande findById(Long id) {
        return commandeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Commande non trouvée"));
    }

    public Commande update(Long id, Commande commande) {
        Commande existing = findById(id);
        existing.setNumcommande(commande.getNumcommande());
        existing.setNbrecommande(commande.getNbrecommande());
        return commandeRepository.save(existing);
    }

    public void delete(Long id) {
        commandeRepository.deleteById(id);
    }
}
