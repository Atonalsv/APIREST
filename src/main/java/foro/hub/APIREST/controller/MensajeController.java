package foro.hub.APIREST.controller;

import foro.hub.APIREST.datos.DatosRegistroCurso;
import foro.hub.APIREST.datos.DatosRegistroMensaje;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {

    @PostMapping
    public void registrar (@RequestBody DatosRegistroMensaje datos) {
        System.out.println(datos);
    }


}
