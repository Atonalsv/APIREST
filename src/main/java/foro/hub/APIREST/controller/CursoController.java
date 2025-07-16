package foro.hub.APIREST.controller;

import foro.hub.APIREST.datos.DatosRegistroCurso;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @PostMapping
    public void registrar (@RequestBody DatosRegistroCurso datos) {
        System.out.println(datos);
    }


}
