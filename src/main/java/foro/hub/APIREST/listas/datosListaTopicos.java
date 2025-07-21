package foro.hub.APIREST.listas;

import foro.hub.APIREST.jpa.topico;

public record datosListaTopicos(
        String titulo,
        String mensaje,
        String fechaDeCreación,
        String status,
        String autor,
        String curso

) {
    public datosListaTopicos (topico topico){
        this(
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaDeCreacion(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
