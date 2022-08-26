package com.ingles.examen.repository;

import com.ingles.examen.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

}