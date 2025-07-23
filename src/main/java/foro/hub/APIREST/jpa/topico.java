package foro.hub.APIREST.jpa;

import foro.hub.APIREST.datos.DatosRegistroTopico;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "topicos")
@Entity(name = "Topico")
public class topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensaje;

    private LocalDateTime fechaDeCreacion;

    //posible enum para STATUS si Trello lo indica mas adelante
    //@Enumerated(EnumType.STRING)
    private String status;

    private String autor;

    private String curso;

    private String respuesta;

    public topico(DatosRegistroTopico datos) {
        this.id = null;
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.fechaDeCreacion = datos.fechaDeCreacion();
        this.status = datos.status();
        this.autor = datos.autor();
        this.curso = datos.curso();
        this.respuesta = datos.respuesta();
    }

    public void actualizarInformaciones(@Valid DatosRegistroTopico datos) {
        if (datos.titulo() != null) {
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() != null) {
            this.mensaje() = datos.mensaje();
        }
        if (datos.fechaDeCreacion() != null) {
            this.fechaDeCreacion() = datos.fechaDeCreacion();
        }
        if (datos.status() != null) {
            this.status = datos.status();
        }
        if (datos.autor() != null) {
            this.autor = datos.autor();
        }
        if (datos.curso() != null) {
            this.curso = datos.curso();
        }
        if (datos.respuesta() != null) {
            this.respuesta = datos.respuesta();
        }
    }


}
