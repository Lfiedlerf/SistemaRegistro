package com.bootcamp.registro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;

// 1. Extendemos con Mockito para que las anotaciones funcionen
@ExtendWith(MockitoExtension.class)
class ServicioDeRegistroTest {

    // 2. Creamos el Mock (el "actor" que finge ser el notificador)
    @Mock
    Notificador notificadorMock;

    // 3. Inyectamos el mock dentro del servicio real
    @InjectMocks
    ServicioDeRegistro servicio;

    @Test
    @DisplayName("Debe enviar una notificación al registrar un usuario")
    void testRegistrarUsuarioEnviaNotificacion() {
        // ARRANGE (Preparar)
        Usuario usuarioNuevo = new Usuario("JuanPerez");

        // ACT (Actuar)
        servicio.registrar(usuarioNuevo);

        // ASSERT (Verificar)
        // Aquí preguntamos a Mockito: "¿Se llamó al método 'enviar' de tu mock?"
        verify(notificadorMock).enviar(anyString(), eq(usuarioNuevo));
    }
}