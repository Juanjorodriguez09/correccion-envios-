package com.ejemplo.envios;

public class FabricaEnvioAereo extends FabricaEnvios {
    @Override
    public Envio crearEnvio() {
        return new EnvioAereo();
    }
}
