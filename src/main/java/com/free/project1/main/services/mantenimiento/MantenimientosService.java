package com.free.project1.main.services.mantenimiento;

import java.util.List;

import com.free.project1.main.interfaces.mantenimiento.IMantenimiento;
import com.free.project1.main.model.mantenimiento.Mantenimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * MantenimientosService
 */
@RestController
@RequestMapping("/api/maintenances")
public class MantenimientosService {

    @Autowired
    private IMantenimiento imnt;

    @GetMapping("/all")
    public List<Mantenimiento> all(@RequestParam int page, @RequestParam int perPage) {
        var limit = PageRequest.of(page, perPage, Sort.by(Direction.DESC, "id"));
        return imnt.findAll(limit).getContent();
        // return imnt.findAllOrderById(perPage);
    }

    @GetMapping("/total")
    public Long total() {
        return imnt.count();
        // return imnt.findAllOrderById(perPage);
    }

    @GetMapping("/search")
    public List<Mantenimiento> search() {
        return imnt.findAll();
        // return imnt.findAllOrderById(perPage);
    }

    @PostMapping
    public void create(@RequestBody Mantenimiento maintenance) {
        imnt.save(maintenance);
    }

    @PutMapping
    public void update(@RequestBody Mantenimiento maintenance) {
        imnt.save(maintenance);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        imnt.deleteById(id);
    }

}