package foro.hub.APIREST.controller;

import foro.hub.APIREST.datos.DatosAutenticacion;
import foro.hub.APIREST.infra.security.DatosTokenJWT;
import foro.hub.APIREST.infra.security.TokenService;
import foro.hub.APIREST.jpa.usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.PasswordAuthentication;

@RestController
@RequestMapping("login")
public class authenticationController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity iniciarSesion(@RequestBody @Valid DatosAutenticacion datos) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(datos.nombre(),datos.contrasena());
        var tokenJWT = manager.authenticate(authenticationToken);

        return ResponseEntity.ok(new DatosTokenJWT(tokenJWT));


    }


}
