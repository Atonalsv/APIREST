package foro.hub.APIREST.controller;

import foro.hub.APIREST.datos.DatosRegistroRespuesta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    @PostMapping
    public void registrar (@RequestBody DatosRegistroRespuesta datos) {
        System.out.println(datos);
    }


}
