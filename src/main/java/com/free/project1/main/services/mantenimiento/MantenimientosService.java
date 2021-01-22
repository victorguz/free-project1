package com.free.project1.main.services.mantenimiento;

import java.util.List;

import com.free.project1.main.interfaces.mantenimiento.IDepartamento;
import com.free.project1.main.interfaces.mantenimiento.IDetalleMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.IMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.IUnidadEstructural;
import com.free.project1.main.model.mantenimiento.DetalleMantenimiento;
import com.free.project1.main.model.mantenimiento.Mantenimiento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    Logger LOG = LoggerFactory.getLogger(MantenimientosService.class);

    @Autowired
    private IMantenimiento _mto;

    @Autowired
    private IDetalleMantenimiento _detalleMto;

    @Autowired
    private IDepartamento _dptos;

    @GetMapping("/all")
    public List<Mantenimiento> all(@RequestParam int page, @RequestParam int perPage) {
        Pageable limit = PageRequest.of(page, perPage, Sort.by(Direction.DESC, "id"));
        return _mto.findAll(limit).getContent();
    }

    @GetMapping("/total")
    public Long total() {
        return _mto.count();
    }

    @GetMapping("/getDetail")
    public DetalleMantenimiento getDetalle(@RequestParam int id) {
        return _detalleMto.findById(id).get();
    }

    @GetMapping("/getUnidadesByDepartamento")
    public List<String> getUnidadesByDepartamento(@RequestParam String dpto) {
        Pageable unity_limit = PageRequest.of(0, 100000, Sort.by(Direction.ASC, "unidad"));
        return _dptos.selectUnidades(dpto, unity_limit);
    }

    @GetMapping("/getUnidades")
    public List<String> getUnidades() {
        Pageable unity_limit = PageRequest.of(0, 100000, Sort.by(Direction.ASC, "unidad"));
        return _dptos.selectUnidades(unity_limit);
    }

    // @GetMapping("/search")
    // public List<Mantenimiento> search(String text, String dpto, String unidad,
    // String estado, String contrato,
    // String expediente, String keyword) {

    // return _mto.findAll();
    // }

    // @PostMapping
    // public void create(@RequestBody Mantenimiento maintenance) {
    // _mto.save(maintenance);
    // }

    // @PutMapping
    // public void update(@RequestBody Mantenimiento maintenance) {
    // _mto.save(maintenance);
    // }

    // @DeleteMapping(value = "/{id}")
    // public void delete(@PathVariable("id") Integer id) {
    // _mto.deleteById(id);
    // }

}