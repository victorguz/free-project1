package com.free.project1.main.controller.usuario;

import java.util.List;

import com.free.project1.main.interfaces.mantenimiento.IMantenimiento;
import com.free.project1.main.interfaces.usuario.IUsuario;
import com.free.project1.main.model.mantenimiento.Mantenimiento;
import com.free.project1.main.model.usuario.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsuariosController {

    @Autowired
    private IUsuario repo;

    @GetMapping
    public List<Usuario> all() {
        return repo.findAll();
    }

    @PostMapping
    public void create(@RequestBody Usuario user) {
        repo.save(user);
    }

    @PutMapping
    public void update(@RequestBody Usuario user) {
        repo.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }
}
