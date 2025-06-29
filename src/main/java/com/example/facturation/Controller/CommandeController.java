package com.example.facturation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.facturation.Entity.Commande;
import com.example.facturation.Service.CommandeService;

@RestController
public class CommandeController {
    @Autowired
    private CommandeService cs;
    @PostMapping("/Commandes")
    public Commande save(@RequestBody Commande commande){
        return cs.save( commande);
    }
    @GetMapping("/Commandes")
    
    public List<Commande>findAll(){
        return cs.findAll();
    }
    @GetMapping("/Commandes/{id}")
     public Commande  findById(@PathVariable Long id){
        return cs.findById(id);
    }

    @PutMapping("/Commandes/{id}")
        public Commande update(@PathVariable Long id, @RequestBody Commande commande){
        return cs.update(id, commande);

    }
    @DeleteMapping("/Commandes/{id}")
    public void delete(@PathVariable Long id){
        cs.delete(id);
    }
    
    
    


    







    
}
