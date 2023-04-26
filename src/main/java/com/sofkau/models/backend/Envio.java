package com.sofkau.models.backend;

import lombok.Data;

@Data
public class Envio {
    private String usuarioId;
    private String origen;
    private String destino;
    private int peso;
}
