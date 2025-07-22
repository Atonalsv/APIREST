package foro.hub.APIREST.datos;

import foro.hub.APIREST.jpa.respuesta;
import foro.hub.APIREST.jpa.usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotNull @UniqueElements String titulo,
        @NotNull @UniqueElements String mensaje,
        @NotNull LocalDateTime fechaDeCreacion,
        @NotNull String status,
        @NotNull String autor,
        @NotNull String curso,
        @NotNull String respuesta) {
}
