package com.example.facturation.Controller;

import com.example.facturation.Entity.ProduitsServices;
import com.example.facturation.Service.ProduitsServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produits-services")
public class ProduitsServicesController {

    @Autowired
    private ProduitsServicesService produitsServicesService;

    
    @PostMapping
    public ProduitsServices save(@RequestBody ProduitsServices ps) {
        return produitsServicesService.save(ps);
    }

    
    @GetMapping
    public List<ProduitsServices> findAll() {
        return produitsServicesService.findAll();
    }

    
    @GetMapping("/{id}")
    public ProduitsServices findById(@PathVariable Long id) {
        return produitsServicesService.findById(id);
    }

    
    @PutMapping("/{id}")
    public ProduitsServices update(@PathVariable Long id, @RequestBody ProduitsServices ps) {
        return produitsServicesService.update(id, ps);
    }

    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produitsServicesService.delete(id);
    }
}
