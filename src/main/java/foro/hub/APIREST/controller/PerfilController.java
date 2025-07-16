package foro.hub.APIREST.controller;

import foro.hub.APIREST.datos.DatosRegistroPerfil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfiles")
public class PerfilController {

    @PostMapping
    public void registrar (@RequestBody DatosRegistroPerfil datos) {
        System.out.println(datos);
    }

}
