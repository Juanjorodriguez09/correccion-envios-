package com.ejemplo.envios;

public class FabricaEnvioTerrestre extends FabricaEnvios {
    @Override
    public Envio crearEnvio() {
        return new EnvioTerrestre();
    }
}
