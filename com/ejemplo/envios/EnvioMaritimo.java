package com.ejemplo.envios;

public class EnvioMaritimo implements Envio {
    @Override
    public String procesarEnvio() {
        return "Envío Marítimo: Paquete enviado por mar.";
    }
}
