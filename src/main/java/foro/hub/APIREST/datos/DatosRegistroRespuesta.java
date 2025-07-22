package foro.hub.APIREST.datos;

import java.time.LocalDateTime;

public record DatosRegistroRespuesta(
        Long id,

        String mensaje,

        String Topico,

        LocalDateTime fechaDeCreacion,

        String autor,

        String solucion ) {
}
