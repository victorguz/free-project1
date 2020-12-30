package com.free.project1.main.interfaces.usuario;

import com.free.project1.main.model.usuario.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

    public Usuario findByUsername(String username);

}
