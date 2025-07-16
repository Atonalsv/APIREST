package foro.hub.APIREST.controller;

import foro.hub.APIREST.datos.DatosRegistroUsuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @PostMapping
    public void registrar (@RequestBody DatosRegistroUsuario datos) {
        System.out.println(datos);
    }



}
