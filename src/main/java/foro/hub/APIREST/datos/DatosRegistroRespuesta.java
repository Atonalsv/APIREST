package foro.hub.APIREST.datos;

public record DatosRegistroRespuesta(
        Long id,

        String mensaje,

        String Topico,

        String fechaDeCreacion,

        String autor,

        String solucion ) {
}
