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

import com.example.facturation.Entity.Facture;

import com.example.facturation.Service.FactureService;

@RestController
public class  FactureController{
    @Autowired
    private FactureService fs;
    @PostMapping("/Factures")
    public Facture save(@RequestBody Facture facture){
        return fs.save( facture);
    }
    @GetMapping("/Factures")
    public List<Facture>findAll(){
        return fs.findAll();

    }
    @GetMapping("/Factures/{id}")
     public Facture findById(@PathVariable Long id){
        return fs.findById(id);
    }

    @PutMapping("/Factures/{id}")
        public Facture update(@PathVariable Long id, @RequestBody Facture facture){
        return fs.update(id, facture);

    }
    @DeleteMapping("/Factures/{id}")
    public void delete(Long id){
        fs.delete(id);
    }
    
    


    







    
}
