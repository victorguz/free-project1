package com.free.project1.main.controller.mantenimiento;

import com.free.project1.main.interfaces.mantenimiento.IDepartamento;
import com.free.project1.main.interfaces.mantenimiento.IMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.IPersonalNew;
import com.free.project1.main.interfaces.mantenimiento.ITipoMantenimiento;
import com.free.project1.main.interfaces.mantenimiento.ITipoProcedimientoAdjudicado;
import com.free.project1.main.interfaces.mantenimiento.IUnidad;
import com.free.project1.main.model.mantenimiento.view.MantenimientoTableView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MantenimientosController {

    @Autowired
    private IMantenimiento _mnt;

    @Autowired
    private ITipoMantenimiento _tipo_mnt;

    @Autowired
    private IDepartamento _dptos;

    @Autowired
    private IUnidad _unidades;

    @Autowired
    private ITipoProcedimientoAdjudicado _procedimientos;

    @Autowired
    private IPersonalNew _personalnew;

    Logger LOG = LoggerFactory.getLogger(MantenimientosController.class);

    @GetMapping("/")
    public String home(Model model) {
        Pageable limit = PageRequest.of(0, 100000, Sort.by(Direction.DESC, "id_mantenimiento"));
        model.addAttribute("list", MantenimientoTableView.toView(_mnt.findAll(limit).getContent()));
        model.addAttribute("dptos", _dptos.findAllByUnidad("NULL"));
        model.addAttribute("unidades", _unidades.buscarUnidades());
        model.addAttribute("details_url", "/details");
        model.addAttribute("search_url", "/search");
        model.addAttribute("add_url", "/add");
        model.addAttribute("all_url", "/api/maintenances/all");
        model.addAttribute("total_url", "/api/maintenances/total");

        return "index";
    }

    @GetMapping("/details")
    public String details(Model model, @RequestParam int id) {
        model.addAttribute("update_url", "/update");
        model.addAttribute("add_url", "/add");
        model.addAttribute("mnt", _mnt.findById(id).get());
        return "details";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("dptos", _dptos.findAllByUnidad("NULL"));
        model.addAttribute("unidades", _unidades.buscarUnidades());
        model.addAttribute("procedimientos", _procedimientos.findAll());
        model.addAttribute("tipos", _tipo_mnt.findAll());
        model.addAttribute("update_url", "/update");
        model.addAttribute("add_url", "/add");
        return "add";
    }

    @PutMapping("/update")
    public String update(Model model) {
        return "update";
    }
}
