package com.bootcamp.registro;

public class ServicioDeRegistro {
    private Notificador notificador;

    // Inyección de dependencias por constructor
    public ServicioDeRegistro(Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(Usuario usuario) {
        // 1. Lógica de guardar usuario (simulada)
        System.out.println("Guardando usuario en base de datos...");

        // 2. Lógica de notificación (lo que exige el test)
        notificador.enviar("Bienvenido a la plataforma", usuario);
    }
}