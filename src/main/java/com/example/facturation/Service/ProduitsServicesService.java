
package com.example.facturation.Service;

import com.example.facturation.Entity.ProduitsServices;
import com.example.facturation.Repository.ProduitsServicesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitsServicesService {


    private ProduitsServicesRepository produitsServicesRepository;

    public ProduitsServices save(ProduitsServices produit) {
        return produitsServicesRepository.save(produit);
    }

    public List<ProduitsServices> findAll() {
        return produitsServicesRepository.findAll();
    }

    public ProduitsServices findById(Long id) {
        return produitsServicesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit/Service non trouvé"));
    }

    public ProduitsServices update(Long id, ProduitsServices produit) {
        ProduitsServices existing = findById(id);
        existing.setNom(produit.getNom());
        existing.setPrix(produit.getPrix());
        return produitsServicesRepository.save(existing);
    }

    public void delete(Long id) {
        produitsServicesRepository.deleteById(id);
    }
}
