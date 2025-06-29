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

import com.example.facturation.Entity.Paiement;

import com.example.facturation.Service.PaiementService;

@RestController
public class  PaiementController{
    @Autowired
    private PaiementService Pais;
    @PostMapping("/Paiments")
    public Paiement save(@RequestBody Paiement p){
        return Pais.save(p);
    }
    @GetMapping("/Paiements")
    public List<Paiement>findAll(){
        return Pais.findAll();

    }
    @GetMapping("/Paiements/{id}")
    public Paiement findById(@PathVariable Long id){
        return Pais.findById(id);
    }

    @PutMapping("/Paiements/{id}")
        public Paiement update(@PathVariable Long id, @RequestBody Paiement p){
        return Pais.update(id, p);

    }
    @DeleteMapping("/Paiements/{id}")
    public void delete(@PathVariable Long id){
        Pais.delete(id);
    }
    
    


    







    
}
