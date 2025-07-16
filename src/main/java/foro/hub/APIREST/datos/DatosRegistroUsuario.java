package foro.hub.APIREST.datos;

public record DatosRegistroUsuario(
        Long id,

        String nombre,

        String correoElectronico,

        String contrasena,

        String perfiles ) {
}
