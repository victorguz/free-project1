package com.free.project1.main.services.mantenimiento;

import java.util.List;

import com.free.project1.main.interfaces.mantenimiento.IMantenimiento;
import com.free.project1.main.model.mantenimiento.Mantenimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MantenimientosService
 */
@RestController
@RequestMapping("/api/maintenances")
public class MantenimientosService {
    @Autowired
    private IMantenimiento repo;

    @GetMapping
    public List<Mantenimiento> all() {
        return repo.findAll();
    }

    @PostMapping
    public void create(@RequestBody Mantenimiento maintenance) {
        repo.save(maintenance);
    }

    @PutMapping
    public void update(@RequestBody Mantenimiento maintenance) {
        repo.save(maintenance);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repo.deleteById(id);
    }

}