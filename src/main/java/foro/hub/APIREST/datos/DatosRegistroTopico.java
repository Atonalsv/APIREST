package foro.hub.APIREST.datos;

public record DatosRegistroTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaDeCreacion,
        String status,
        String autor,
        String curso,
        String respuesta) {
}
