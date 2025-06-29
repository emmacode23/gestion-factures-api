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

import com.example.facturation.Entity.Fournisseur;
import com.example.facturation.Service.FournisseurService;

@RestController
public class  FournisseurController{
    @Autowired
    private FournisseurService fours;
    @PostMapping("/Fournisseurs")
    public Fournisseur save(@RequestBody Fournisseur f){
        return fours.save(f);
    }
    @GetMapping("/Fournisseurs")
    public List<Fournisseur>findAll(){
        return fours.findAll();

    }
    @GetMapping("/Fournisseurs/{id}")
     public Fournisseur findById(@PathVariable Long id){
        return fours.findById(id);
    }

    @PutMapping("/Fournisseurs/{id}")
        public Fournisseur update(@PathVariable Long id, @RequestBody Fournisseur f){
        return fours.update(id, f);

    }
    @DeleteMapping("/Fournisseurs/{id}")
    public void delete(@PathVariable Long id){
        fours.delete(id);
    }
    
    


    







    
}
