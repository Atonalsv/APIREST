package foro.hub.APIREST.datos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

public record DatosRegistroTopico(
        @NotNull @UniqueElements String titulo,
        @NotNull @UniqueElements String mensaje,
        @NotNull String fechaDeCreacion,
        @NotNull String status,
        @NotNull String autor,
        @NotNull String curso,
        @NotNull String respuesta) {
}
