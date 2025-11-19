package com.contacto.dangerbook.contacto.controller;

import com.contacto.dangerbook.contacto.model.Contacto;
import com.contacto.dangerbook.contacto.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacto")
@CrossOrigin(origins = "http://localhost:5173")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping
    public ResponseEntity<List<Contacto>> findAll() {
        List<Contacto> contactos = contactoService.findAll();
        if (contactos.isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(contactos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contacto> findById(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(contactoService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Contacto> save(@RequestBody Contacto contacto) {
        return ResponseEntity.ok(contactoService.save(contacto));
    }
}
