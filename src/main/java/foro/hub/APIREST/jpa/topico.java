package foro.hub.APIREST.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "topicos")
@Entity(name = "Topico")
public class topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensaje;

    private String fechaDeCreacion;

    //posible enum para STATUS si Trello lo indica mas adelante
    //@Enumerated(EnumType.STRING)
    private String status;

    private String autor;

    private String curso;

    private String respuesta;
}
