package com.example.facturation.Service;

import com.example.facturation.Entity.Client;
import com.example.facturation.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

@Autowired
    private ClientRepository clientRepository;

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client findById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client non trouvé"));
    }

    public Client update(Long id, Client client) {
        Client existing = findById(id);
        existing.setName(client.getName());
        existing.setEmail(client.getEmail());
        existing.setTelephone(client.getTelephone());
        existing.setActivite(client.getActivite());
        existing.setBankSolde(client.getBankSolde());
        return clientRepository.save(existing);
    }
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    
}
