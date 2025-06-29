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

import com.example.facturation.Entity.Transport;

import com.example.facturation.Service.TransportService;

@RestController
public class TransportController {
    @Autowired
    private TransportService trans;
    @PostMapping("/Transports")
    public  Transport save(@RequestBody Transport t){
        return trans.save(t);
    }
    @GetMapping("/Transports")
    public List<Transport>findAll(){
        return trans.findAll();
    }
    @GetMapping("/Transports/{id}")
     public Transport findById(@PathVariable Long id){
        return trans.findById(id);
    }
    
    @PutMapping("/Transports/{id}")
        public Transport update(@PathVariable Long id, @RequestBody Transport t){
        return trans.update(id, t);

    }
    @DeleteMapping("/Transports/{id}")
    public void delete(@PathVariable Long id){
        trans.delete(id);
    }
    
    


    







    
}
