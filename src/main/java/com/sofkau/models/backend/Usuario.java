package com.sofkau.models.backend;

import lombok.Data;

@Data
public class Usuario {
    private int rol;
    private String nombres;
    private String dni;
    private String correo;
    private String contrasenna;
    private String telefono;
}