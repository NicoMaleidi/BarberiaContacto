package com.contacto.dangerbook.contacto.repository;

import com.contacto.dangerbook.contacto.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
