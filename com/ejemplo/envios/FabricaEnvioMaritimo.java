package com.ejemplo.envios;

public class FabricaEnvioMaritimo extends FabricaEnvios {
    @Override
    public Envio crearEnvio() {
        return new EnvioMaritimo();
    }
}
