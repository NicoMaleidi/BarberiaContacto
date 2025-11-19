package com.contacto.dangerbook.contacto.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contacto")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto" )
    private Integer id_contacto;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "mensaje", columnDefinition = "TEXT")
    private String mensaje;
}
