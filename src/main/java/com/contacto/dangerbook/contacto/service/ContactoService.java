package com.contacto.dangerbook.contacto.service;

import com.contacto.dangerbook.contacto.model.Contacto;
import com.contacto.dangerbook.contacto.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    public Contacto findById(Integer id) {
        return contactoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mensaje no encontrado"));
    }

    public List<Contacto> findAll() {
        return contactoRepository.findAll();
    }

    public Contacto save(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    public void deleteById(Integer id) {
        contactoRepository.deleteById(id);
    }

}
