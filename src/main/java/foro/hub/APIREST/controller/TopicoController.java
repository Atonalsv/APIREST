package foro.hub.APIREST.controller;

import foro.hub.APIREST.datos.DatosRegistroTopico;
import foro.hub.APIREST.jpa.topico;
import foro.hub.APIREST.listas.datosListaTopicos;
import foro.hub.APIREST.repository.topicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private topicoRepository repository;

    @Transactional
    @PostMapping
    public void registrar(@RequestBody @Valid DatosRegistroTopico datos) {
        repository.save(new topico(datos));

    }

    @GetMapping
    public List<datosListaTopicos> listar() {
        return repository.findAll().stream().map(datosListaTopicos::new).toList();
    }


}
