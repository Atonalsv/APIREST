package foro.hub.APIREST.listas;

import foro.hub.APIREST.jpa.topico;
import foro.hub.APIREST.jpa.usuario;

import java.time.LocalDateTime;

public record datosListaTopicos(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaDeCreación,
        String status,
        String autor,
        String curso

) {
    public datosListaTopicos (topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaDeCreacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
