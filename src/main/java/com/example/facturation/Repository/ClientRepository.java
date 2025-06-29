package com.example.facturation.Repository;




import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.facturation.Entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{

    Optional<Client> findByName(String name);

    Optional<Client> findByActivite(String activite);


}
