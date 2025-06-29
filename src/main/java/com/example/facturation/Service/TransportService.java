package com.example.facturation.Service;

import com.example.facturation.Entity.Transport;
import com.example.facturation.Repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {

    @Autowired
    private TransportRepository transportRepo;

    public Transport save(Transport transport) {
        return transportRepo.save(transport);
    }

    public List<Transport> findAll() {
        return transportRepo.findAll();
    }

    public Transport findById(Long id) {
        return transportRepo.findById(id).orElseThrow(() -> new RuntimeException("Transport non trouvé"));
    }

    public Transport update(Long id, Transport transport) {
        Transport existing = findById(id);
        existing.setType(transport.getType());
        existing.setMatricule(transport.getMatricule());
        existing.setChauffeur(transport.getChauffeur());
        existing.setCoutTransport(transport.getCoutTransport());
        return transportRepo.save(existing);
    }

    public void delete(Long id) {
        if (!transportRepo.existsById(id)) {
            throw new RuntimeException("Transport introuvable !");
        }
        transportRepo.deleteById(id);
    }

}
