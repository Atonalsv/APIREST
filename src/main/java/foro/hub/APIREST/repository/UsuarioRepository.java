package foro.hub.APIREST.repository;

import foro.hub.APIREST.jpa.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<usuario, Long> {
    UserDetails findByNombre(String nombre);
}
